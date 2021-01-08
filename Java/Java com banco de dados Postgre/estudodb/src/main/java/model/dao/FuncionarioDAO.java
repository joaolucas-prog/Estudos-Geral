package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.bean.Empresa;
import model.bean.Funcionario;

public class FuncionarioDAO {
	
	private Connection con = null;
	
	public FuncionarioDAO () {
		this.con = ConnectionFactory.getConecction();
	}
	
	public boolean save(Funcionario funcionario) {
		
		String sql = "INSERT INTO funcionario (nome,telefone,cpf,empresa_id) VALUES (?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getTelefone());
			stmt.setString(3, funcionario.getCpf());
			stmt.setInt(4, funcionario.getEmpresa().getId());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
		
	}
	
	public List<Funcionario> findAll(){
		
		String sql = "SELECT f.funcionario_id fid,f.empresa_id feid,f.nome fnome, f.telefone ftel, f.cpf fcpf,e.empresa_id eid, "
				+ "e.empresa_nome enome, e.empresa_cnpj ecnpj "
				+ "FROM funcionario f "
				+ "INNER JOIN empresa e ON (f.empresa_id = e.empresa_id) ";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Empresa empresa = new Empresa();
				empresa.setId(rs.getInt("eid"));
				empresa.setNome(rs.getString("enome"));
				empresa.setCnpj(rs.getString("ecnpj"));
				
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getInt("fid"));
				funcionario.setCpf(rs.getString("fcpf"));
				funcionario.setNome(rs.getString("fnome"));
				funcionario.setTelefone(rs.getString("ftel"));
				funcionario.setEmpresa(empresa);
				
				funcionarios.add(funcionario);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con,stmt,rs);
		}
		
		return funcionarios;
	}
	
	public boolean update (Funcionario funcionario) {
		
		String sql = "UPDATE funcionario SET nome = ?, cpf = ? , telefone = ? , empresa_id = ? where funcionario_id = ?";
		
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getCpf());
			stmt.setString(3, funcionario.getTelefone());
			stmt.setInt(4, funcionario.getEmpresa().getId());
			stmt.setInt(5, funcionario.getId());
			
			stmt.executeUpdate();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
	}
	
	public boolean delete(Funcionario f) {
		
		String sql = "DELETE FROM funcionario where funcionario_id = ? ";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, f.getId());
			
			stmt.executeUpdate();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
	}

}
