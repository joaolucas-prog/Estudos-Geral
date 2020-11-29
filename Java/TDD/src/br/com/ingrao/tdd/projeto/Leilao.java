package br.com.ingrao.tdd.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {
	private String descricao;
	private List<Lance> lances;

	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}

	public void propoe(Lance lance) {

		if (lances.isEmpty() || !podeDaLanceUsuario(lance.getUsuario()) && quantidadeDeLanceDo(lance.getUsuario())<5 
				&& ultimoLanceDado().getValor() < lance.getValor()) {
			this.lances.add(lance);
		}
	}

	private boolean podeDaLanceUsuario(Usuario usuario) {
		return (ultimoLanceDado().getUsuario().equals(usuario));
	}

	private int quantidadeDeLanceDo(Usuario usuario) {
		int total = 0;
		for(Lance l : lances) {
			if(l.getUsuario().equals(usuario)) {
				total +=1;
			}
		}
		return total;
	}

	private Lance ultimoLanceDado() {
		return lances.get(lances.size() - 1);
	}

	public String getDescricao() {
		return this.descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(this.lances);
	}
}
