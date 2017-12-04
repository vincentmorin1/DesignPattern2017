package CompositePattern;

public class Moins extends ExprNoeud{
	
	
	public Moins (NAire fg, NAire fd) {
		this.fd = fd;
		this.fg = fg;
	}
	
	public double eval(){
		return fg.eval()-fd.eval();
	}
	
	public String toString(){
		String res="MOINS (";
		return res+=fg.toString()+","+fd.toString();
	}

	
}
