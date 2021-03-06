package partie1;

public class Mult extends ExprNoeud{
	
	public Mult (Arbre fg, Arbre fd) {
		this.fd = fd;
		this.fg = fg;
	}
		
	public String toString(){
		String res="MULT (";
		return res+=fg.toString()+","+fd.toString()+")";
	}

	@Override
	public int eval() {
		return fg.eval()*fd.eval();
	}

	
}
