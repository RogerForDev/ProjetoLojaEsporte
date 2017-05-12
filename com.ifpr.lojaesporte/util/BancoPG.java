package util;

public class BancoPG {
	public final String DRIVER = "org.postgresql.Driver";
	public final String ENDERECO = "localhost";
	public final String PORTA = "5432";
	public final String USUARIO = "postgres";
	public final String SENHA = "bancodedados";
	public final String BANCO = "loja";
	public final String URL = "jdbc:postgresql://"+ENDERECO+":"+PORTA+"/"+BANCO;
}