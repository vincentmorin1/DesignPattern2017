package CompositePattern;

public class Plus extends ExprNoeud{
	
	public Plus (Arbre fg, Arbre fd) {
		this.fd = fd;
		this.fg = fg;
	}
		
	public String toString(){
		String res="PLUS (";
		return res+=fg.toString()+","+fd.toString();
	}
}
