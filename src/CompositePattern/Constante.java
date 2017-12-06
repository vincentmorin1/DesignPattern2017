package CompositePattern;

import InterpreterPattern.Contexte;

public class Constante extends ExprFeuille{
	
	private double i;
	
	public Constante (double i){
		this.i=i;
	}
		
	public String toString(){
		return Double.toString(this.i);
	}
	
}
