package br.com.ingrao.moderno.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Aula1 {
	/*Metodo default
	 * no java 8 foi criado os metodos default nas interfaces , ela permite criar metodos concretos e que sejam herdados*/
	public static void main(String[] args) {
		/*forma antiga*/
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("primeira aula");
		palavras.add("textos aleatorios");
		palavras.add("hello world");
		
//		Collections.sort(palavras); //podendo passar uma classe comparator no metodo
//		System.out.println(palavras);
//		
		//forma moderna
		Comparator<String> comparador = new ComparaTamanho();
		palavras.sort(comparador);//usando null para usar a ordem natural
		System.out.println(palavras);
		/*Iteração em cada elemento*/
		
		//forma antiga
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
//		
		//forma moderna
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
	
	
}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
	
}

class ComparaTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() > s1.length()) 
			return 1;
		if(s1.length() < s2.length())
			return -1;
		return 0;
	}
	
}