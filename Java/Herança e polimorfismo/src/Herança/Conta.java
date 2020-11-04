package Herança;

public class Conta {
	/*
	 * Estamos criando um "molde" para o objeto Conta , ou seja, ao criar um objeto
	 * conta ele terá sempre essa mesma caracteristicas Classes possuem
	 * caracteristicas especiais , ele possui atributos e metodos.
	 * 
	 * Atributos são equivalentes a uma variável , a diferença é que esse atributo é
	 * uma propriedade do objeto ou seja todo objeto terá o mesmo atributo , porém
	 * os valores podem ser iguais ou diferentes dependendo da regra de negócio
	 * 
	 * Metodo são equivalentes a uma função , a diferença é semelhante ao atributo ,
	 * todo objeto terá o mesmo metodo porem pode receber argumentos iguais ou
	 * diferentes.
	 * 
	 * JAVA é uma linguagem fortemente tipada então a estrutura do atributo
	 * geralmente é : tipoPermissao tipoAtributo nomeAtributo;ou = Atribuição Já no
	 * metodo a estruta é tipoPermissao retornoMetodo nomeMetodo(tipoArgumento
	 * argumento, ....){ bloco de código }
	 * 
	 * Normalmente os atributos são privados e metodos são publicos
	 * 
	 * Além disso , já que os atributos são privados como acessar eles ? Você pode
	 * criar Getters e Setters em que o get devolve o valor e set modifica o valor ,
	 * mas só devem ser criado quando NECESSARIO , não se cria get e set pra todos
	 * os atributos.
	 * 
	 * Precisamos definir um construtor para a classe, de modo que sempre que eu
	 * criar uma nova classe eu devo passar alguns valores minimos para ela existir,
	 * deixando assim seu código mais consistente.
	 * 
	 * Pedemos utilizar esses conceitos separados com a interface e a composição
	 * 
	 * Interface
	 * 	quando quiser utilizar do polimorfismo, pois o java não aceita heranças multiplas e também evita conflito de implementação
	 * 
	 * Composição
	 * 	quando quiser re-utilizar uma lógica de código para não ficar no copy /paste.
	 */
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;/*
									 * quando eu coloco que o atributo é static, significa que esse atributo agora é
									 * uma referencia da classe e não do objeto , ou seja , todos os objetos terão
									 * aquele atributo em comun e não será exclusivo do método igual os outros
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
							 * igual o atributo static o metodo será um metodo da classe e não do objeto,
							 * por esse motivo não existe this em um metodo static, ele irá nem irá compilar
							 */
	}
}
