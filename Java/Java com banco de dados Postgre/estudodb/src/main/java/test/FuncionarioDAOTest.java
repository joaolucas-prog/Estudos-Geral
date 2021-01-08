package test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import model.bean.Empresa;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;

public class FuncionarioDAOTest {
	
	private FuncionarioDAO dao;
	
	@Before
	public void preCarregamento() {
		this.dao = new FuncionarioDAO();
	}
	@Test
	@Ignore
	public void inserir() {
		Empresa empresa = new Empresa();
		empresa.setId(4);
		Funcionario funcionario = new Funcionario("joao","12912812876","00000000",empresa);
		
		if(dao.save(funcionario)) {
			System.out.println("Inserido com Sucesso");
		}else {
			fail("Erro ao Inserir");
		}
	}
	@Test
	@Ignore
	public void listar() {
		
		for (Funcionario funcionario : dao.findAll()) {
			System.out.println("Nome Funcionario: "+funcionario.getNome()+" - Empresa: "+funcionario.getEmpresa().getNome());
		}
	}
	
	@Test
	@Ignore
	public void atualizar() {
		
		Empresa empresa = new Empresa();
		empresa.setId(4);
		empresa.setCnpj("22222222222222");
		empresa.setNome("javatest");
		
		Funcionario f = new Funcionario();
		f.setId(1);
		f.setNome("João Lucas");
		f.setCpf("12332112332");
		f.setTelefone("40028911");
		f.setEmpresa(empresa);
		
		if(dao.update(f)) {
			System.out.println("Atualizado com sucesso");
		}else {
			fail("Erro ao Atualizar");
		}
	}
	
	@Test
	public void remover() {
		
		Funcionario f = new Funcionario();
		f.setId(3);
		
		if(dao.delete(f)) {
			System.out.println("Removido com sucesso");
		}else {
			System.out.println("Erro ao Remover");
		}
	}
	
}
