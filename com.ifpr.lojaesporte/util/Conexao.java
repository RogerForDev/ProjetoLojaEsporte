package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao extends BancoPG{
	private Connection con = null;
	
	public Conexao(){
		super();
		conectar();
	}
	public Connection getConexao(){
		return con;
	}

	private void conectar() {
		try {
			Class.forName(DRIVER).newInstance();
			this.con = DriverManager.getConnection(URL,USUARIO,SENHA);
		} catch (Exception e) {
			System.out.println("Problema ao conectar com o banco de dados "+URL+":"+e);
		}		
	}
	public void desconectar(){
		try {
			if(this.con != null)
				this.con.close();
		} catch (Exception e) {
			System.out.println("Problemas ao deconectar da base já desconectada");
		}
	}
}