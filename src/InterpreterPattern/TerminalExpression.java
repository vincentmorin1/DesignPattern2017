package InterpreterPattern;

import CompositePattern.Arbre;

public class TerminalExpression implements AbstractExpression{

	private Arbre f;
	
	public TerminalExpression(Arbre f) {
		this.f = f;
	}
	
	@Override
	public double eval(Contexte c) {
		return c.getContexte(f.toString());
	}
	
}
