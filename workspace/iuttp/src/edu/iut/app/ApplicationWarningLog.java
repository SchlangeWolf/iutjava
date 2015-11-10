package edu.iut.app;

import java.util.ArrayList;

public class ApplicationWarningLog extends AbstractApplicationLog {
	

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public ArrayList<IApplicationLogListener> getApplicationLogListeners() {
		// TODO Auto-generated method stub
		return listeners;
	}

	@Override
	public ArrayList<IApplicationLogListener> getTabListener() {
		// TODO Auto-generated method stub
		return null;
	}
}
