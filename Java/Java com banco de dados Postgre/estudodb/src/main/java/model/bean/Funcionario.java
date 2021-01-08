package model.bean;

public class Funcionario {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private Empresa empresa;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, String telefone, Empresa empresa) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
}
