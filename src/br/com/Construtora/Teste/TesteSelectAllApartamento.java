package br.com.Construtora.Teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.Construtora.DAO.ApartamentoDAO;
import br.com.Construtora.conexao.Conexao;
import br.com.Contrutora.Models.Apartamento;

public class TesteSelectAllApartamento {
	public static void main(String[] Args) {
		Connection con = Conexao.abrirConexao();
		ApartamentoDAO apartamentoDao = new ApartamentoDAO();
		
		ArrayList<Apartamento> lista = apartamentoDao.retornarDadosApartamento();
		
		if(lista != null) {
			for(Apartamento p : lista) {
				System.out.println("Nome: " + p.getMetroQuadrados());
				System.out.println("Endereco " + p.getEnderecoCompleto());
			}
		}
		
		Conexao.fecharConexao(con);
	}
}
