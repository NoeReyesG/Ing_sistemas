<!--
	Programación Web
	Reto 5.
	Programemos en PHP.

	Nombre completo       |  Noé Macario Reyes González
	Fecha de elaboración  |  11/11/2022
	Matrícula			  |  21019163
	Nombre del asesor     |  Aldo Ezequiel Valenzuela García
	  
-->

<!DOCTYPE html>
<html lang="eng">

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" href="index3.css">
	<title>Formulario</title>

</head>

<body>
	
	<div>
		<section class="header-form">
			<div>
				<h3>Registrar</h3>
				<h3>Alumno</h3>
			</div>
			<div class="img-container"><img src="https://uveg.edu.mx/images/logo_2022.png" alt="logo uveg"></div>
		</section>	
		<div>
			<form action ="card.php" method="post">
				<label for="fname">Nombre: </label>
				<input type="text" id="fname" name="fname" autofocus required>
				<label for="lname">Apellidos: </label>
				<input type="text" id="lname" name="lname" required>
				<label for="age">Edad: </label>
				<input type="number" min = "1" max = "100" id="age" name="age" required>
				<label for="mail">Email: </label>
				<input type="email" id="mail" placeholder="nombre@ejemplo.com" name="mail" required>
				<label for="password">Password: </label>
				<input type="password" id="password" required>
				<input type="submit" id="guardar" value="Registrar">
			</form>
		</div>
	</div>

</body>

</html>