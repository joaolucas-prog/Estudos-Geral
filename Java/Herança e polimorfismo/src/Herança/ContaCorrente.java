package Heran�a;

public class ContaCorrente extends Conta {
	/* Na heran�a os metodos e atributos s�o herdados como j�  visto antes, por�m o construtor n�o � herdado , ent�o 
	 * precisamos definir o construtor , podendo ser especifico , ou o mesmo da classe super*/
	public ContaCorrente(int numero , int agencia) {
		super(numero , agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}
	
}
