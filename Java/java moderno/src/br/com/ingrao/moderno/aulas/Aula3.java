package br.com.ingrao.moderno.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Aula3 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("primeira aula");
		palavras.add("textos aleatorios");
		palavras.add("hello world");

		// usando java 8 moderno
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//diminuindo ainda mais
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));//deixa mais claro , pois dado um objeto faça um metodo desse objeto(method reference)
		/* é equivalente a*/
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
		System.out.println(palavras);

		palavras.forEach(s -> System.out.println(s));
		//porra louca agora vê que coisa bugadora
		palavras.forEach(System.out::println);
	}

}
