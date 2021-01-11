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
//		/* Os parametros são passado na url e normalmente vem acompanhado depois da '?'nomeparametro=valor*/
//		String nomeEmpresa = request.getParameter("nome");//pegando o valor do parametro nome
//		PrintWriter out = response.getWriter();
//		out.println("<html><html>Empresa "+ nomeEmpresa + " cadastrada com sucesso</body></html>");
//		
		/* Metodo GET e POST
		 * 
		 * O Método GET é um metodo para enviar parametros pela url , porém uma quantidade muito grande de parametros
		 * não ficaria muito viável para isso tem o método POST que envia de forma escondida os parâmetros
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
		
		
		//despachando a requisição para o jsp
		RequestDispatcher rd = req.getRequestDispatcher("/NovaEmpresaCriada.jsp");
		
		//enviando um atributo com chave empresa e valor empresa.getNome para a requisição
		req.setAttribute("empresa", empresa.getNome());
		
		//passando a requisição pra frente
		rd.forward(req, resp);
		
	}

	
}
