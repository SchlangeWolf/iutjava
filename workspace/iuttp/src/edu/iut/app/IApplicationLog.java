package edu.iut.app;

public interface IApplicationLog {
	/** TP1 : Cr��rr les m�thodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener Listener);
	public IApplicationLogListener getApplicationLogListeners();
	
}
