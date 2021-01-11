package br.com.ingrao.gerenciador.connection;

import java.util.ArrayList;
import java.util.List;

import br.com.ingrao.gerenciador.model.bean.Empresa;

public class Banco {
	
	public static List<Empresa> empresas = new ArrayList<Empresa>();
	
	static {//bloco statico para simular dados gravados no banco
		Empresa empresa = new Empresa("Tomus","2222");
		Empresa empresa2 = new Empresa("Google","8888");
		empresas.add(empresa);
		empresas.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return empresas;
	}
}
