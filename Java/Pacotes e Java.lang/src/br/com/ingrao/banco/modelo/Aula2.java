package br.com.ingrao.banco.modelo;

public class Aula2 {
	public static void main(String[] args) {
		/* a biblioteca java.lang � importada automaticamente pelo Java , dentre suas funcionalidades existe a string
		 * Nada impede de criar um String string = new String("ol� mundo"); , mas � uma ma praticao ideal � String string = "ol� mundo";
		 * 
		 * A string � um objeto imutavel, ou seja uma vez criada a string sempre ser� a mesma
		 * 
		 * Alguns metodos
		 * .replace(a,b) substitui os valores de a por b
		 * .toUpperCase() transforma todas as letras em maiusculas
		 * .toLowerCase() transforma todas as letras em minuscula
		 * .charAt(i) devolve o caracter na posi��o i
		 * .indexOf(a) devolve a posi��o em que foi encontrado o valor de a
		 * .substring(i,j) devolve uma substring a partir do valor i at� o j caso s� passe o i ir� at� o final
		 * .lenght() tamanho da string
		 * .isEmpty() devolve um booleano verificando se a String � vazia
		 * .trim() retira todos os espa�os do inicio e do fim
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
