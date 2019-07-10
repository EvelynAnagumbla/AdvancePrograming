
<?php
    $servidor = "localhost";
    $usuario = "root";
    $password ="12345678";
    $bd ="users";
    $mysqli = new mysqli($servidor, $usuario, $password, $bd);

    if($mysqli->connect_error){
        die ("error al conectar a la base de datos". $mysqli->connect_error);
    }
    
    $user =$_POST["user"];
    $user_type =$_POST["usertype"];
    $password =sha1($_POST["password"]);
    
    
    $buscarUsuario="SELECT * FROM user u WHERE u.user ='$user' ";
    $resultado = $mysqli->query($buscarUsuario);
    $count = mysqli_num_rows($resultado);
    
    if($count==1){
       echo "<br/>Usuario ya esta en uso <br/>";
       echo "<a  href ='SignIn.html'>Elija un nuevo usuario </a>" ;
    }else{

        $insertarUsuario="INSERT INTO `user`(`user`,`usertype`,`password`)VALUES('$user','$user_type','$password');
        ";

        if($mysqli->query($insertarUsuario)==true){
            mysqli_close($mysqli);
           
            echo "<center>"."<br/>"."<h1>"."Usuario Creado correctamente"."<h1>"."<center>";

            
        }else{
            mysqli_close($mysqli);
            echo "Error al crear el usuario".$insertarUsuario."<br>".$mysqli->error;
            
        }
        
        
    }

?>