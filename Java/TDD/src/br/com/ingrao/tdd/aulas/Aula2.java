package br.com.ingrao.tdd.aulas;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.ingrao.tdd.projeto.Avaliador;
import br.com.ingrao.tdd.projeto.Lance;
import br.com.ingrao.tdd.projeto.Leilao;
import br.com.ingrao.tdd.projeto.Usuario;

public class Aula2 {
	//Devemos evitar fazer muitos testes parecidos pois isso é custoso, devemos fazer todos os testes de equivalencia em 
	//um unico metodo
	@Test
	public void deveEntenderLanceEmOrdemCrescente() {

		Usuario joao = new Usuario("joao");
		Usuario jose = new Usuario("jose");
		Usuario maria = new Usuario("maria");

		Leilao leilao = new Leilao("Ps3 novo");

		leilao.propoe(new Lance(joao, 300));
		leilao.propoe(new Lance(jose, 400));
		leilao.propoe(new Lance(maria, 250));

		Avaliador leiloeiro = new Avaliador();

		leiloeiro.avalia(leilao);

		double maiorEsperado = 400;
		double menorEsperado = 250;

		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
	}
	
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		
		Usuario joao = new Usuario("joao");
		
		Leilao leilao = new Leilao("Ps3 novo");
		
		leilao.propoe(new Lance(joao, 300));
		
		Avaliador leiloeiro = new Avaliador();
		
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 300;
		double menorEsperado = 300;
		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);

	}
	
	@Test
	public void deveEncontrarOsTresMaioresLances() {

		Usuario joao = new Usuario("joao");
		Usuario jose = new Usuario("jose");
		Usuario maria = new Usuario("maria");

		Leilao leilao = new Leilao("Ps3 novo");

		leilao.propoe(new Lance(joao, 300));
		leilao.propoe(new Lance(jose, 400));
		leilao.propoe(new Lance(maria, 250));
		leilao.propoe(new Lance(joao,500));

		Avaliador leiloeiro = new Avaliador();

		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		assertEquals(3, maiores.size());
		
		assertEquals(500, maiores.get(0).getValor(), 0.00001);
		assertEquals(400, maiores.get(1).getValor(), 0.00001);
		assertEquals(300, maiores.get(2).getValor(), 0.00001);
	
	}
	
}
