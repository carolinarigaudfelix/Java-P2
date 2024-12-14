package appl;
import pack.libs.br.uerj.ime.lp2.lp2i06.*;
import pack.excp.com.start.excp.*;

public class Principal {
	public static void main (String[] args) throws NaoNumEx, NumArgsEx, ErrParEx
	{

		String operacao,nome1,nome2;
		Calc calculadora = new Calc();

		try {
			calculadora.TestaArgs(args);
		}catch(NumArgsEx e) {
			System.out.println(e.getMessage());
		}
		operacao = args[0];
        nome1 = args[1];
        nome2 = args[2];
        
		try {
			
			double div, mult,soma,sub;	
	
			calculadora.TestaArgs(args);
			
			if (args[0].equals("soma"))
			{
			   nome1 = args[1];
			   nome2 = args[2];
			   soma = calculadora.soma(nome1,nome2);
			   System.out.println("Soma = " + soma);
			}
			else if (args[0].equals("div"))
			{
			   nome1 = args[1];
			   nome2 = args[2];
			   div = calculadora.div(nome1, nome2);
			   System.out.println("Divisao = " + div);
			}
			else if (args[0].equals("mult"))
			{
			   nome1 = args[1];
			   nome2 = args[2];
			   mult = calculadora.mult(nome1, nome2);
			   System.out.println("Multiplicacao = " + mult);
			}
			else if (args[0].equals("sub"))
			{
			   nome1 = args[1];
			   nome2 = args[2];
			   sub = calculadora.sub(nome1, nome2);
			   System.out.println("Divisao = " + sub);
			}
			else {	
			System.out.println("Operacao matematica invalida.");
	        } 
			
		} catch (NaoNumEx |Div0ex e) {
			System.out.println(e.getMessage());
    	}

	      
	}
	       
}

