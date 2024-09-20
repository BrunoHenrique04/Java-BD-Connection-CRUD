package br.com.Construtora.Teste;

import java.sql.Connection;

import br.com.Construtora.DAO.CasaDAO;
import br.com.Construtora.conexao.Conexao;

public class TesteDeleteSemWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		CasaDAO casaDAO = new CasaDAO(con);

		
		System.out.println(casaDAO.deleteSemWhere());
		
		Conexao.fecharConexao(con);
		
		
	}

}
