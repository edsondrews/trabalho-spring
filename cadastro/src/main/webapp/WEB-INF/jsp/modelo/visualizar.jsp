<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Modelo</title>
</head>
<body>
	<form action="/modelo/alterar" method="post">
		<input type="hidden" name="codigo" value="${modelo.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		
		<a href="/modelo/listar">Cancelar</a> 
		<a href="/modelo/deletar/${modelo.codigo}">Deletar</a>

	</form>
</body>
</html>