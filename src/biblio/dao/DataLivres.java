package biblio.dao;
import java.util.ArrayList;
import java.util.List;

import biblio.entity.Auteur;
import biblio.entity.Livre;

public interface DataLivres {
	public Livre findLivreById(int id) ;
	public List<Auteur> getListeAuteurs() ;
	public List<Livre> getListeLivres() ;
	//TODO Cf. Travail à faire.
	Auteur findAuteurByNom(String nom);
	void saveAuteur(Auteur a);
	Livre saveLivre(Livre l) throws Exception;
	Livre removeLivre(int id);
	Livre findLivreByTitre(String titreLivre);
	List<Livre> findLivreByAuteurNom(String nomAuteur);
	Auteur findAuteurById(int id);
	List<Livre> findLivreByAuteurId(int auteurId);
	

}
