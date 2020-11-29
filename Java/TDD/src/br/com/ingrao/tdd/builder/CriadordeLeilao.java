package br.com.ingrao.tdd.builder;

import br.com.ingrao.tdd.projeto.Lance;
import br.com.ingrao.tdd.projeto.Leilao;
import br.com.ingrao.tdd.projeto.Usuario;

public class CriadordeLeilao {

	private Leilao leilao;

	public CriadordeLeilao para(String descricao) {
		leilao = new Leilao(descricao);
		return this;
	}
	
	public CriadordeLeilao lance(Usuario usuario , double valor) {
		leilao.propoe(new Lance(usuario,valor));
		return this;
	}
	
	public Leilao constroi() {
		return leilao;
	}
}
