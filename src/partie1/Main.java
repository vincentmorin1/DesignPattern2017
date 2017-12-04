package partie1;

public class Main {
		
	public static void main(String[] args){
		Contexte C=new Contexte();
		Contexte C2 = new Contexte();
		int X = 0;
		int Y = 0;
		Expr f=new Constante(X);
		C.addContexte("X",3);
		
		Expr f2=new Constante(Y);
		C2.addContexte("Y", 4);
		
	}
	
}
