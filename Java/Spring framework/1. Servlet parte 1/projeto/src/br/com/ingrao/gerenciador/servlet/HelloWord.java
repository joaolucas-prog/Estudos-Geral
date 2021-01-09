package br.com.ingrao.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns ="/hello")
//configuração da url
public class HelloWord extends HttpServlet {
	
	//sobrescrevendo service do servlet basta escrever service ctrl+ espaço
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//HttpServletRequest objeto que representa a requisição do sistema
		//HttpServletResponse objeto que representa a resposta do sistema 
		
		//utilizando uma resposta de caracteres
		PrintWriter out = resp.getWriter();
		//reposta na pagina web
		out.println("<html><body>Hello World!</body</html>");
		
		
	}
	
}
