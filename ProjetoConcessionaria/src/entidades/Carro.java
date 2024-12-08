package entidades;

import Exceptions.VeiculoException;

public class Carro extends Veiculo{
	private int qtdPortas;
	public Carro(int ano, String modelo, int qtdRodas, int qtdPortas) throws VeiculoException {
		if(qtdRodas <0 || qtdRodas >4) {
			throw new VeiculoException("Numero incorreto de rodas");
		}
		if(qtdPortas <2 || qtdPortas >4) {
			throw new VeiculoException("Numero incorreto de portas");
		}
		super(ano, modelo, qtdRodas);
		this.qtdPortas = qtdPortas;
	}
	
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public String toString() {
		return super.toString() + " Tipo: Carro" + " Quantidade de Portas:" + qtdPortas;
	}
}
