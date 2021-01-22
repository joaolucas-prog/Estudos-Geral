package br.com.ingrao.jsf.object.entity;

import java.io.Serializable;

public class Carro implements Serializable{
	private static final long serialVersionUID = -778440711808794823L;
	
	private String modelo;
	private String fabricante;
	private String cor;
	private Integer ano;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
}
