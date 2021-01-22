package br.com.ingrao.jsf.object.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ingrao.jsf.object.entity.Carro;

@Named
@SessionScoped
public class CarroBean implements Serializable {
	
	
	private static final long serialVersionUID = -4788911790073209694L;
	
	@Inject
	private Carro carro;
	private List<Carro> carros = new ArrayList<>();
	
	public void adicionar() {
		carros.add(carro);
		carro = new Carro();		
	}
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
}
