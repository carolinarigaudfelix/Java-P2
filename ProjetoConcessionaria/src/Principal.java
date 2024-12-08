import Exceptions.VeiculoException;
import entidades.Carro;
import entidades.Concessionaria;
import entidades.Moto;

public class Principal {	
	public static void main(String args[]) {
		Concessionaria c = new Concessionaria();
		System.out.println("Veiculos na Concessinaria: ");
		
		try {
			c.addVeiculo(new Carro(2000, "Fuska", 4,4));
			c.addVeiculo(new Moto(1990, "Biz", 2));
			
			System.out.println("Alugar veiculos");
			System.out.println(c.Aluguel(0, 1));
		}catch(VeiculoException e) {
			System.out.println(e.getMessage());
		}
		c.qtdTipoVeiculo();
		c.mostraConcessionaria();

	}
}
