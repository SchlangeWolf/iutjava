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

	
	public void setMessage(String message){
		
		this.message = message;
		for(IApplicationLogListener l:listeners)
		{
			l.newMessage("[ERROR]",message);
		}
      
	}

	

	@Override
	public ArrayList<IApplicationLogListener> getTabListener() {
		// TODO Auto-generated method stub
		return this.listeners;
	}

	@Override
	public ArrayList<IApplicationLogListener> getApplicationLogListeners() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
