package Heran�a;

/* Heren�a
 * 
 * Reaprorveitamento de c�digo
 * Java permite que uma classe herde caracteristicas de outras classes , fazendo com que ela tenha todas as caracteristicas da 
 * sua superclasse(classe m�e) , qual a vantagem nisso ? Podemos especializar uma classe , exemplo podemos fazer uma classe
 * Pessoa, e uma duas especializa��es daquela classe Juridica e Fisica, e cada uma dessas especializa��o tem suas caracteristicas
 * exclusivas. Uma vez que usamos o extends a classe herdeira (filho) possui todas as caracteristicas da classe herdada(m�e)
 * ou seja, possui todos os atributos e metodos que a classe m�e possuia , por�m podemos deixar igual ou fazer uma especializa��o
 * sobreescrevendo aquele metodo (override).
 * 
 * 
 * Polimorfismo
 * Podemos ter um metodo "compartilhado" entre seus filhos, digamos que temos um m�todo que soma todas as bonifica��es dos 
 * funcion�rio , por�m cada funcion�rio dependendo do tipo recebe uma bonifica��o diferente, ent�o esse metodo ser� sobrescrito
 * em cada classe de especializa��o , mas na hora de criar um metodo n�o preciso criar um c�digo para cada tipo de classe funcion�rio
 * como eles compartilham o mesmo c�digo eu posso utilzar o polimorfismo para fazer o calculo
 *  exemplo existe a classe m�e funcion�rio e a classe filha gerente, para calcular a soma das bonifica��es posso digitar apenas
 * o nome do metodo em comun que o calculo ser� feito de forma especifica e n�o generica 
 * */
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;

	public Gerente() {
		super();
	}

	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return super.getSalario(); // "equivalente" ao this, mas como salario n�o est� explicitado na classe
								// gerente uma boa pratica � colocar super
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}
}
