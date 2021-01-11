<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.ingrao.gerenciador.model.bean.Empresa" %>
<!-- @ é a anotação da página , e utilizo import para importar classes do projeto -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Lista das empresas Cadastradas</title>
</head>
<body>
	
		<ul>
		<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : lista) {
		%>
		<li> <%=empresa.getNome()%> </li>
		
		<%
		}
		%>
		</ul>
	
</body>
</html>