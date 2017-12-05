package InterpreterPattern;

import java.util.HashMap;

public class Contexte{
	private HashMap<String,Integer> C;
		
	public Contexte(){
		HashMap<String,Integer> C = new HashMap<String,Integer>();
		this.C=C;
	}
	
	public void setContexte (String s, int val){
		C.put(s, val);
	}
	
	public int getContexte(String s) {
		return C.get(s);
	}

}