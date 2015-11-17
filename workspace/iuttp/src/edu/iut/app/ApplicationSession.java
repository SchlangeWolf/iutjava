package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	
	// Exercice 1 : G�rer l'internationation
	protected  ResourceBundle resourceBundle;
	protected Locale locale;
	
	//bonjour
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;
	static ApplicationSession session = null;
	
	
	private ApplicationSession() {
		/* Definir US comme locale par d�faut */
		Locale.setDefault(Locale.US);
		
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("iut_tp", locale);
		
		sessionGuiLogger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("IUTException");
		sessionExceptionLogger.setLevel(Level.ALL);
	}
	
	public static ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("fr",locale);
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
}
