<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Chandan"></c:set>
	<h1><c:out value="${name}"></c:out></h1>
	
	<c:if test="${3>2}">
	<h1>This is true block 3>2</h1>
	</c:if>
	
	<p:out value="${35+56}"></p:out>
</body>
</html>