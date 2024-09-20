package br.com.Construtora.Teste;

import java.sql.Connection;

import br.com.Construtora.DAO.ApartamentoDAO;
import br.com.Contrutora.Models.Apartamento;
import br.com.Construtora.conexao.Conexao;

public class TesteInserirApartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		Apartamento apartamento = new Apartamento();
		ApartamentoDAO apartamentoDAO = new ApartamentoDAO(con);
		
		apartamento.setEnderecoCompleto("rua mastro dimitrio kipman, 144");
		apartamento.setQuantidadeDeBanheiros(2);
		apartamento.setQuantidadeDeQuartos(3);
		apartamento.setMetroQuadrados(75.56);
		apartamento.setQuantidaVaranda(1);
		
		System.out.println(apartamentoDAO.inserirConstrutora(apartamento));
		
		Conexao.fecharConexao(con);
		
		
	}

}
