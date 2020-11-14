package br.com.ingrao.moderno.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Aula2 {

	/*
	 * lambdas As lambdas elas substituiem as interfaces funcionais que recebem um
	 * parametro e retorna outro parametro compativeis com a lambda
	 */
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("primeira aula");
		palavras.add("textos aleatorios");
		palavras.add("hello world");

		// usando java 8 moderno
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);

		// forma antiga
//		Consumer<String> consumidor = new Consumer<String>(){//criando classe anonima que implementa 1 metodo
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};
		// outra forma mas tambem antiga

//		palavras.forEach(
//				new Consumer<String>() {
//					@Override
//					public void accept(String s) {
//						System.out.println(s);
//					}
//				}
//				);

		// forma moderna
		palavras.forEach(s -> System.out.println(s));
	}
}
