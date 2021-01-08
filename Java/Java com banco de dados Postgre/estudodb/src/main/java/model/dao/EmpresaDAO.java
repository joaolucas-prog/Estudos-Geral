package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.bean.Empresa;

public class EmpresaDAO {
	
	private Connection con = null;
	
	public EmpresaDAO() {
		this.con = ConnectionFactory.getConecction();
	}
	
	public boolean save (Empresa empresa) {
		String sql = "INSERT INTO empresa (empresa_nome, empresa_cnpj) VALUES (?,?)";
		PreparedStatement stmt = null ;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, empresa.getNome());
			stmt.setString(2, empresa.getCnpj());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public boolean delete (Empresa empresa) {
		String sql = "DELETE FROM empresa WHERE empresa_id = ?";
		PreparedStatement stmt = null ;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, empresa.getId());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	public List<Empresa> findAll(){
		
		String sql = "SELECT * FROM empresa";
		
		PreparedStatement stmt = null ;
		ResultSet rs = null;
		
		List<Empresa> empresas = new ArrayList<Empresa>();
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Empresa empresa = new Empresa();
				empresa.setNome(rs.getString("empresa_nome"));
				empresa.setCnpj(rs.getString("empresa_cnpj"));
				empresas.add(empresa);;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con , stmt , rs);
		}
		
		return empresas;
	}
	public boolean update (Empresa empresa) {
		String sql = "UPDATE empresa SET empresa_nome = ?, empresa_cnpj = ? where empresa_id = ?";
		PreparedStatement stmt = null ;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, empresa.getNome());
			stmt.setString(2, empresa.getCnpj());
			stmt.setInt(3, empresa.getId());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
}
