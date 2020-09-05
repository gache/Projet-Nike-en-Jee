package com.formation.tp_03_septembre.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		List<Article> articles = new ArrayList<>(Arrays.asList(
//				new Article("img/image01.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image02.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image03.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image04.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image05.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image06.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image07.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme"),
//				new Article("img/image08.jpg", "Nike Rise 365 Blue Ribbon Sports", " Haut de running pour Homme")
//				));

//		request.setAttribute("articles", articles);
//		request.setAttribute("template", "article");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp")
		.forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		doGet(request, response);
//	}

}
