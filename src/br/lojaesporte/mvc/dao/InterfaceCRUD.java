package br.lojaesporte.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface InterfaceCRUD<T> {
	public enum Sql{INSERT,SELECT,UPDATE,DELETE,SELECT_ALL};
	public PreparedStatement preparaSql(Sql sql);
	public boolean create(T model)throws SQLException;
	public T restore(T model)throws SQLException;
	public boolean update(T model)throws SQLException;
	public boolean delete(T model)throws SQLException;
	public List<T> listAll()throws SQLException;
}
