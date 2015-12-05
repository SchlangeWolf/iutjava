package edu.iut.app;

/**
 * <b>Document est la classe repr�sentant un document par son url</b>
 * @author Schlange
 *
 */
public class Document {

	protected String documentURI;
	/**
	 * Cr�ation d'un Document vide
	 */
	public Document() {
		documentURI="";
	}
	/**
	 * Cr�ation d'un document � partir de son url
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
