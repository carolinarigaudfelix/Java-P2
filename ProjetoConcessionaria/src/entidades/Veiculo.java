package entidades;

import Exceptions.VeiculoException;
import Interfaces.ServicoAluguel;
import Interfaces.ServicoPagamento;

public abstract class Veiculo{
	private int ano;
	private String modelo;
	private int qtdRodas;
	
	
	public static int count=0;
	
	public Veiculo(int ano, String modelo, int qtdRodas) throws VeiculoException {
		if(count>=5) {
			throw new VeiculoException("Numero de instancias excedido");
		}
		this.ano = ano;
		this.modelo = modelo;
		this.qtdRodas = qtdRodas;
		count++;
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	

	public String toString() {
		return "Modelo: " + modelo + " Ano:" + ano + " qtdRodas:" + qtdRodas;
	}
	
	
}
