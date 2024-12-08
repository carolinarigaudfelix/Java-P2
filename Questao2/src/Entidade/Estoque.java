package Entidade;

import java.util.ArrayList;

import Exceptions.EstoqueCheioException;
import Interfaces.Armazenavel;


public class Estoque {
	public ArrayList<Armazenavel> lista;
	public static int count = 10;
	 public Estoque() {
	        lista = new ArrayList<>();  
	    }
	 
	public void add(ProdutoFisico p) throws EstoqueCheioException {
		if(lista.size()>=10) {
			throw new EstoqueCheioException("Excedeu o limite");
		}
		lista.add(p);
	}
	public void remove(int index) {
		if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            System.out.println("Produto removido do estoque.");
        } else {
            System.out.println("Índice inválido. Produto não encontrado.");
        }
	}
	public void exibirLista() {
		if (lista.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
		for (Armazenavel item : lista) {
	        if (item instanceof ProdutoFisico) {
	            ProdutoFisico produto = (ProdutoFisico) item; 
	            produto.exibirDetalhes();
	        }
	    }
	}
}
