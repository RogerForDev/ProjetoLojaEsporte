package br.lojaesporte.mvc.view;

import java.sql.SQLException;

import br.lojaesporte.mvc.dao.ProdutoDAO;
import br.lojaesporte.mvc.model.Produto;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}
	public static void main(String[] args) throws SQLException {
		Produto p = new Produto();
		p.setDescricao("Bola Quadrada");
		p.setEan(789342433);
		p.setId_fornecedor(1);
		p.setPorc_venda(0.5);
		p.setPreco_custo(5.00);
		p.setQtde_estoque(15);
		p.setQtde_max(50);
		p.setQtde_min(5);
		ProdutoDAO dao = new ProdutoDAO();
		dao.create(p);
	}
}
