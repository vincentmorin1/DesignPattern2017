package partie1;

public class Mult extends NAire{
	private Expr fg;
	private Expr fd;
	
	public Mult (Expr fg, Expr fd) {
		super(fg,fd);
	}
	
	public double eval(){
		return fg.eval()*fd.eval();
	}
	
	public String decompiler(){
		String res="MULT (";
		return res+=fg.decompiler()+","+fd.decompiler();
	}
}
