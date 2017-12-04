package CompositePattern;

public abstract class ExprNoeud implements NAire{

	protected NAire fg;
	protected NAire fd;
	
	public NAire getChildren(int a){
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
	private NAire getFilsGauche() {
		return this.fg;
	}
	private NAire getFilsDroit() {
		return this.fd;
	}
	
}
