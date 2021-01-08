package test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import model.bean.Empresa;
import model.dao.EmpresaDAO;

public class EmpresaDAOTest {
	
	private EmpresaDAO empdao ;
	
	public EmpresaDAOTest() {

	}
	
	@Before
	public void preCarregamento() {
		this.empdao = new EmpresaDAO();
	}
	
	@Test
	@Ignore
	public void inserir() {
		Empresa empresa = new Empresa("TOMUS","11111111111112");
		if(empdao.save(empresa)) {
			System.out.println("salvo com sucesso");
		}else {
			fail("Erro ao salvar");
		}
	}
	
	@Test
	@Ignore
	public void atualizar() {
		Empresa empresa = new Empresa("joao","11111111111110");
		empresa.setId(2);
		if(empdao.update(empresa)) {
			System.out.println("atualizado com sucesso");
		}else {
			fail("Erro ao atualizar");
		}
	}
	
	@Test
	public void remover() {
		Empresa empresa = new Empresa("joao","11111111111110");
		empresa.setId(2);
		if(empdao.delete(empresa)) {
			System.out.println("Removido com sucesso");
		}else {
			fail("Erro ao remover");
		}
	}

	@Test
	@Ignore
	public void listar() {
		
		for (Empresa empresa : empdao.findAll()) {
			System.out.println(" Nome :"+empresa.getNome()+" - CNPJ :" + empresa.getCnpj());
		}
	}
}
