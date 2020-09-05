<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/assets/css/style.css">
<title>Nike - Index </title>
</head>
<body>
	<div class="container">

		<c:import url="layouts/menu.jsp" />

		<c:if test="${ not empty template }">
		<c:import url="pages/${ template }.jsp" />
		</c:if>
	
		<c:import url="layouts/footer.jsp" />

	</div>

</body>
</html>