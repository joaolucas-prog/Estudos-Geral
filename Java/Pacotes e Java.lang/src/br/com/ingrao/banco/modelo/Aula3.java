package br.com.ingrao.banco.modelo;

public class Aula3 {
	/* Em java existe uma classe especial em que todas as outras classes herdam que é o Object, com isso podemos sobreescrever
	 * alguns metodos do Object ao nosso favor por exemplo toString
	 * 
	 * toString
	 * 	o metodo toString ele permite dizer oque vai ser impresso no meu print*/
	public static void main(String[] args) {
		Aula3 t = new Aula3();
		System.out.println(t);
	}
	
	@Override
	public String toString() {
		return "Exemplo reescrita toString";
	}
}
