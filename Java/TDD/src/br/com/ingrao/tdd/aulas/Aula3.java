package br.com.ingrao.tdd.aulas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import br.com.ingrao.tdd.projeto.Avaliador;
import br.com.ingrao.tdd.projeto.Lance;
import br.com.ingrao.tdd.projeto.Leilao;
import br.com.ingrao.tdd.projeto.Usuario;

public class Aula3 {
	@Test
	public void deveAceitarUmLeilao() {
		Leilao leilao = new Leilao("PS5 novo");
		leilao.propoe(new Lance(new Usuario("joao"), 3000));

		assertEquals(1, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);

	}

	@Test
	public void deveAceitarVariosLeiloes() {
		Leilao leilao = new Leilao("PS5 novo");

		leilao.propoe(new Lance(new Usuario("joao"), 3000));
		leilao.propoe(new Lance(new Usuario("ingrid"), 3500));

		assertEquals(2, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);
		assertEquals(3500, leilao.getLances().get(1).getValor(), 0.00001);

	}

	@Test
	public void naoDeveAceitarUmLanceDeUmUsuarioSeguido() {
		Leilao leilao = new Leilao("PS5 novo");
		Usuario joao = new Usuario("joao");
		leilao.propoe(new Lance(joao, 3000));
		leilao.propoe(new Lance(joao, 3500));

		Avaliador leiloeiro = new Avaliador();

		leiloeiro.avalia(leilao);

		assertEquals(1, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);
	}

	@Test
	public void naoDeveAceitarMaisQue5LancesPorUsuario() {
		Leilao leilao = new Leilao("PS5 novo");
		Usuario joao = new Usuario("joao");
		Usuario ingrid = new Usuario("ingrid");
		
		leilao.propoe(new Lance(joao,1000));
		leilao.propoe(new Lance(ingrid,1500));
		
		leilao.propoe(new Lance(joao,2000));
		leilao.propoe(new Lance(ingrid,2500));
		
		leilao.propoe(new Lance(joao,3000));
		leilao.propoe(new Lance(ingrid,3500));
		
		leilao.propoe(new Lance(joao,3700));
		leilao.propoe(new Lance(ingrid,3800));
		
		leilao.propoe(new Lance(joao,4000));
		leilao.propoe(new Lance(ingrid,4050));
		
		leilao.propoe(new Lance(joao,4500));
		
		assertEquals(10, leilao.getLances().size());
		assertEquals(4050, leilao.getLances().get(leilao.getLances().size()-1).getValor(), 0.00001);
		
	}
}