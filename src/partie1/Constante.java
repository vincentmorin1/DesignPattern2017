package partie1;

public class Constante extends Expr{
	private double v;
	
	public Constante (double v){
		this.v=v;
	}
	public double eval() {
		return v;
	}
	
	public String decompiler(){
		return Double.toString(v);
	}
}
