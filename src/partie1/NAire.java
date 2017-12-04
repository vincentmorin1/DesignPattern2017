package partie1;

public abstract class NAire extends Expr{
	protected Expr[] f;
	protected Expr fg;
	protected Expr fd;
	
	public NAire (Expr[] f){
		this.f=f;
	}
	
	public NAire(Expr fg, Expr fd) {
		
	}

	public abstract double eval(); 
}
