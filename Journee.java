import java.sql.Date;

public class Journee {
	public int iDJour;
	public int iDduProfils;
	public String typeJour;
	public Date heureOuverture;
	public Date heureFermeture;

	public Journee(int idJour, int iDduProfils, String typeJour, Date heureOuverture, Date heureFermeture) {
		this.iDJour = idJour;
		this.iDduProfils = iDduProfils;
		this.typeJour = typeJour;
		this.heureOuverture = heureOuverture;
		this.heureFermeture = heureFermeture;
	}

	public int getIdJour() {
		return iDJour;
	}

	public int getIDduProfils() {
		return iDduProfils;
	}

	public String getTypeJour() {
		return typeJour;
	}

	public Date getHeureOuverture() {
		return heureOuverture;
	}

	public Date heureFermeture() {
		return heureFermeture;
	}
}
