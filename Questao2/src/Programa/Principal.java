package Programa;

import Entidade.Estoque;
import Entidade.ProdutoFisico;
import Exceptions.EstoqueCheioException;

public class Principal {
    public static void main(String[] args) {
        
    	Estoque estoque = new Estoque();

        try {
        	estoque.add(new ProdutoFisico("Notebook", 3500.00, 10));
            estoque.add(new ProdutoFisico("Smartphone", 1500.00, 20));
            estoque.add(new ProdutoFisico("Tablet", 900.00, 15));
            estoque.add(new ProdutoFisico("Cadeira Gamer", 1200.00, 8));
            estoque.add(new ProdutoFisico("Teclado Mecânico", 500.00, 30));
            estoque.add(new ProdutoFisico("Mouse", 150.00, 50));
            estoque.add(new ProdutoFisico("Monitor", 1800.00, 5));
            estoque.add(new ProdutoFisico("Fone de Ouvido", 200.00, 25));
            estoque.add(new ProdutoFisico("Cabo HDMI", 50.00, 100));
            estoque.add(new ProdutoFisico("HD Externo", 400.00, 15));


        }catch(EstoqueCheioException e) {
        	System.out.println(e.getLocalizedMessage());
        }
        

        estoque.exibirLista();
    }
}
