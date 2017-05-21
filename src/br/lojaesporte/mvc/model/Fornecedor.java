package br.lojaesporte.mvc.model;

public class Fornecedor {
	private int id_fornecedor;
	private String nome;
	private String responsavel;
	private String cnpj;
	private String telefone;
	private String email;
	private String logradouro;
	private String cep;
	private String estado;
	private String cidade;
	private String bairro;
	private int numero;
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(int id_fornecedor, String nome, String responsavel, String cnpj, String telefone, String email,
			String logradouro, String cep, String estado, String cidade, String bairro, int numero) {
		super();
		this.id_fornecedor = id_fornecedor;
		this.nome = nome;
		this.responsavel = responsavel;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.logradouro = logradouro;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
	}

	public int getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(int id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
