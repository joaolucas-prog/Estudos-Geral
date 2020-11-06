package br.com.ingrao.banco.modelo;

public class Aula2 {
	public static void main(String[] args) {
		/* a biblioteca java.lang é importada automaticamente pelo Java , dentre suas funcionalidades existe a string
		 * Nada impede de criar um String string = new String("olá mundo"); , mas é uma ma praticao ideal é String string = "olá mundo";
		 * 
		 * A string é um objeto imutavel, ou seja uma vez criada a string sempre será a mesma
		 * 
		 * Alguns metodos
		 * .replace(a,b) substitui os valores de a por b
		 * .toUpperCase() transforma todas as letras em maiusculas
		 * .toLowerCase() transforma todas as letras em minuscula
		 * .charAt(i) devolve o caracter na posição i
		 * .indexOf(a) devolve a posição em que foi encontrado o valor de a
		 * .substring(i,j) devolve uma substring a partir do valor i até o j caso só passe o i irá até o final
		 * .lenght() tamanho da string
		 * .isEmpty() devolve um booleano verificando se a String é vazia
		 * .trim() retira todos os espaços do inicio e do fim
		 * .contains(a) devolve um booleano verificando se a String contem a substring a*/
		
		String teste = " Algum texto ";
		
		System.out.println(teste.replace('A', 'a'));//imprime algum texto
		System.out.println(teste.toUpperCase());
		System.out.println(teste.toLowerCase());
		System.out.println(teste.charAt(2));
		System.out.println(teste.indexOf("xto"));
		System.out.println(teste.substring(3));
		System.out.println(teste.length());
		System.out.println(teste.isEmpty());
		System.out.println(teste.trim());
		System.out.println(teste.contains("gum"));
		
		
	}
}
