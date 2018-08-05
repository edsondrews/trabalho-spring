<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Marcas</title>
</head>
<body>

	<a href="/modelo/novo">Nova Modelo</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Marca</th>
				<th>Versao</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${modelos}" var="modelo">
				<tr>
					<td><a href="/modelo/visualizar/${modelo.codigo}">${modelo.codigo}</a>
					</td>
					<td>${modelo.nome}</td>
					<td>${modelo.marca.nome}</td>
					<td>${modelo.versao.nome}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>