package br.com.ingrao.moderno.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.ingrao.moderno.projeto.Curso;

public class Aula5 {
	public static void main(String[] args) {
		Curso c1 = new Curso("Python", 14);
		Curso c2 = new Curso("JavaScript", 30);
		Curso c3 = new Curso("Java", 10);
		Curso c4 = new Curso("C", 4);

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		// Ganhamos muito com essa nova introdução. Assim não precisamos
		// escrever aqueles diversos ifs garantindo que o objeto não é
		// nulo, temos uma forma muito mais interessante de representar
		// nossas intenções. A classe Optional nos oferece uma variedade
		// imensa de novos métodos que nos permite trabalhar de forma
		// funcional com nossos valores, tirando maior proveito dos
		// novos recursos de default methods, lambdas e method
		// reference. Você pode ler mais sobre essa API em sua
		// documentação:

		// http:docs.oracle.com/javase/8/docs/api/java/util/Optional.html
		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() > 10).findAny();// encontre 1

		Curso curso = optionalCurso.orElse(null);// encontre um curso ou devolva null
		System.out.println(curso.getNome());

		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));// se existir um curso imprima
		// lembrando que está separado para facilitar mas pode concatenar

		/*
		 * cursos.stream() .filter(c -> c.getAlunos > 10) .findAny .ifPresent(c ->
		 * System.out.println(c.getNome()));
		 */
		
		
		// transformando stream em optionaldouble e tirando media
		OptionalDouble media = cursos.stream().filter(c -> c.getAlunos() > 10).mapToInt(Curso::getAlunos).average();
		System.out.println(media.getAsDouble());

		// transformando steam para list
		List<Curso> list = cursos.stream().filter(c -> c.getAlunos() > 5).collect(Collectors.toList());
		System.out.println(list);

		// transformando stream para map
//		Map<String, Integer> map = cursos.stream()
//		.filter(c -> c.getAlunos() > 5 )
//		.collect(Collectors.toMap( c -> c.getNome(), c -> c.getAlunos()));
//		System.out.println(map);
		cursos.stream().collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println("nome " + nome + " alunos " + alunos));

		// usando parallelstream para fazer mult threads caso precise

		cursos.parallelStream().forEach(System.out::println);

		System.out.println(cursos.stream().filter(c -> c.getAlunos() > 5).findFirst());
		
		//mais metodos do stream
		
		//conta quantos elementos existem e deveolve o valor no tipo long
		System.out.println(cursos.stream().count());		
		
		// devolve optional com o curso com a maior qtd de alunos
		System.out.println(cursos.stream().max(Comparator.comparingInt(Curso::getAlunos)));
		
		// devolve optional de curso com menor qtd de alunos
		System.out.println(cursos.stream().min(Comparator.comparingInt(Curso::getAlunos)));
		
		//devolve uma coleção com mesmo tamanho mas com as alterações dadas
		System.out.println(cursos.stream().map(c -> c.getNome()).collect(Collectors.toList()));
		
		//devolve uma coleção com o limite passado
		System.out.println(cursos.stream().limit(2).collect(Collectors.toList()));
		
		//executa uma função para cada elemento depois devolve a coleção
		System.out.println(cursos.stream().peek(System.out::println).collect(Collectors.toList()));
		
		//retorna true se todos os elementos daquela coleção possui a condição passada
		System.out.println(cursos.stream().allMatch(c -> c.getNome().toLowerCase().contains("a")));
		
		//retorna true se algum elemento contem aquela condição
		System.out.println(cursos.stream().anyMatch(c -> c.getNome().toLowerCase().contains("a")));
		
		//inverso do allMatach , retorna true se todos os elementos Não possuir a condiçãp
		System.out.println(cursos.stream().noneMatch(c -> c.getNome().toLowerCase().contains("z")));
		
		//devolve um optinioal do primeiro elemento
		cursos.stream().findFirst().ifPresent(System.out::println);
		
		//alguns Collectors
		//Collectors.joining(", ") , devolve uma String dos elementos concatenando cada elemento com o argumento passado no joining
		//Collectors.groupingBy(c -> c.getNomes().substring(0) equivalente ao group by do sql , vai agrupar os elementos pelo 
		//lambda passado
		
		System.out.println(cursos.stream().collect(Collectors.groupingBy(c -> c.getNome().substring(0,1))));
		System.out.println("String".getClass().getSimpleName() == "String");
		try {
			System.out.println("uahsda");
		}catch(ArithmeticException e) { e.printStackTrace();}finally {System.out.println("!");}
		
		System.out.println("2".equals("2"));
	}
}
