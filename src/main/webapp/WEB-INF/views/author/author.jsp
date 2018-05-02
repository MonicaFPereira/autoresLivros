<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <title>Rest - Authors</title>
    <link rel="stylesheet" type="text/css"  href="<c:url value="assets/css/reset.css" />">
    <link rel="stylesheet" type="text/css" 	href="<c:url value="assets/css/index.css" />">
</head>
<body>
	<header>
		<div class="container">
			<h2 class="titulo">Authors - Rest </h2>
		</div>
	</header>

<section class="container">
	<h2>Authors</h2>
	  <label for="filtrar-tabela">Filter:</label>
      <input type="text" name="filtro" id="filtrar-tabela" placeholder="Enter the first name">
	<table id="table-authors">
		<thead>
			<tr class="author">
				<th>Id</th>
				<th>Fisrt Name</th>
				<th>Last Name</th>
			</tr>
		</thead>
	</table>
    <button id="list-author" class="botao bto-principal">List</button>
</section>

<section class="container">
	<h2 >New Authors</h2>
	<ul id="message-err">
    </ul>
	<form id="form-add">	  
		<div class="grupo">
			<label for="id">Id:</label> <input id="id" name="id"
				type="text" placeholder="Enter id author"
				class="campo">
		</div>  
		<div class="grupo">
			<label for="firstName">Fisrt Name:</label> <input id="firstName" name="firstName"
				type="text" placeholder="Enter the first name"
				class="campo">
		</div>
		<div class="grupo">
			<label for="lastName">Last Name:</label> <input id="lastName" name="lastName"
				type="text" placeholder="Enter the last name"
				class="campo campo-medio">
		</div>
		<button id="add-author" class="botao bto-principal">Add</button>
	</form>

</section>

	<script src="<c:url value="assets/js/listAuthor.js" />"></script>
	<script src="<c:url value="assets/js/filtra.js" />"></script>
	<script src="<c:url value="assets/js/form.js" />"></script>
	<script src="<c:url value="assets/js/validateForm.js" />"></script>
	
</body>
</html>