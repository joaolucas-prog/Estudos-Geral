package Herança;

/* Herença
 * 
 * Reaprorveitamento de código
 * Java permite que uma classe herde caracteristicas de outras classes , fazendo com que ela tenha todas as caracteristicas da 
 * sua superclasse(classe mãe) , qual a vantagem nisso ? Podemos especializar uma classe , exemplo podemos fazer uma classe
 * Pessoa, e uma duas especializações daquela classe Juridica e Fisica, e cada uma dessas especialização tem suas caracteristicas
 * exclusivas. Uma vez que usamos o extends a classe herdeira (filho) possui todas as caracteristicas da classe herdada(mãe)
 * ou seja, possui todos os atributos e metodos que a classe mãe possuia , porém podemos deixar igual ou fazer uma especialização
 * sobreescrevendo aquele metodo (override).
 * 
 * 
 * Polimorfismo
 * Podemos ter um metodo "compartilhado" entre seus filhos, digamos que temos um método que soma todas as bonificações dos 
 * funcionário , porém cada funcionário dependendo do tipo recebe uma bonificação diferente, então esse metodo será sobrescrito
 * em cada classe de especialização , mas na hora de criar um metodo não preciso criar um código para cada tipo de classe funcionário
 * como eles compartilham o mesmo código eu posso utilzar o polimorfismo para fazer o calculo
 *  exemplo existe a classe mãe funcionário e a classe filha gerente, para calcular a soma das bonificações posso digitar apenas
 * o nome do metodo em comun que o calculo será feito de forma especifica e não generica 
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
		return super.getSalario(); // "equivalente" ao this, mas como salario não está explicitado na classe
								// gerente uma boa pratica é colocar super
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}
}
