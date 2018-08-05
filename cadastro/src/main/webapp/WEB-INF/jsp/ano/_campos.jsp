<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="nome"> Nome: </label>
<input type="text" name="nome" id="nome" value="${ano.nome}">
<form:errors path="ano.nome" />

</select>