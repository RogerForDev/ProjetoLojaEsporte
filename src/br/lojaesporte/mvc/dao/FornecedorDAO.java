package br.lojaesporte.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.lojaesporte.mvc.model.Fornecedor;

public class FornecedorDAO implements InterfaceCRUD<Fornecedor> {

	@Override
	public boolean create(Fornecedor model) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fornecedor restore(Fornecedor model) throws SQLException {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public boolean update(Fornecedor model) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Fornecedor model) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fornecedor> listAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement preparaSql(br.lojaesporte.mvc.dao.InterfaceCRUD.Sql sql) {
		// TODO Auto-generated method stub
		return null;
	}


}
