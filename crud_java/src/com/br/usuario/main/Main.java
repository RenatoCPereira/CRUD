package com.br.usuario.main;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

import com.br.usuario.dao.UsuarioDao;
import com.br.usuario.modelo.Usuario;

public class Main {

	private static int escolha;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Usuario u1 = new Usuario();
		UsuarioDao dao = new UsuarioDao();
		Scanner teclado = new Scanner(System.in);

//		do {
//
//			System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO: ");
//			System.out.println("---------------");
//			System.out.println("1 -USUÁRIO");
//			System.out.println("2 -CLIENTE");
//			System.out.println("3 -");
//			System.out.println("4 -r");
//			System.out.println("5 - Sair ");
//			System.out.println();
//			System.out.println();
//
//			System.out.println("DIGITE A OpçÃO ESCOLHIDA: ");
//			escolha = teclado.nextInt();

//			System.out.println("Informe o nome:");
//			u1.setNome(teclado.nextLine());
//			System.out.println("Informe o email:");
//			u1.setEmail(teclado.nextLine());
//			System.out.println("Informe a senha:");
//			u1.setSenha(teclado.nextLine());
//			System.out.println("Informe o telefone:");
//			u1.setTelefone(teclado.nextLine());//
//			dao.incluir(u1);

		dao.consultar();
			
////		
//		} while (escolha != 5);
//
//		System.out.println("!!!!!SAINDO!!!!!!");
	}

}
