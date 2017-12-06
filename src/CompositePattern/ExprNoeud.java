package CompositePattern;

public abstract class ExprNoeud implements Arbre{

	protected Arbre fg;
	protected Arbre fd;
	
	public Arbre getChildren(int a){
		if (a == 0) {
			return getFilsGauche();
		}
		else if (a == 1) {
			return getFilsDroit();
		}
		else {
			System.out.println("1 pour fils droit et 0 pour fils gauche");
			throw new IllegalArgumentException();
		}
	}
	private Arbre getFilsGauche() {
		return this.fg;
	}
	private Arbre getFilsDroit() {
		return this.fd;
	}
	
}
