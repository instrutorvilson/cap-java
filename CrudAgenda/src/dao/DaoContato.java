package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return true;
	}

	@Override
	public Contato getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> getTodos() {
		// TODO Auto-generated method stub
		return null;
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
