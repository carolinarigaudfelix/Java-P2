package Entidades;

import Exceptions.QuantidadeRodasException;
import Interfaces.Veiculo;

public class Moto extends VeiculoBase {

	public Moto(int ano,String cor, String modelo, int qtdRodas)throws QuantidadeRodasException {
		super(ano,cor, modelo,qtdRodas);
		if(qtdRodas <0 || qtdRodas >2 ) {
			throw new QuantidadeRodasException("Número de rodas inválida");
		}
	}
	
	
	public void acelerar() {
		System.out.println("A moto está acelerando");
	}
	public void frear() {
		System.out.println("A moto está freando");
	}
	public String tipoCombustivel() {
		return "Etanol";
	}
	
	public String toString() {
		return super.toString() + "Combustivel: " + tipoCombustivel();
	}
}
