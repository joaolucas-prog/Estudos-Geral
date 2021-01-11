<!--   
/* Um arquivo jsp é um arquivo java serve page , em que é nada mais que um arquivo html que podemos utilizar
código java , esse código java será interpretado pelo servidor e ele é representado no código html
pela tag %*/

	String empresa = (String)request.getAttribute("empresa");
	//pegando um atributo que fi enviado no request

// para mostrar a variável no código html usamos out.prinln(); mas existe um apelido que é o %=

-->
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Nova Página Criada</title>
</head>
<body>
	Empresa ${ empresa } cadastrada com sucesso!
	<!-- Usando linguagem de expressão	procura a requisição e olha se existe o atributo empresa -->
</body>
</html>