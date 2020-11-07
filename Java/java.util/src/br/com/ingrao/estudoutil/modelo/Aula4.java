package br.com.ingrao.estudoutil.modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class Aula4 {
	/*Ordenando Listas
	 * 
	 * Podemos ordenar nossas listas  porem o java não sabe qual o criterio de comparação , para isso devemos implementar
	 * uma classe que herdarar o comparator e que possui apenas um metodo. Nesta classe você deve implementar o metodo compare
	 * e escrever como será a comparação entre os objetos*/
	public static void main(String[] args) {
		Aula2 t1 = new Aula2("joao");
		Aula2 t2 = new Aula2("ingrid");
		Aula2 t3 = new Aula2("jose");
		Aula2 t4 = new Aula2("Ana");
		
		ArrayList<Aula2> lista = new ArrayList<Aula2>();
		
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		lista.add(t4);
		
		Compara comparador = new Compara();
		
		for(Aula2 a: lista) {
			System.out.println(a.getNome());
		}
		
		lista.sort(comparador);//metodo que ordena baseado na classe comparadora
		System.out.println("-----------");
		
		for (Aula2 aula2 : lista) {
			System.out.println(aula2.getNome());
		}
	}
}

class Compara implements Comparator<Aula2>{//implementando a classe comparadora
	
	@Override
	public int compare(Aula2 a1, Aula2 a2) {
		if(a1.getNome().length() >= a2.getNome().length()) {//condição de comparação
			return 1;
		}		
		return -1;
	}

	
}