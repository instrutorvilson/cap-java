package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Contato;
import interfaces.IDAO;
import utilidades.Conexao;

public class DaoContato implements IDAO<Contato>{

	@Override
	public boolean salvar(Contato obj) {
		String sql = "insert into contato(nome, email)values(?,?)";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getEmail());
			stm.execute();    //aplicação -> database
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		finally {
			Conexao.closeConexao();
		}
		return true;
	}

	@Override
	public Contato getOne(int id) {
		Contato ct = null;
		
		String sql = "select * from contato where id = ?";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, id); 
			ResultSet rs = stm.executeQuery(); //database -> aplicação
			if(rs.next()) {
				ct = new Contato();
				ct.setId(rs.getInt("id"));
				ct.setNome(rs.getString("nome"));
				ct.setEmail(rs.getString("email"));
			}
			
		} catch (SQLException e) {
		   e.printStackTrace();
		}	
		finally {
			Conexao.closeConexao();
		}
		return ct;
	}

	@Override
	public List<Contato> getTodos() {
		List<Contato> lista = new  ArrayList<Contato>();
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement("select * from contato");
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				Contato ct = new Contato();
				ct.setId(rs.getInt("id"));
				ct.setNome(rs.getString("nome"));
				ct.setEmail(rs.getString("email"));
				lista.add(ct);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Conexao.closeConexao();
		}
		return lista;
	}

	@Override
	public boolean alterar(Contato obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

/*
public class DaoContato implements IDAOContato {

	@Override
	public boolean salvar(Contato ct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contato getContato(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> getContatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterar(Contato ct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}*/
