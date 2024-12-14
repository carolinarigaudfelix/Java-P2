package pack.libs.br.uerj.ime.lp2.lp2i06;

import pack.excp.com.start.excp.*;
import pack.excp.com.start.excp.ErrParEx;

public interface CalcIntf {
	public  int soma(String a, String b)throws ErrParEx,NaoNumEx;
	public  int sub(String a, String b)throws ErrParEx, NaoNumEx;
	public  double mult(String a, String b) throws NaoNumEx;
	public  double div(String a, String b)throws Div0ex, NaoNumEx;
}
