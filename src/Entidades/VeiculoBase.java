package Entidades;

import Interfaces.Veiculo;

public abstract class VeiculoBase implements Veiculo{
	private int ano;
	private String cor;
	private String modelo;
	private int qtdRodas;
	
	public VeiculoBase(int ano, String cor, String modelo,int qtdRodas)  {
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
		this.qtdRodas = qtdRodas;
	}
	
	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setNome(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public String toString() {
		return "Ano:" + ano + "\n" + "Cor:" + cor + "\n" + "Modelo:" + modelo + "\n" + "Quantidade de rodas: "+ qtdRodas + '\n';
	}
	
	
	
}
