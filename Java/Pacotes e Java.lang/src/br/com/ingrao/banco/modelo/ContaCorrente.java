package br.com.ingrao.banco.modelo;

public class ContaCorrente extends Conta {
	public ContaCorrente(int numero , int agencia) {
		super(numero , agencia);
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor + 0.2);
	}
	
}
