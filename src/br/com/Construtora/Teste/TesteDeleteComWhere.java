package br.com.Construtora.Teste;

import java.sql.Connection;

import br.com.Construtora.DAO.CasaDAO;
import br.com.Construtora.conexao.Conexao;
import br.com.Contrutora.Models.Casa;

public class TesteDeleteComWhere {

	public static void main(String[] args) {

	
	Connection con = Conexao.abrirConexao();
	Casa casa = new Casa();
	CasaDAO casaDAO = new CasaDAO(con);
	
	casa.setEnderecoCompleto("rua mastro dimitrio kipman, 144");

	
	System.out.println(casaDAO.deletarCasaComWhere(casa));
	
	Conexao.fecharConexao(con);
	}
}
