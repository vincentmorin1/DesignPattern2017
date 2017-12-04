package CompositePattern;

public class Variable extends ExprFeuille {

	private String var;
	
	public Variable (String name) {
		this.var = name;
	}
	
	public String toString(){
		return var;
	}

	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
