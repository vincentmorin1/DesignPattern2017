package partie1;

public class Moins extends ExprNoeud{
	
	
	public Moins (Arbre fg, Arbre fd) {
		this.fd = fd;
		this.fg = fg;
	}
	
	public String toString(){
		String res="MOINS (";
		return res+=fg.toString()+","+fd.toString()+")";
	}

	@Override
	public int eval() {
		return fg.eval()-fd.eval();
	}

	
}
