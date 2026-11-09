package biblio.dao;

public class NonExistAuthorException extends Exception {
	
	public NonExistAuthorException() {
		super("Enregistrement impossible : auteur inexistant");
	}
}
