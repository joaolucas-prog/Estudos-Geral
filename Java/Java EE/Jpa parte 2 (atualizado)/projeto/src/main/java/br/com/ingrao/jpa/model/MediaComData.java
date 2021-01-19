package br.com.ingrao.jpa.model;

public class MediaComData {
	private Double valor;
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public MediaComData(Double valor, Integer dia, Integer mes, Integer ano) {
		this.valor = valor;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	
}
