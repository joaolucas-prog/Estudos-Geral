package Heran�a;

public  abstract class Funcionario { //classe absbtrata, n�o pode ser instanciada

	private String nome;
	private String cpf;
	protected double salario; // proteced sugnifica que o atributo � "publico" para os filhos
	
	public Funcionario() {
		
	}
	
	public abstract double getBonificacao();//n�o h� implementa��o na m�e, os filhos que implementam obrigat�riamente

	public double getSalario() {
		return salario;
	}
	
	
}
