package br.com.ingrao.collections.aulas;

import java.util.Optional;
import java.util.OptionalDouble;

public class Aula10 {
/* Comparators
 * 
 * java.util.Comparator Interface para definir classe com regra de ordena��o
 * java.util.Comparable Interface para definir regra de ordena��o em uma classe de dominio*
 * 
 * Optional
 * Tratamento para valores que podem ser nulos
 * Existe dois estados vazio e presente. 
 * Permite que voc� execute opera��es que podem ser nulos sem preocupa��o com as famosas nullpointerexceptions
 */
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Valor presente");//o metodo .of exige que o valor passado n�o seja nulo, se nao ocorrerar um nullpointer
		
		System.out.println("Valor opcional que est� presente");
		//optionalString.(System.out::println , System.out.println("n�o est� presente"));
		// metodo s� existe no java 10 :( , ele imprime o primeiro parametro se esta presente , else segundo parametro
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		//melhor metodo para criar optional "eu acho" , pois se existir ele retorna present caso contrario cria um empty()
		System.out.println(optionalNull.isPresent());
		
		Optional emptyOpitional = Optional.empty();//cria um optinal n�o presente sem erro nullpoint	
	
	}
}
