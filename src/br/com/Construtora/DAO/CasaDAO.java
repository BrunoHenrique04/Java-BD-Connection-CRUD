package br.com.Construtora.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CasaDAO {
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
	
	public CasaDAO() {
	}
	public CasaDAO(Connection con) {
		setCon(con);
	}
	
	public String inserirConstrutora(br.com.Contrutora.Models.Casa casa) {
		String sql = "insert into casa(MetroQuadrados, QuantidadeDeQuartos, QuantidadeDeBanheiros, EnderecoCompleto, QuantidadeQuintal) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, casa.getMetroQuadrados());
			ps.setInt(2, casa.getQuantidadeDeQuartos());
			ps.setInt(3, casa.getQuantidadeDeBanheiros());
			ps.setString(4, casa.getEnderecoCompleto());
			ps.setInt(5, casa.getQuantidadeQuintal());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	
}
