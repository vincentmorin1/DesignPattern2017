package partie1;

public class Constante extends ExprFeuille{
	
	private int i;
	
	public Constante (int i){
		this.i=i;
	}
		
	public String toString(){
		return Integer.toString(this.i);
	}

	@Override
	public int eval() {
		return i;
	}
	
}
