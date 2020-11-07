package br.com.ingrao.estudoutil.modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class Aula6 {
	/*
	 * Classe anonima Vimos que para fazer uma ordena��o usamos uma classe
	 * comparator e precisamos implementa-la , mas podemos fazer sua implementa��o
	 * no proprio argumento , essa implementa��o no proprio argumento � a classe
	 * anonima no java
	 * 
	 * lista.sort( new Comparator<String>(){
	 * 
	 * @Override public int compare(String args0, String args1) { return
	 * args0.compareTo(args1); } };
	 * );
	 * 
	 * Perceba que torna-se uma sintaxe muito estranha e bastante de dificil de ler,
	 * eu s� quero definir dois parametros e implementar o c�digo do metodo. Para
	 * isso podemos utilizar a lambda , que faz todo esse processo por baixo dos
	 * panos
	 * 
	 * lista.sort((Conta args0, Conta args1) -> {
			return Integer.compare(args0.getNumero(), args1.getNumero());
		});
		
		Veja que a visualiza��o ja melhorou bastante , mas ainda da para melhorar , como s� temos uma linha podemos fazer:
		
	 * 
	 * 
	 * Intera��o com foreach e lambdas
	 * 
	 * lista.forEach((conta) -> System.out.println(conta.numero));
	 */
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta t = new Conta(3);
		Conta k = new Conta(1);
		Conta y = new Conta(2);
		
		lista.add(t);
		lista.add(k);
		lista.add(y);
		
		lista.sort( ( args0, args1) -> Integer.compare(args0.getNumero(), args1.getNumero()) );
		
		lista.forEach((conta) -> System.out.println(conta.getNumero()));
	}
	}

class Conta{
	private int numero;
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
}