/*Função*/

function soma(a,b){
    return a + b;
}
//alert(soma(2,3));

/*
Variaveis globais : variaveis que estão fora dos metodos
variavel local : variavel que só existe dentro do metodo
*/

/* Manipulando elementos da página*/

function clicou(){
    document.getElementById("h3").innerHTML = "<p>Obrigado por clicar</p>";//adicionando conteudo ao elemento

   // console.log(document.getElementById("h3"));//pegando elemento pelo id
    //alert("Clicou");
}
//window.open("link") abre algum link
//window.location.href = abre o link na mesma janela

function trocar(elemento) {
   // document.getElementById("mousemove").innerHTML = "Obrigado por passar o mouse";
   elemento.innerHTML = "Obrigado por passar o mouse";
}

function voltar(elemento){
    elemento.innerHTML = "Passe o mouse";
}
function change(elemento){
    console.log(elemento.value);
}