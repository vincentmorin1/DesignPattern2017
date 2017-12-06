package CompositePattern;

public class Div extends ExprNoeud{
	
	public Div (Arbre fg, Arbre fd) {
		this.fd = fd;
		this.fg = fg;
	}
		
	public String toString(){
		String res="DIV (";
		return res+=fg.toString()+","+fd.toString();
	}

	
}
