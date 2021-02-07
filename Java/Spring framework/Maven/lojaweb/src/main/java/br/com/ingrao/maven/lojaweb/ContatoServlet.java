package br.com.ingrao.maven.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet implements Serializable{
	
	private static final long serialVersionUID = 5543833665353428213L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter	writer = resp.getWriter();
		writer.println("<html><h2>Entre em Contato</h2></html>");
		writer.close();
	}

}
