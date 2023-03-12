<!DOCTYPE html>
<html lang="eng">

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" href="card3.css">
	<title>Card</title>

</head>

<body>
	
    <div class="first-div">
        <div class = "card">
            <div class="foto">
                <img src="avatar.png" alt="foto alumno">
            </div>
            
            <div class="description">
                <h2>Alumno</h2>
                <h5>Nombre:</h5>
                <?php echo "<p>{$_POST["fname"]} {$_POST["lname"]}</p>";?>
                <h5>Edad:</h5>
                <?php echo "<p>{$_POST["age"]}</p>";?>
                <h5>Contacto:</h5>
                <?php echo "<p>{$_POST["mail"]}</p>";?>
            </div>

            <div class="logo"><img src="https://uveg.edu.mx/images/logo_2022.png" alt="logo uveg"></div>
        </div>
    </div>

</body>

</html>