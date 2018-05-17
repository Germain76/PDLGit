
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 * Paramètres de connexion à la base de données oracle URL, LOGIN et PASS sont
 * des constantes
 */

public class ProfilsDAO {
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String LOGIN = "GERCL";
	final static String PASS = "1234";

	/**
	 * Constructeur de la classe PROFILSDAO
	 */
	public ProfilsDAO() {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println(
					"Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet");
		}

	}

	/**
	 * Permet d'ajouter un PROFIL dans la TABLE PROFIL_PRO
	 */
	public int creerProfil(Profils nouveauprofil) {
		/**
		 * Connection à la base de donnée 
		 */
		Connection con = null;
		PreparedStatement ps = null;
		int retour = 0;
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// creation requete
			ps = con.prepareStatement("INSERT INTO PROFIL_PRO (PRO_TYPE, PRO_ID) VALUES (?, PROFIL_ID_SEQPRO.nextval)");
			ps.setString(1, nouveauprofil.getTypeDeProfils());
			ps.setInt(2, nouveauprofil.getIDduProfils());
			
			retour = ps.executeUpdate();
		
		
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
			try {
				if (ps != null)
					ps.close();
			} catch (Exception ignore) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception ignore) {
			}
		}
		return retour;

	}
	public int associationProfil ()
}