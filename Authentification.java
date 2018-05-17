import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;



import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.Box;



public class Authentification extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	/**
	 * conteneur : il accueille les differents composants graphiques de la classe Authentification
	 */
	private JPanel pane,boutonDeConnexion;
	

	/**
	 * zone de texte pour le champ designation
	 */
	private JTextField identifiant;
	private JPasswordField motdepasse;
	private ImageIcon icon;
	private JLabel image; 
	
	/**
	 * label identifiant
	 */
	private JLabel identifiantLabel;

	/**
	 * label motdepasse
	 */
	private JLabel motdepasseLabel, phraseLabel, contents;
	


	/**
	 * Buton de connexion
	 */
	private JButton connexionBouton;


	/**
	 * Constructeur qui definit la fenetre d'authentification et ses composants 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	public Authentification() {
	
		
		// on fixe le titre de la fenêtre
		this.setTitle("Authentification");
		// initialisation de la taille de la fenêtre
		this.setSize(600, 400);
		
		pane = new JPanel();
		boutonDeConnexion = new JPanel();
		
		this.setResizable(false);
		

		// création du conteneur


		// choix du Layout pour ce conteneur
		// il permet de gérer la position des éléments
		// il autorisera un retaillage de la fenêtre en conservant la
		// présentation
		// BoxLayout permet par exemple de positionner les élements sur une
		// colonne ( PAGE_AXIS )
		pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));

		// choix de la couleur pour le conteneur
		pane.setBackground(Color.WHITE);

		// instantiation des composants graphiques
		this.setLocationRelativeTo(null);
		icon = new ImageIcon ("image/logoEsigelec.png");
		contents = new JLabel (icon);
		
		identifiant= new JTextField();
		motdepasse= new JPasswordField();
		phraseLabel = new JLabel ("Veuillez entrer votre identifiant et votre mot de passe dans les champs correspondant suivant :");
		connexionBouton= new JButton("Connexion");
		identifiantLabel = new JLabel("Identifiant ");
		motdepasseLabel = new JLabel("Mot de passe ");
		pane.add(contents);
		pane.add(Box.createRigidArea(new Dimension(0,50)));
		pane.add(phraseLabel);
		pane.add(Box.createRigidArea(new Dimension(0,20)));

		/**
		 * ajoute des composants sur le container
		 */
		pane.add(identifiantLabel);
		/**
		 * introduire une espace constant entre le label et le champ texte
		 */ 
		pane.add(Box.createRigidArea(new Dimension(0, 10)));
		pane.add(identifiant);
		/**
		 *  introduire une espace constant entre le champ texte et le composant suivant
		 */
		pane.add(Box.createRigidArea(new Dimension(0, 10)));

		pane.add(motdepasseLabel);
		pane.add(Box.createRigidArea(new Dimension(0, 5)));
		pane.add(motdepasse);
		pane.add(Box.createRigidArea(new Dimension(0, 10)));
		pane.add(connexionBouton);
		pane.add(Box.createRigidArea(new Dimension(0, 20)));
	
		// ajouter une bordure vide de taille constante autour de l'ensemble des
		// composants
		pane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// ajout des ecouteurs sur le bouton connexionBouton
		connexionBouton.addActionListener(this);


		// permet de quitter l'application si on ferme la fenêtre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(pane);

		// affichage de la fenêtre
		this.setVisible(true);
	}

	/**
	 * Gerer les actions realise sur les boutons
	 *
	 */
	public void actionPerformed(ActionEvent ae) {
		

		try {
			if (ae.getSource() == connexionBouton || this.identifiant.getText()== "Germain" || this.motdepasse.getText()=="1234") {
				this.setVisible(false);
			
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(this, "Nom d'utilisateur ou mot de passe incorrect",
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this,
					"Veuillez contrôler vos saisies", "Erreur",
					JOptionPane.ERROR_MESSAGE);
			System.err.println("Veuillez contrôler vos saisies");
		}

	}

	public static void main(String[] args) {
		new Authentification();
	}

}