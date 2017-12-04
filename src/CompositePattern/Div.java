package CompositePattern;

public class Div extends ExprNoeud{
	
	public Div (NAire fg, NAire fd) {
		this.fd = fd;
		this.fg = fg;
	}
	
	public double eval(){
		return fg.eval()/fd.eval();
	}
	
	public String toString(){
		String res="DIV (";
		return res+=fg.toString()+","+fd.toString();
	}

	
}
