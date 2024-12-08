package Interfaces;

import Exceptions.VeiculoException;
import entidades.Veiculo;

public interface ServicoAluguel {
	double Aluguel(int indice, int opcaopagamento) throws VeiculoException;
}
