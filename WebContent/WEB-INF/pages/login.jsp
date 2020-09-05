<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section id="formulaire">
	<form method="post" action="${ pageContext.request.contextPath }/login" >
		<div>
			<label for="email"> Email</label> <input id="email" type="email"
				placeholder="Email" required size="100" autofocus name="email" >
		</div>

		<div>
			<label for="mdp"> Mot de passe</label> <input id="mdp" type="password"
				placeholder="Mot de passe" required size="100" autofocus name="mdp" >
		</div>
		<div>
			<button type="submit">Valider</button>
		</div>
	</form>
</section>