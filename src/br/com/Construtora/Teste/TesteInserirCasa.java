package br.com.Construtora.Teste;

import java.sql.Connection;

import br.com.Construtora.DAO.CasaDAO;
import br.com.Contrutora.Models.Casa;
import br.com.Construtora.conexao.Conexao;
import br.com.Construtora.conexao.ConexaoFactory;

public class TesteInserirCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		Casa casa = new Casa();
		CasaDAO casaDAO = new CasaDAO(con);
		
		casa.setEnderecoCompleto("rua mastro dimitrio kipman, 144");
		casa.setQuantidadeDeBanheiros(2);
		casa.setQuantidadeDeQuartos(3);
		casa.setMetroQuadrados(75.56);
		casa.setQuantidadeQuintal(1);
		
		System.out.println(casaDAO.inserirConstrutora(casa));
		
		Conexao.fecharConexao(con);
		
		
	}

}
