package br.lojaesporte.mvc.model;

public class Produto {
	private int id_produtos;
	private String descricao;
	private int qtde_estoque;
	private int qtde_min;
	private int qtde_max;
	private int id_fornecedor;
	private double porc_venda;
	private long ean;
	private double preco_custo;
	
	public Produto() {
		super();
	}

	public Produto(String descricao, int qtde_estoque, int qtde_min, int qtde_max, int id_fornecedor,
			double porc_venda, long ean, double preco_custo) {
		super();
		this.descricao = descricao;
		this.qtde_estoque = qtde_estoque;
		this.qtde_min = qtde_min;
		this.qtde_max = qtde_max;
		this.id_fornecedor = id_fornecedor;
		this.porc_venda = porc_venda;
		this.ean = ean;
		this.preco_custo = preco_custo;
	}

	public int getId_produtos() {
		return id_produtos;
	}

	public void setId_produtos(int id_produtos) {
		this.id_produtos = id_produtos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtde_estoque() {
		return qtde_estoque;
	}

	public void setQtde_estoque(int qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}

	public int getQtde_min() {
		return qtde_min;
	}

	public void setQtde_min(int qtde_min) {
		this.qtde_min = qtde_min;
	}

	public int getQtde_max() {
		return qtde_max;
	}

	public void setQtde_max(int qtde_max) {
		this.qtde_max = qtde_max;
	}

	public int getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(int id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	public double getPorc_venda() {
		return porc_venda;
	}

	public void setPorc_venda(double porc_venda) {
		this.porc_venda = porc_venda;
	}

	public long getEan() {
		return ean;
	}

	public void setEan(long ean) {
		this.ean = ean;
	}

	public double getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}
	
}
