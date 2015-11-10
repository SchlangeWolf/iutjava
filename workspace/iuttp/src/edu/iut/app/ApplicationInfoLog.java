package edu.iut.app;

import java.util.ArrayList;

public class ApplicationInfoLog extends AbstractApplicationLog {
	

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
        super.fireMessage("[INFO]", this.message);
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
