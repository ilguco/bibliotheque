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
	

}
