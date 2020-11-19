package br.com.ingrao.tdd.aulas;

import org.junit.Test;

import br.com.ingrao.tdd.projeto.Avaliador;
import br.com.ingrao.tdd.projeto.Lance;
import br.com.ingrao.tdd.projeto.Leilao;
import br.com.ingrao.tdd.projeto.Usuario;
import org.junit.Assert;;

public class Aula1 {
	/*TDD no java com junit
	 * voc� deve importar a biblioteca do junit , para isso va no build path e adicione biblioteca externa e selecione junit
	 * 
	 *depois disso podemos escrever nossa classe de teste, nela o metodo de teste n�o deve ser statico e nem possuir argumentos
	 *e em cima dela devemos colocar um @Test , fazendo os import correto do org.junit.Test para n�o dar erros podemos escrever
	 *o metodo , o principio do teste tdd se da em 3 partes  o cenario , a a��o e a valida��o.*/
	@Test
	public  void deveEntenderLanceEmOrdemCrescente() {
		//parte 1 : cenario
		Usuario joao = new Usuario("joao");
		Usuario jose = new Usuario("jose");
		Usuario maria = new Usuario("maria");
		
		Leilao leilao = new Leilao("Ps3 novo");
		
		leilao.propoe(new Lance(joao,300));
		leilao.propoe(new Lance(jose,400));
		leilao.propoe(new Lance(maria,250));
		//parte 2 :a��o
		Avaliador leiloeiro = new Avaliador();
		
		leiloeiro.avalia(leilao);
		
		//parte 3 : valida��o
		double maiorEsperado = 400;
		double menorEsperado = 250;
		
		//os parametros s�o (double, double, 0.00001) pois � o erro medio do arredondamento do double
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(),0.00001);//o junit verifica se o resultado bateu com o esperado
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
	}
}
