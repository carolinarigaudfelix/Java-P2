package Entidades;

import Exceptions.QuantidadeRodasException;
import Interfaces.Veiculo;

public class Carro extends VeiculoBase {

	
	public Carro(int ano,String cor, String modelo, int qtdRodas)throws QuantidadeRodasException {
		super(ano,cor, modelo,qtdRodas);
		if(qtdRodas <0 || qtdRodas >4 ) {
			throw new QuantidadeRodasException("Número de rodas inválida");
		}
	}
	
	public void acelerar() {
		System.out.println("O carro está acelerando");
	}
	public void frear() {
		System.out.println("O carro está freando");
	}
	public String tipoCombustivel() {
		return "Gasolina";
	}
	
	public String toString() {
		return super.toString() + "Combustivel: " + tipoCombustivel();
	}
}
