package partie1;

public class Moins extends NAire{
	private Expr fg;
	private Expr fd;
	
	public Moins (Expr fg, Expr fd) {
		super(fg,fd);
	}
	
	public double eval(){
		return fg.eval()-fd.eval();
	}
	
	public String decompiler(){
		String res="MOINS (";
		return res+=fg.decompiler()+","+fd.decompiler();
	}
}
