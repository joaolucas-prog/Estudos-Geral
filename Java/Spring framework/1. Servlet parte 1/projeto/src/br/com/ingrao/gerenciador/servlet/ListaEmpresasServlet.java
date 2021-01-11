package br.com.ingrao.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ingrao.gerenciador.connection.Banco;
import br.com.ingrao.gerenciador.model.bean.Empresa;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresa.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
		
	}

}
