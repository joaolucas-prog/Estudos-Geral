package br.com.ingrao.estudoutil.modelo;

import java.util.ArrayList;

public class Aula1 {
	
	public static void main(String[] args) {
		/* Array � uma estrutura de dados que armazena varios tipos de dados
		 * estrutura tipo[] nomeRef = new tipo[i];  i representa o tamanho do array*/
		
		int[] idades = new int[5];//inicializa com 0
		
		idades[0] = 12;//o array sempre come�a do 0 e vai at� o valor passado no parametro-1
		idades[1] = 23;
		idades[2] = 34;
		idades[3] = 43;
		
		System.out.println(idades[2]);
		//System.out.println(idades[6]);//ir� dar erro pois o array s� vai at� a posi��o 4
		
		/*ArrayList , um array melhor estruturado e mais utilizado , no java � mais comum utilzar o arraylist ao array
		 * pois ele possui funcionalidades que ajudam no processo de desenvolvimento
		 * 
		 * Estrutura
		 * 
		 * ArrayList<tipo> nomeRef = new ArrayList()<tipo>;
		 * Alguns metodos
		 * 
		 * .add(x) adiciona x ao arraylist lembrando que tipo x = <tipo>
		 * .size() retorna o tamanho do arraylist
		 * .get(i) devolve a referencia guardada na posi��o i
		 * */
		
		
		
		/* um for diferent�o*/
		
		ArrayList<String> teste = new ArrayList<String>();
		teste.add("teste1");
		teste.add("Alguma coisa");
		teste.add("kakak");
		
		// for comum
		for(int i = 0; i<teste.size(); i++) {
			System.out.println(teste.get(i));
		}
		
		//for diferent�o
		for(Object oRef: teste){
			System.out.println(oRef);
		}
	}
}
