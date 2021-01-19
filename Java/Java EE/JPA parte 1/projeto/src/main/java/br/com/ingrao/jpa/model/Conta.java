package br.com.ingrao.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entidade a qual a jpa ir� cria a tabela precisa desta anota��o
@Entity
public class Conta {
	
	//toda Entity precisa de um Id para ser guardad no banco ou gerar� um erro
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o valor automaticamente
	private Long id;
	private Integer agencia;
	private Integer numero;
	private String titular;
	private Double saldo;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
