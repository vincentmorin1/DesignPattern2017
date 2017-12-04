package CompositePattern;

public class Constante extends ExprFeuille{
	
	private int i;
	
	public Constante (int i){
		this.i=i;
	}
	
	public double eval() {
		return 0;
	}
	
	public String toString(){
		return Integer.toString(this.i);
	}
	
}
