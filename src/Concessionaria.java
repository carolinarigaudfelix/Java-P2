
import Interfaces.Veiculo;
import Exceptions.QuantidadeRodasException;

import java.util.ArrayList;

import Entidades.Caminhao;
import Entidades.Carro;
import Entidades.MinhaListaOrdenavel;
import Entidades.Moto;
import Entidades.VeiculoBase;

public class Concessionaria {
	public static void main(String args[]) {
		
		MinhaListaOrdenavel lista = new MinhaListaOrdenavel();
		
		try {
			lista.add(new Carro(1998, "A", "volksvagen", 4));
			lista.add(new Caminhao(2003,"Gold","Elon Musk",6));
			lista.add(new Moto(2000,"Jat","Vecna",2));
		}
		catch(QuantidadeRodasException e) {
			System.out.println(e.getMessage());
		}
		
		lista.ordena(1);

	}
}
