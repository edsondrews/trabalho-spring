<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Marcas</title>
</head>
<body>

	<a href="/marca/novo">Nova Marca</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${marcas}" var="marca">
				<tr>
					<td>
						<a href="/marca/visualizar/${marca.codigo}">${marca.codigo}</a>
					</td>
					<td>${marca.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>