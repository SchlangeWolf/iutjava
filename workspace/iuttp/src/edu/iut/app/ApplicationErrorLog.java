package edu.iut.app;

import java.util.ArrayList;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		super();
	}

	@Override
	public String getMessage() {
		return this.message;
		
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		String level=null;
		for(IApplicationLogListener l:listeners)
		{
			l.newMessage(level,message);
		}
		
	}

	

	@Override
	public ArrayList<IApplicationLogListener> getTabListener() {
		// TODO Auto-generated method stub
		return this.listeners;
	}

	@Override
	public IApplicationLogListener getApplicationLogListeners() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
