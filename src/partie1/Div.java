package partie1;

public class Div extends NAire{
	private Expr fg;
	private Expr fd;
	
	public Div (Expr fg, Expr fd) {
		super(fg,fd);
	}
	
	public double eval(){
		return fg.eval()/fd.eval();
	}
	
	public String decompiler(){
		String res="DIV (";
		return res+=fg.decompiler()+","+fd.decompiler();
	}
}
