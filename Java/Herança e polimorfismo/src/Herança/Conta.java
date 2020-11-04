package Heran�a;

public class Conta {
	/*
	 * Estamos criando um "molde" para o objeto Conta , ou seja, ao criar um objeto
	 * conta ele ter� sempre essa mesma caracteristicas Classes possuem
	 * caracteristicas especiais , ele possui atributos e metodos.
	 * 
	 * Atributos s�o equivalentes a uma vari�vel , a diferen�a � que esse atributo �
	 * uma propriedade do objeto ou seja todo objeto ter� o mesmo atributo , por�m
	 * os valores podem ser iguais ou diferentes dependendo da regra de neg�cio
	 * 
	 * Metodo s�o equivalentes a uma fun��o , a diferen�a � semelhante ao atributo ,
	 * todo objeto ter� o mesmo metodo porem pode receber argumentos iguais ou
	 * diferentes.
	 * 
	 * JAVA � uma linguagem fortemente tipada ent�o a estrutura do atributo
	 * geralmente � : tipoPermissao tipoAtributo nomeAtributo;ou = Atribui��o J� no
	 * metodo a estruta � tipoPermissao retornoMetodo nomeMetodo(tipoArgumento
	 * argumento, ....){ bloco de c�digo }
	 * 
	 * Normalmente os atributos s�o privados e metodos s�o publicos
	 * 
	 * Al�m disso , j� que os atributos s�o privados como acessar eles ? Voc� pode
	 * criar Getters e Setters em que o get devolve o valor e set modifica o valor ,
	 * mas s� devem ser criado quando NECESSARIO , n�o se cria get e set pra todos
	 * os atributos.
	 * 
	 * Precisamos definir um construtor para a classe, de modo que sempre que eu
	 * criar uma nova classe eu devo passar alguns valores minimos para ela existir,
	 * deixando assim seu c�digo mais consistente.
	 * 
	 * Pedemos utilizar esses conceitos separados com a interface e a composi��o
	 * 
	 * Interface
	 * 	quando quiser utilizar do polimorfismo, pois o java n�o aceita heran�as multiplas e tamb�m evita conflito de implementa��o
	 * 
	 * Composi��o
	 * 	quando quiser re-utilizar uma l�gica de c�digo para n�o ficar no copy /paste.
	 */
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;/*
									 * quando eu coloco que o atributo � static, significa que esse atributo agora �
									 * uma referencia da classe e n�o do objeto , ou seja , todos os objetos ter�o
									 * aquele atributo em comun e n�o ser� exclusivo do m�todo igual os outros
									 * atributos exemplo saldo , numero
									 */

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.deposita(valor);
			this.saca(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	public static int getTotal() {
		return Conta.total; /*
							 * igual o atributo static o metodo ser� um metodo da classe e n�o do objeto,
							 * por esse motivo n�o existe this em um metodo static, ele ir� nem ir� compilar
							 */
	}
}
