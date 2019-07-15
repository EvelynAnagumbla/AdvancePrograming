
<?php

    $vari=$_GET['variance'];
            $men=$_GET['mean'];
            $size=$_GET['size'];
      $intersuper =  ( $men+ 1.96 * ($vari / sqrt($size)));
      $interinfer =  ( $men- 1.96 * ($vari /sqrt($size)));
	echo  "Intervalo esta[$interinfer,$intersuper]";three
?>