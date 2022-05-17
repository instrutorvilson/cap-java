package dao;

import java.util.List;

import entidades.Produto;
import interfaces.IDAO;

public class DaoProduto implements IDAO<Produto> {

	@Override
	public boolean salvar(Produto obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterar(Produto obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}}

/*
public class DaoProduto implements IDAOProduto {

	@Override
	public boolean salvar(Produto ct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto getContato(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> getContatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterar(Produto ct) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}*/
