package biblio.entity;

public class Livre {
	int id;
	String titre;
	int anneePublication;
	Auteur auteur;
	
	public Livre(int id, String titre, int anneePublication, Auteur auteur) {
		this.id=id;
		this.titre=titre;
		this.anneePublication=anneePublication;
		this.auteur=auteur;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getAnneePublication() {
		return anneePublication;
	}
	
	public Auteur getAuteur() {
		return auteur;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAnneePublication(int anneePublication) {
		this.anneePublication = anneePublication;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

}
