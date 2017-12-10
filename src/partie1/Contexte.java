package partie1;

import java.util.HashMap;

public class Contexte{
	private static HashMap<String,Integer> C;
		
	public Contexte(){
		HashMap<String, Integer> C = new HashMap<String,Integer>();
		Contexte.C=C;
	}
	
	public void setContexte (String s, int d){
		C.put(s, d);
	}
	
	public static int getContexte(String s) {
		return C.get(s);
	}

}