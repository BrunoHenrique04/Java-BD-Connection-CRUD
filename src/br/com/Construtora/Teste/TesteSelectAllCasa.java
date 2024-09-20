package br.com.Construtora.Teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.Construtora.DAO.CasaDAO;
import br.com.Construtora.conexao.Conexao;
import br.com.Contrutora.Models.Casa;

public class TesteSelectAllCasa {
	public static void main(String[] Args) {
		Connection con = Conexao.abrirConexao();
		CasaDAO casaDao = new CasaDAO();
		
		ArrayList<Casa> lista = casaDao.retornarDadosCasa();
		
		if(lista != null) {
			for(Casa p : lista) {
				System.out.println("Nome: " + p.getMetroQuadrados());
				System.out.println("Endereco " + p.getEnderecoCompleto());
			}
		}
		
		Conexao.fecharConexao(con);
	}
}
