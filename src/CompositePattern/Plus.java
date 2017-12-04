package CompositePattern;

public class Plus extends ExprNoeud{
	
	public Plus (NAire fg, NAire fd) {
		this.fd = fd;
		this.fg = fg;
	}
	
	public double eval(){
		return fg.eval()+fd.eval();
	}
	
	public String toString(){
		String res="PLUS (";
		return res+=fg.toString()+","+fd.toString();
	}
}
