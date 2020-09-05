<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<section id="formulaire">
	<form method="post"
		action="${ pageContext.request.contextPath }/inscription">
		<div>
			<label for="name"> Nom</label> <input id="name" type="name"
				placeholder="Nom" required size="100" autofocus name="nom"
				value="${ user.nom }">
		</div>

		<div>
			<label for="prenom"> Prénom</label> <input id="prenom" type="prenom"
				placeholder="Prénom" required size="100" autofocus name="prenom"
				value="${ user.prenom }>
		</div>

		<div>
			<label for="email"> Email</label> <input id="email" type="email"
				placeholder="Email" required size="100" autofocus name="email" value="${ user.email }>
		</div>

		<div>
			<label for="mdp"> Mot de passe</label> <input id="mdp" type="mdp"
				placeholder="Mot de passe" required size="100" autofocus name="mdp" >
		</div>
		<div>
			<button type="submit">Valider</button>
		</div>
	</form>
</section>