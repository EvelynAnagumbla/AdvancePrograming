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
    $password =sha1($_POST["password"]);
    
    
    $buscarUsuario="SELECT * FROM user u WHERE u.user ='$user' and u.password ='$password' ";
    $resultado = $mysqli->query($buscarUsuario);
    $count = mysqli_num_rows($resultado);
    
    if($count==1){
       echo "<center>"."<h1>"."<br/>Usuario Si Exixte  <br/>"."</h1>"."</center>";
       echo "<center>"."<a  href ='SignIn.html'>Elija un nuevo usuario </a>"."</center>" ;
    }else{

        echo "<center>"."<h1>"."<br/>Error de Usuario o Contraseña <br/>"."</h1>"."</center>";
       echo "<center>"."<a  href ='SignIn.html'>Elija un nuevo usuario </a>"."</center>" ;

    }

?>
