package com.formation.tp_03_septembre.servlets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formation.tp_03_septembre.models.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("template", "login");

		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String mdp = request.getParameter("mpd");

		User user = new User(email, mdp);

		if (user.getEmail().isBlank() && user.getMdp().isBlank()) {
			if ((readUserFile(user)) != null) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect(request.getContextPath() + "/");
				return;
			}
			doGet(request, response);
		} else {
			doGet(request, response);
		}

	}

	// lire le fichier user

	private User readUserFile(User user) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("/Users/erickfranco/eclipse-workspace/Tp_Jee_03_Septembre/user"))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				User u = user.toUser(line);
				if (u.getEmail().equals(user.getEmail()) && u.getMdp().equals(user.getMdp())) {
					return u;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
