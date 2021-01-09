package br.com.ingrao.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Empresa
 */
@WebServlet("/empresa")
public class Empresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		/* Os parametros são passado na url e normalmente vem acompanhado depois da '?'nomeparametro=valor*/
		String nomeEmpresa = request.getParameter("nome");//pegando o valor do parametro nome
		PrintWriter out = response.getWriter();
		out.println("<html><html>Empresa "+ nomeEmpresa + " cadastrada com sucesso</body></html>");
		
		/* Metodo GET e POST
		 * 
		 * O Método GET é um metodo para enviar parametros pela url , porém uma quantidade muito grande de parametros
		 * não ficaria muito viável para isso tem o método POST que envia de forma escondida os parâmetros
		 * */
	}

}
