package com.br.usuario.main;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

import com.br.usuario.dao.UsuarioDao;
import com.br.usuario.modelo.Usuario;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//FabricaDeConexao.getConexao();

		

		//FabricaDeConexao.getConexao().close();
		
		
		Usuario u1 = new Usuario();
		UsuarioDao dao = new UsuarioDao();
		Scanner teclado = new Scanner(System.in);
		
//			System.out.println("Informe o nome:");
//			u1.setNome(teclado.nextLine());
//			System.out.println("Informe o email:");
//			u1.setEmail(teclado.nextLine());
//			System.out.println("Informe a senha:");
//			u1.setSenha(teclado.nextLine());
//			System.out.println("Informe o telefone:");
//			u1.setTelefone(teclado.nextLine());
////		
////		u1.setNome("Joao Carlos");
////		u1.setEmail("joao@gmail.com");
////		u1.setSenha("joao2021");
////		u1.setTelefone("988250110");
//		
//		
//		dao.incluir(u1);
//		
		dao.listar();
		
		

	}

}
