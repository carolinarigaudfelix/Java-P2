package Interfaces;

import Exceptions.VeiculoException;

public interface ServicoPagamento {
	double metodopagamento(int opcao) throws VeiculoException ;
}
