<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar Modelo</title>
</head>
<body>
	<form action="/versao/alterar" method="post">
		<input type="hidden" name="codigo" value="${versao.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button>
		
		<a href="/versao/listar">Cancelar</a> 

	</form>
</body>
</html>