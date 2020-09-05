<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Oxygen&display=swap" rel="stylesheet">
<link rel="stylesheet" href="${ pageContext.request.contextPath }/assets/css/style.css">
<title> Nike - Index </title>
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