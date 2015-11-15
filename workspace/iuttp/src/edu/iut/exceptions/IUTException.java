package edu.iut.exceptions;

import edu.iut.app.ApplicationSession;

// Exercice 2 
public class IUTException extends ApplicationSession{
	public IUTException() {
		super();
		// Logger une erreur avec le message empty en utilisant le singleton session, ie le logger défini dans la session */
		ApplicationSession.instance().getGUILogger().severe("empty");
		

	}
	public IUTException(IUTException e) {
		super (e.instance().getGUILogger());
		// Logger une erreur avec le message contenu dans 'e'  en utilisant le singleton session, ie le logger défini dans la session */
	}
	public IUTException(String message) {
		super(message);
		// Logger une erreur avec le message contenu dans 'message'  en utilisant le singleton session, ie le logger défini dans la session */
	}
	
}
