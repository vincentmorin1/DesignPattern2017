package partie1;

public class Plus extends NAire{
	
	public Plus (Expr fg, Expr fd) {
		super(fg,fd);
	}
	
	public double eval(){
		return fg.eval()+fd.eval();
	}
	
	public String toString(){
		String res="PLUS (";
		return res+=fg.toString()+","+fd.toString();
	}
}
