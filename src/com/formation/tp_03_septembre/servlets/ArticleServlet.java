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

import com.formation.tp_03_septembre.models.Article;


@WebServlet("/articles")
public class ArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Article> articles = new ArrayList<>(Arrays.asList(
				new Article("/assets/img/image01.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image02.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image03.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image04.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image05.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image06.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image07.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme"),
				new Article("/assets/img/image08.jpg", "nike air max", "Nike Air Max 2009 BETRUE",
						"Chaussure pour homme")));

		request.setAttribute("template", "articles");
		request.setAttribute("articles", articles);
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
