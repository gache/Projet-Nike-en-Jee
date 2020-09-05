package com.formation.tp_03_septembre.servlets;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formation.tp_03_septembre.models.User;

@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("template", "inscription");

		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String mdp = request.getParameter("mpd");

		User user = new User(nom, prenom, email, mdp);
		
		if (user.isNotEmpty()) {
			this.writeUserInFile(user);
			response.sendRedirect(request.getContextPath() + "/");
		}else {
			request.setAttribute("user",user); // ça evite que l'utilisateur perd l'info du formulaire
			doGet(request, response);			
		}

	}

	private void writeUserInFile(User user) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/erickfranco/eclipse-workspace/Tp_Jee_03_Septembre/user", true))) {
			System.out.println(user.forFile());
			bw.write(user.forFile());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
