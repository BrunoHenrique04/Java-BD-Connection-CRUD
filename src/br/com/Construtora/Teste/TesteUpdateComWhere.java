package br.com.Construtora.Teste;

import java.sql.Connection;

import br.com.Construtora.DAO.CasaDAO;
import br.com.Construtora.conexao.Conexao;
import br.com.Contrutora.Models.Casa;

public class TesteUpdateComWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		
		Casa casa = new Casa();
		CasaDAO casaDAO = new CasaDAO(con);
		
		casa.setQuantidadeDeQuartos(4); //set
		casa.setQuantidadeDeBanheiros(2); //where
		
		
		System.out.println(casaDAO.modificarCasaComWhere(casa));
		
		Conexao.fecharConexao(con);
		
	}
}
