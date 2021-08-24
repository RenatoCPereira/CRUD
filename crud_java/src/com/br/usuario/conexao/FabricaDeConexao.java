package com.br.usuario.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	private static final String URL = "jdbc:mysql://localhost:3306/crud";
	private static final String USUARIO = "root";
	private static final String SENHA = "1234";

	public static Connection getConexao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection(URL, USUARIO, SENHA);
	}
}
