package br.lojaesporte.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.lojaesporte.mvc.model.Produto;
import util.Conexao;

public class ProdutoDAO implements InterfaceCRUD<Produto>{
	private PreparedStatement pstm = null;
	private Conexao con = new Conexao();
	
	@Override
	public boolean create(Produto model) throws SQLException {
		try {
			pstm = preparaSql(Sql.INSERT);
			pstm.setString(1, model.getDescricao());
			pstm.setInt(2, model.getQtde_estoque());
			return true;
		}catch(Throwable e){
			e.getMessage();
			return false;
		}finally {
			this.con.desconectar();
		}
	}

	@Override
	public Produto restore(Produto model) throws SQLException {
		ResultSet rst = null;
		try {
			pstm = preparaSql(Sql.SELECT);
			pstm.executeQuery();
			while(rst.next()){
				model.setDescricao(rst.getString("descricao"));
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}finally {
			this.con.desconectar();
		}
		return model;
	}

	@Override
	public boolean update(Produto model) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Produto model) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List listAll() throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();
		try {
			pstm = preparaSql(Sql.SELECT_ALL);
			ResultSet rst = pstm.executeQuery();
			Produto o = new Produto();
			while (rst.next()) {
				o.setId_produtos(rst.getInt("id_produtos"));
				o.setDescricao(rst.getString("descricao"));
			}
			rst.close();
			pstm.close();
		} catch (Exception e) {
			throw new SQLException();
		}
		return produtos;
	}
	public PreparedStatement preparaSql(Sql sql){
		String query = null;		
		switch (sql) {
			case INSERT:
				query = "INSERT INTO produtos(descricao, qtde_estoque, qtde_min, qtde_max, id_fornecedor, porc_venda, ean, preco_custo)"+
				  	   "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
				break;
			case SELECT:
				query = "";
				break;
			case UPDATE:
				query = "";
				break;
			case DELETE:
				query = "";
				break;
			case SELECT_ALL:
				query = "SELECT id_produtos, descricao, qtde_estoque, qtde_min, qtde_max, id_fornecedor, porc_venda, ean, preco_custo   FROM produtos;";
				break;
		}		
		try {
			pstm = this.con.getConexao().prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstm;
	}
}
