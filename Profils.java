
public class Profils {
	public String typeDeProfils;
	public int  iDduProfils;
	
	public Profils ( String typeDeProfils, int iDduProfils) {
		this.typeDeProfils = typeDeProfils;
		this.iDduProfils = iDduProfils;
	}
	public void setTypeDeProfils (String typeDeProfils) {
		this.typeDeProfils = typeDeProfils;
	}
	public void setIDduProfils (int iDduProfils) {
		this.iDduProfils  = iDduProfils;
	}
	public String getTypeDeProfils () {
		return typeDeProfils;
	}
	public int getIDduProfils () {
		return iDduProfils;
	}
	
}
