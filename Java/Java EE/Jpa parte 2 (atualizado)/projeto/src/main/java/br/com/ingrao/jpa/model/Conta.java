package br.com.ingrao.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//Entidade a qual a jpa irá cria a tabela precisa desta anotação
@Entity
public class Conta {
	
	//toda Entity precisa de um Id para ser guardad no banco ou gerará um erro
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o valor automaticamente
	private Long id;
	private Integer agencia;
	private Integer numero;
	private String titular;
	private Double saldo;
	@OneToMany(mappedBy = "conta",fetch = FetchType.EAGER)//transformando em um relacionamento bidirecional com o atributo conta
	//da classe movimentações usando o mappedBy sem isso a jpa iria criar uma tabela de relacionamento conta_movimentacoes 
	//mas queremos um relacionamento bidirecional e não 2 relacionamentos
	//Ja o fetch é a forma de como será feito a consulta no banco se vai ser Lazy(apenas quando precisar) ou Eager (ja carrega tudo)
	private List<Movimentacao> movimentacoes;;
	
	
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
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	
}
