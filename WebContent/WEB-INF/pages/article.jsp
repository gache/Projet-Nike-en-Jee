<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<section id="articles">

<c:forEach var="article" items="${ articles }" >
	<c:out value="${ article.image }" />
	<c:out value="${ article.titre }" />
	<c:out value="${ article.description }" />
	<article >
		<figure>
			<img src="${ pageContext.request.contextPath } ${article.link}"  alt="${article.alt}">
			<figcaption>
				<h3>${article.title}</h3>
				<p> ${article.description}</p>
			</figcaption>
		</figure>
	</article>
	</c:forEach>
</section>

