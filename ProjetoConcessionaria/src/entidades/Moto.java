package entidades;

import Exceptions.VeiculoException;

public class Moto extends Veiculo{

	public Moto(int ano, String modelo, int qtdRodas) throws VeiculoException {
		if(qtdRodas <0 || qtdRodas >2) {
			throw new VeiculoException("Qtd de Rodas acima do convencional");
		}super(ano, modelo, qtdRodas);
	}
	public String toString() {
		return super.toString() + " Tipo: Moto";
	}
}
