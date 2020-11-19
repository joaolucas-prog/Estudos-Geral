package br.com.ingrao.collections.aulas;

import java.util.Optional;
import java.util.OptionalDouble;

public class Aula10 {
/* Comparators
 * 
 * java.util.Comparator Interface para definir classe com regra de ordenação
 * java.util.Comparable Interface para definir regra de ordenação em uma classe de dominio*
 * 
 * Optional
 * Tratamento para valores que podem ser nulos
 * Existe dois estados vazio e presente. 
 * Permite que você execute operações que podem ser nulos sem preocupação com as famosas nullpointerexceptions
 */
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Valor presente");//o metodo .of exige que o valor passado não seja nulo, se nao ocorrerar um nullpointer
		
		System.out.println("Valor opcional que está presente");
		//optionalString.(System.out::println , System.out.println("não está presente"));
		// metodo só existe no java 10 :( , ele imprime o primeiro parametro se esta presente , else segundo parametro
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		//melhor metodo para criar optional "eu acho" , pois se existir ele retorna present caso contrario cria um empty()
		System.out.println(optionalNull.isPresent());
		
		Optional emptyOpitional = Optional.empty();//cria um optinal não presente sem erro nullpoint	
	
	}
}
