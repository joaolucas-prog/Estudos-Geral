package exceçõesProjeto;

public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+ this.saldo + " Valor: "+ valor);// garante que o metodo "sempre" vai funcionar
																							// caso contrário lança uma exception
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor); 
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	public static int getTotal() {
		return Conta.total;
	}
}
