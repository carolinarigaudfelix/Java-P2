package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinhaListaOrdenavel {
	public ArrayList<VeiculoBase> lista;
	
	public void add(VeiculoBase c) {
		lista.add(c);
	}
	
	public MinhaListaOrdenavel() {
		lista = new ArrayList<>();
	}
	
	public Comparator<VeiculoBase> qtdRodasC = new Comparator<VeiculoBase>() {
        public int compare(VeiculoBase c1, VeiculoBase c2) {
            int qtd1 = c1.getQtdRodas();
            int qtd2 = c2.getQtdRodas();
            return Integer.compare(qtd1, qtd2); 
        }
    };
    public Comparator<VeiculoBase> anoC = new Comparator<VeiculoBase>() {
        public int compare(VeiculoBase c1, VeiculoBase c2) {
            int ano1 = c1.getAno();
            int ano2 = c2.getAno();
            return Integer.compare(ano1, ano2); 
        }
    };


    
    public void exibirLista() {
		for(VeiculoBase veiculo: lista) {
			System.out.println(veiculo);
			System.out.println("\n");
		}
	}
    
	public void ordena(int opcao) {
		switch(opcao) {
			case 1:
				Collections.sort(lista,qtdRodasC);
				exibirLista();
				break;
			case 2:
				Collections.sort(lista,anoC);
				exibirLista();
				break;
		}
	}
	
	
	
}


