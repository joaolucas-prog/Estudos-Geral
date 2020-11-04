package Herança;

public  abstract class Funcionario { //classe absbtrata, não pode ser instanciada

	private String nome;
	private String cpf;
	protected double salario; // proteced sugnifica que o atributo é "publico" para os filhos
	
	public Funcionario() {
		
	}
	
	public abstract double getBonificacao();//não há implementação na mãe, os filhos que implementam obrigatóriamente

	public double getSalario() {
		return salario;
	}
	
	
}
