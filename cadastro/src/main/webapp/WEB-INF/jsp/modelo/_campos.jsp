<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="nome"> Nome: </label>
<input type="text" name="nome" id="nome" value="${modelo.nome}">
<form:errors path="modelo.nome" />


<label for="marca">Marca</label>
<select id="marca" name="marca.codigo">
	<c:forEach items="${marcas}" var="marca">
		<c:set var="selecionado" value="" />
		<c:if test="${marca.codigo eq modelo.marca.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${marca.codigo}" ${selecionado}>${marca.nome}
	</c:forEach>

</select>
	<label for="versao">Versao</label>
	<select id="versao" name="versao.codigo">
		<c:forEach items="${versaos}" var="versao">
			<c:set var="selecionado" value="" />
			<c:if test="${versao.codigo eq modelo.versao.codigo}">
				<c:set var="selecionado" value="selected" />
			</c:if>
			<option value="${versao.codigo}" ${selecionado}>${versao.nome}
		</c:forEach>
</select>