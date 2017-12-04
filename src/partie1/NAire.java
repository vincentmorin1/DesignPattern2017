package partie1;

public abstract class NAire extends Expr{
	protected Expr fg;
	protected Expr fd;
	
	public NAire(Expr fg, Expr fd) {
		this.fg=fg;
		this.fd=fd;
	}

	public abstract double eval(); 
	public abstract String toString();
}
