package br.com.Construtora.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.Contrutora.Models.Apartamento;
import br.com.Contrutora.Models.Casa;

public class ApartamentoDAO {
	public static Connection abrirConexao() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/teste";
			
			//"jdbc:mysql://localhost:3306/teste","root", "*123456HAS*"
			final String USER = "root";
			final String PASS = "*123456HAS*";
			con = DriverManager.getConnection(url, USER, PASS);
			System.out.println("Conexao aberta");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		}
		return con;
	}

	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conexão fechada");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro para fechar");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Erro para fechar");
		}
	}
	
	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	
	public ApartamentoDAO() {
	}
	public ApartamentoDAO(Connection con) {
		setCon(con);
	}
	

	
	public String inserirConstrutora(Apartamento apartamento) {
		String sql = "insert into apartamento(MetroQuadrados, QuantidadeDeQuartos, QuantidadeDeBanheiros, EnderecoCompleto, QuantidaVaranda) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, apartamento.getMetroQuadrados());
			ps.setInt(2, apartamento.getQuantidadeDeQuartos());
			ps.setInt(3, apartamento.getQuantidadeDeBanheiros());
			ps.setString(4, apartamento.getEnderecoCompleto());
			ps.setInt(5, apartamento.getQuantidaVaranda());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<Apartamento> retornarDadosApartamento(){
		String sql = "select * from apartamento";
		ArrayList<Apartamento> retornarApartamento = new ArrayList<Apartamento>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Apartamento apartamento = new Apartamento();
					apartamento.setMetroQuadrados(rs.getDouble(1));
					apartamento.setQuantidadeDeQuartos(2);
					apartamento.setQuantidadeDeBanheiros(3);
					apartamento.setEnderecoCompleto(rs.getString(4));
					apartamento.setQuantidaVaranda(5);
					
					retornarApartamento .add(apartamento);
				}
				return retornarApartamento;
			}else {
				return null;
			}
		}catch (SQLException e) {
			return null;
		}
	}
}
