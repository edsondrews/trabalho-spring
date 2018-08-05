<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Ano</title>
</head>
<body>

	<a href="/versao/novo">Novo Ano</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Ano</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${anoss}" var="versao">
				<tr>
					<td>
						<a href="/ano/visualizar/${ano.codigo}">${ano.codigo}</a>
					</td>
					<td>${ano.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>