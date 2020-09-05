package com.formation.tp_03_septembre.models;



public class User {
	
	private String nom = "";
	private String prenom = "";
	private String email = "";
	private String mdp = "";
	
	public User(String nom, String prenom, String email, String mdp) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	public boolean isIfNotEmpty() {
		if (this.nom.isEmpty()) return false; 
		if (this.prenom.isEmpty()) return false; 
		if (this.email.isEmpty()) return false; 
		if (this.mdp.isEmpty()) return false; 
		 return true;	
		}
	
	public String forFile() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nom)
		.append(";")
		.append(this.prenom)
		.append(";")
		.append(this.email)
		.append(";")
		.append(this.mdp)
		.append("\n");
		return sb.toString();
	}
	
	
	
	
		
	}
	
	


