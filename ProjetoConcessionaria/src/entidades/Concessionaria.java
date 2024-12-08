package entidades;

import java.util.ArrayList;

import Exceptions.VeiculoException;
import Interfaces.ServicoAluguel;
import Interfaces.ServicoPagamento;

public class Concessionaria implements ServicoAluguel, ServicoPagamento  {
	private ArrayList<Veiculo> concessionaria;
	
	public Concessionaria() {
		this.concessionaria = new ArrayList<Veiculo>();
	} 
	
	public void setVeiculo(Veiculo v, int indice) {
		concessionaria.add(indice,v);
	}
	public void addVeiculo(Veiculo v) {
		concessionaria.add(v);
	}
	
	public double metodopagamento(int opcao) throws VeiculoException{
		double taxa=0;
		if(opcao <0 || opcao >3) {
			throw new VeiculoException("Metodo invalido");
		}
		else {
			switch(opcao) {
			case 1:
				taxa = 0.0;
				break;
			
			case 2:
				taxa = 0.03;
				break;
			case 3:
				taxa =  0.10;
				break;
			}
		}
		
		return taxa;
	}
	
	public String mostraConcessionaria() {
	    String resultado = "";
	    for (int i = 0; i < concessionaria.size(); i++) {
	        resultado += concessionaria.get(i).toString() + "\n"; 
	    }
	    System.out.println(resultado); 
	    return resultado;
	}
	
	public double Aluguel(int indice, int opcaopagamento) throws VeiculoException {
		double valorBase;
		if(concessionaria.get(indice) instanceof Moto) 
			 valorBase = 1000.0;
		else if(concessionaria.get(indice) instanceof Carro) {
			 valorBase = 1500.0;
		}
		else{
			throw new VeiculoException("Tipo de veiculo não suportado");
		}	
		double taxaPagamento = metodopagamento(opcaopagamento);
		return valorBase + (valorBase*taxaPagamento);
		
	}
	
	public void qtdTipoVeiculo() {
		int carro=0;
		int moto = 0;
		for (Veiculo v : concessionaria) {
	        if(v instanceof Carro) {
	        	carro++;
	        }else if(v instanceof Moto) {
	        	moto++;
	        }
	    }
		
		System.out.println("Quantidade de motos:" + moto + " Quantidade de carros:" + carro);
	}

	public String toString() {
		return "Quantidade de veiculos:" + concessionaria.size() + "Elementos" +  mostraConcessionaria();
	}
}
