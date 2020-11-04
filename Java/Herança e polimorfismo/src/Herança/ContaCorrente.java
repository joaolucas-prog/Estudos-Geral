package Herança;

public class ContaCorrente extends Conta {
	/* Na herança os metodos e atributos são herdados como já  visto antes, porém o construtor não é herdado , então 
	 * precisamos definir o construtor , podendo ser especifico , ou o mesmo da classe super*/
	public ContaCorrente(int numero , int agencia) {
		super(numero , agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}
	
}
