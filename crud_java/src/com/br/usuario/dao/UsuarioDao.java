package com.br.usuario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.br.usuario.conexao.FabricaDeConexao;
import com.br.usuario.modelo.Usuario;

public class UsuarioDao {

	public void incluir(Usuario usuario) {

		String sql = "INSERT INTO usuarios (nome,email,senha,telefone) VALUES (?,?,?,?)";

		Connection conexao = null;
		PreparedStatement pstm = null;

		try {
			conexao = FabricaDeConexao.getConexao();

			pstm = conexao.prepareStatement(sql);
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getEmail());
			pstm.setString(3, usuario.getSenha());
			pstm.setString(4, usuario.getTelefone());

			pstm.execute();

			System.out.println("Cadastro realizado com Sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conexao != null) {
					conexao.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public List<Usuario> consultar() {

		String sql = "SELECT * FROM usuarios";

		List<Usuario> usuarios = new ArrayList<Usuario>();
		Connection conexao = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conexao = FabricaDeConexao.getConexao();
			pstm = conexao.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				Usuario usuario = new Usuario();

				usuario.setId(rset.getInt("id"));
				usuario.setNome(rset.getString("nome"));
				usuario.setEmail(rset.getString("email"));
				usuario.setSenha(rset.getString("senha"));
				usuario.setTelefone(rset.getString("telefone"));
				usuarios.add(usuario);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conexao != null) {
					conexao.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		usuarios.forEach(u -> System.out.println("ID: " + u.getId() + " NOME: " + u.getNome() + " EMAIL: " + u.getEmail() + " SENHA: "
				+ u.getSenha() + " TELEFONE: " + u.getTelefone()));

		return usuarios;

	}

	
	
}
