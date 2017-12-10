package partie1;

public abstract class ExprFeuille implements Arbre{
	
	public Arbre getChildren(int a){
		return null; //une feuille n'a pas de fils
	}
	
	public abstract int eval();

}
