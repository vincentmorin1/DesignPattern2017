

import CompositePattern.Constante;
import CompositePattern.Div;
import CompositePattern.Moins;
import CompositePattern.Mult;
import CompositePattern.Plus;
import CompositePattern.Variable;
import InterpreterPattern.Contexte;

public class Main {
		
	public static void main(String[] args){
		
		Contexte c = new Contexte();
		
		/****** (A + 1) * 2 / (X - B) ******/
		
		Variable A = new Variable("A");
		Variable X = new Variable("X");
		Variable B = new Variable("B");
		
		c.setContexte(A.toString(), 2.0);
		c.setContexte(X.toString(), 7.0);
		c.setContexte(B.toString(), 4.0);
		
		Constante c1 = new Constante(1.0);
		Constante c2 = new Constante(2.0);
		
		Plus p1 = new Plus(A,c1);
		
		Moins m1 = new Moins(X,B);
		
		Mult mult1 = new Mult(p1,c2);
		
		Div ExprFinal = new Div(mult1,m1);
		
		System.out.println(ExprFinal.toString());
		System.out.println(ExprFinal.eval(c));
	}
	
}
