package br.com.ingrao.hibernate.model.bean;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//exatamente igual ao JPA
public class Empresa {
	@Id//igual ao jpa
	@GeneratedValue(strategy = GenerationType.IDENTITY)// igual jpa
	private Long id;
	private String nome;
	private String cnpj;
	@Embedded
	@Column(nullable = true)
	private Endereco endereco;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Empresa() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
