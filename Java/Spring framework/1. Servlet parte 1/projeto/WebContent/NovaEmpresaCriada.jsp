<!--   
/* Um arquivo jsp � um arquivo java serve page , em que � nada mais que um arquivo html que podemos utilizar
c�digo java , esse c�digo java ser� interpretado pelo servidor e ele � representado no c�digo html
pela tag %*/

	String empresa = (String)request.getAttribute("empresa");
	//pegando um atributo que fi enviado no request

// para mostrar a vari�vel no c�digo html usamos out.prinln(); mas existe um apelido que � o %=

-->
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Nova P�gina Criada</title>
</head>
<body>
	Empresa ${ empresa } cadastrada com sucesso!
	<!-- Usando linguagem de express�o	procura a requisi��o e olha se existe o atributo empresa -->
</body>
</html>