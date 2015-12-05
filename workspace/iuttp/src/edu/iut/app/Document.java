package edu.iut.app;

/**
 * <b>Document est la classe représentant un document par son url</b>
 * @author Schlange
 *
 */
public class Document {

	protected String documentURI;
	/**
	 * Création d'un Document vide
	 */
	public Document() {
		documentURI="";
	}
	/**
	 * Création d'un document à partir de son url
	 * @param documentURI
	 */
	public Document(String documentURI) {
		/* EX2 : Affectation */
		this.documentURI=documentURI;
	}
	
	public void setDocumentURI(String number) {
		this.documentURI = number;
	}
	public String getDocumentURI() {
		return documentURI;
	}
	
	
}
