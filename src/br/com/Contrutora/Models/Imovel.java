package br.com.Contrutora.Models;

public class Imovel {
	private double MetroQuadrados;
	private int QuantidadeDeQuartos;
	private int QuantidadeDeBanheiros;
	private String enderecoCompleto;
	
	public double getMetroQuadrados() {
		return MetroQuadrados;
	}
	public void setMetroQuadrados(double metroQuadrados) {
		MetroQuadrados = metroQuadrados;
	}
	public int getQuantidadeDeQuartos() {
		return QuantidadeDeQuartos;
	}
	public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
		QuantidadeDeQuartos = quantidadeDeQuartos;
	}
	public int getQuantidadeDeBanheiros() {
		return QuantidadeDeBanheiros;
	}
	public void setQuantidadeDeBanheiros(int quantidadeDeBanheiros) {
		QuantidadeDeBanheiros = quantidadeDeBanheiros;
	}
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
}
