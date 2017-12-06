package InterpreterPattern;

import java.util.HashMap;

public class Contexte{
	private HashMap<String,Double> C;
		
	public Contexte(){
		HashMap<String, Double> C = new HashMap<String,Double>();
		this.C=C;
	}
	
	public void setContexte (String s, double d){
		C.put(s, d);
	}
	
	public Double getContexte(String s) {
		return C.get(s);
	}

}