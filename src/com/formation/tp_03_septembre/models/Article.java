package com.formation.tp_03_septembre.models;

public class Article {
	
	private String link;
	private String alt;
	private String title;
	private String description;
	
	
	public Article(String link, String alt, String title, String description) {
		super();
		this.link = link;
		this.alt = alt;
		this.title = title;
		this.description = description;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getAlt() {
		return alt;
	}


	public void setAlt(String alt) {
		this.alt = alt;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
