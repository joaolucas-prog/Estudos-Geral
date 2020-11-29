alert("Hello World");

/*
    O JavaScript tem tipagem dinamica , então não precisamos escrever qual o tipo da variável ,pois ela
    converte pr de baixo dos panos automaticamente isso
*/

var nome = "João Lucas";//String
var numero1 = 10;//int
var numero2 = 10.5 ;// float/double

/* Podemos fazer operações com as String e também com os numericos*/

console.log(nome.replace("João","José"));
console.log(nome.toUpperCase());
console.log(numero1*numero2);

// Array e Dicionario

//Array
var lista = ["maça","uva","pera"];
console.log(lista[0]);//mostra primeiro elemento
lista.push("laranja");//adiciona elemento
console.log(lista);
lista.pop();//remove  ultimo elemento
console.log(lista.length);//tamanho da lista
console.log(lista.reverse());//inverso da lista
console.log(lista.toString());// "String" de elementos
console.log(lista.join(" "));// mostra a lista separada pelo argumento do join

//Dicionario

var fruta = {nome:"maça", cor:"vermelho"};//chave-valor
console.log(fruta.nome)//não utiliza index usa o valor da chave para buscar o valor

//lista de dicionarios

var frutas = [{nome:"maça", cor:"vermelho"},{nome:"uva", cor:"verde"}];

console.log(frutas[0]);
console.log(frutas[1]);

//Condicionais , laços de repetição e Date

var idade = prompt("Qual sua idade");//prompt faz uma pergunta e joga a resposta da pergunta na idade
if (idade >= 18){
    console.log("maior de idade");
}else {
    console.log("menor de idade");
}

var count = 0;

while(count <5){
    console.log(count)
    count+=1;
}

for(var i =0; i < 5; i++){
    console.log(i);
}

var d = new Date();
alert(d);//cria uma data no horario do seu pc

console.log(d.getDate());// dias
d.getMonth+1 ;// mes , +1 pois começa do 0