package br.com.ingrao.tdd.aulas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ingrao.tdd.builder.CriadordeLeilao;
import br.com.ingrao.tdd.projeto.Avaliador;
import br.com.ingrao.tdd.projeto.Lance;
import br.com.ingrao.tdd.projeto.Leilao;
import br.com.ingrao.tdd.projeto.Usuario;

public class Aula4 {
	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario ingrid;

	@Before
	public void criaAvaliador() {
		this.leiloeiro = new Avaliador();
		joao = new Usuario("joao");
		ingrid = new Usuario("ingrid");
	}

	@Test
	public void deveAceitarUmLeilao() {
		Leilao leilao = new CriadordeLeilao().para("PS5 novo")
				.lance(joao, 3000)
				.constroi();

		assertEquals(1, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);

	}

	@Test
	public void deveAceitarVariosLeiloes() {
		Leilao leilao = new CriadordeLeilao().para("PS5 novo")
				.lance(joao, 3000)
				.lance(ingrid, 3500)
				.constroi();

		assertEquals(2, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);
		assertEquals(3500, leilao.getLances().get(1).getValor(), 0.00001);

	}

	@Test
	public void naoDeveAceitarUmLanceDeUmUsuarioSeguido() {
		Leilao leilao = new CriadordeLeilao().para("PS5 novo")
				.lance(joao, 3000)
				.lance(joao, 3500)
				.constroi();
		leiloeiro.avalia(leilao);

		assertEquals(1, leilao.getLances().size());
		assertEquals(3000, leilao.getLances().get(0).getValor(), 0.00001);
	}

	@Test
	public void naoDeveAceitarMaisQue5LancesPorUsuario() {

		Leilao leilao = new CriadordeLeilao().para("PS5 novo")
				.lance(joao, 1000.0)
				.lance(ingrid, 1500)
				.lance(joao, 2000)
				.lance(ingrid, 2500)
				.lance(joao, 3000)
				.lance(ingrid, 3500)
				.lance(joao, 3700)
				.lance(ingrid, 3800)
				.lance(joao, 4000)
				.lance(ingrid, 4050)
				.lance(joao, 4500)
				.constroi();

		assertEquals(10, leilao.getLances().size());
		assertEquals(4050, leilao.getLances().get(leilao.getLances().size() - 1).getValor(), 0.00001);

	}
}
