package partie1;

public class Variable extends ExprFeuille {

	private String var;
	
	public Variable (String name) {
		this.var = name;
	}
	
	public String toString(){
		return var;
	}

	@Override
	public int eval() {
		return Contexte.getContexte(this.var);
	}	
	
}
