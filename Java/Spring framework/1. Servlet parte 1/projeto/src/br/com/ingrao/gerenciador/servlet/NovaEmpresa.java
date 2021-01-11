package br.com.ingrao.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ingrao.gerenciador.connection.Banco;
import br.com.ingrao.gerenciador.model.bean.Empresa;

/**
 * Servlet implementation class Empresa
 */
@WebServlet("/empresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Cadastrando nova empresa");
//		
//		/* Os parametros s�o passado na url e normalmente vem acompanhado depois da '?'nomeparametro=valor*/
//		String nomeEmpresa = request.getParameter("nome");//pegando o valor do parametro nome
//		PrintWriter out = response.getWriter();
//		out.println("<html><html>Empresa "+ nomeEmpresa + " cadastrada com sucesso</body></html>");
//		
		/* Metodo GET e POST
		 * 
		 * O M�todo GET � um metodo para enviar parametros pela url , por�m uma quantidade muito grande de parametros
		 * n�o ficaria muito vi�vel para isso tem o m�todo POST que envia de forma escondida os par�metros
		 * 
		 * O GET tem objetivo de receber algo
		 * 
		 * O POST tem objetivo de alterar alguma coisa
		 * 
		 * Podemos escolher aceitar apenas o post ou o get com os metodos doPost e doGet
		 * */
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeEmpresa = req.getParameter("nome");//pegando o valor do parametro nome
		String cnpj = req.getParameter("cnpj");
		PrintWriter out = resp.getWriter();
		Empresa empresa = new Empresa(nomeEmpresa,cnpj);
		Banco banco = new Banco();//Classe para simular um banco de dados
		banco.adiciona(empresa);
		
		//out.println("<html><html>Empresa "+ nomeEmpresa + " cadastrada com sucesso</body></html>");
		
		//chamar JSP
		
		
		//despachando a requisi��o para o jsp
		RequestDispatcher rd = req.getRequestDispatcher("/NovaEmpresaCriada.jsp");
		
		//enviando um atributo com chave empresa e valor empresa.getNome para a requisi��o
		req.setAttribute("empresa", empresa.getNome());
		
		//passando a requisi��o pra frente
		rd.forward(req, resp);
		
	}

	
}
