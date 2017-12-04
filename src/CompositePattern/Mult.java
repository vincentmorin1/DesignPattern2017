package CompositePattern;

public class Mult extends ExprNoeud{
	
	public Mult (NAire fg, NAire fd) {
		this.fd = fd;
		this.fg = fg;
	}
	
	public double eval(){
		return fg.eval()*fd.eval();
	}
	
	public String toString(){
		String res="MULT (";
		return res+=fg.toString()+","+fd.toString();
	}

	
}
