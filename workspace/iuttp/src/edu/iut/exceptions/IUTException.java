package edu.iut.exceptions;
/**
 * IUTException permet de g�rer les exceptions de l'application
 * @see Exception
 * @author Wilhelm
 *
 */
public class IUTException extends Exception {
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	public IUTException(IUTException e) {
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
