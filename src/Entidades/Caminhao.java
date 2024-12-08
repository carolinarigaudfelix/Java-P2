package Entidades;


import Exceptions.QuantidadeRodasException;
import Interfaces.Veiculo;

public class Caminhao extends VeiculoBase {

	private int qtdRodas;
	
	public Caminhao(int ano,String cor, String modelo, int qtdRodas)throws QuantidadeRodasException {
		super(ano,cor, modelo,qtdRodas);
		if(qtdRodas <0 || qtdRodas >6 ) {
			throw new QuantidadeRodasException("Número de rodas inválida");
		}
	}
	
	public void acelerar() {
		System.out.println("O caminhao está acelerando");
	}
	public void frear() {
		System.out.println("O caminhao está freando");
	}
	public String tipoCombustivel() {
		return "Diesel";
	}
	
	public String toString() {
		return super.toString() + "Combustivel: " + tipoCombustivel();
	}
}
