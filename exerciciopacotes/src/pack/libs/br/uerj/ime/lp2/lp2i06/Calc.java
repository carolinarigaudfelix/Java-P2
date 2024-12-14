package pack.libs.br.uerj.ime.lp2.lp2i06;
import pack.excp.com.start.excp.*;

public class Calc implements CalcIntf
{
	public int num1;
	public int num2;

	public Calc()
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/* testa se o número de argumentos está ok e joga a exceção confirmada NumArgsEx caso contrário */
	public void TestaArgs(String[] args)throws NumArgsEx {
		if(args.length != 3) {
			throw new NumArgsEx("Número de argumentos inválido");
		}
	}

    /* joga testa se o número de argumentos está correto e joga NumArgsEx caso contrário, e joga NaoNumEx se algum argumento não for convertível para inteiro */ 



	public  double div(String a, String b)throws Div0ex, NaoNumEx
	{
	    double valor1=0;
	    double valor2=0;

	    try
	    {
		  valor1 = Double.parseDouble(a);
		  valor2 =  Double.parseDouble(b);
	    }
	    catch (Exception e) {
            throw new NaoNumEx("Letra passada como argumento: Nao eh possivel converter.");
        }
	    if (valor2 == 0)
			throw new Div0ex("Divisao por 0");
	    else
		   	return valor1/valor2;
	  

	}

	public  int soma(String a, String b)throws ErrParEx, NaoNumEx
	{
		 	int valor1 =0;
		    int valor2= 0;
	    try
	    {
		  valor1 = Integer.parseInt(a);
		  valor2 = Integer.parseInt(b);
	    }
	    catch (Exception e) {
            throw new NaoNumEx("Letra passada como argumento: Nao eh possivel converter.");
        }
	    return valor1+valor2;
	}
	
	public  int sub(String a, String b)throws ErrParEx, NaoNumEx
	{
		 int valor1=0;
		 int valor2=0;

	    try
	    {
	    	valor1 = Integer.parseInt(a);
			valor2 = Integer.parseInt(b);
	    }
	    catch (Exception e) {
            throw new NaoNumEx("Letra passada como argumento: Nao eh possivel converter.");
        }
	    return valor1 - valor2;
	}
	public  double mult(String a, String b) throws NaoNumEx
	{
	    double valor1=0;
	    double valor2 = 0;

	    try
	    {
		  valor1 = Double.parseDouble(a);
		  valor2 = Double.parseDouble(b);
		  
	    }
	    catch (Exception e) {
            throw new NaoNumEx("Letra passada como argumento: Nao eh possivel converter.");
        }
	    return valor1*valor2;
	}
}
