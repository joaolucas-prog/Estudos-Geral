package br.com.ingrao.tdd.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private List<Lance> maiores;

	public void avalia(Leilao leilao) {
		if(leilao.getLances().size() == 0) {
			throw new RuntimeException("Não é possivel avaliar um leilão sem lances");
		}
		
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos) {
				maiorDeTodos = lance.getValor();
			}
			if (lance.getValor() < menorDeTodos) {
				menorDeTodos = lance.getValor();
			}
		}
		maiores = new ArrayList<Lance>(leilao.getLances());

		maiores = maiores.stream().sorted((lance1, lance2) -> {
			if (lance1.getValor() < lance2.getValor())
				return 1;
			if (lance1.getValor() > lance2.getValor())
				return -1;
			return 0;
		}).collect(Collectors.toList()).subList(0, maiores.size() > 3 ? 3 : maiores.size());// usando produto ternario

	}

	public double getMaiorLance() {
		return maiorDeTodos;
	}

	public List<Lance> getTresMaiores() {
		return maiores;
	}

	public double getMenorLance() {
		return menorDeTodos;
	}
}
