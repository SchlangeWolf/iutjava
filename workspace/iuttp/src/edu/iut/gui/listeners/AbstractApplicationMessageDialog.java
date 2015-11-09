package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements
IApplicationLogListener {


	@Override
	public void newMessage(String level, String message) {
	 this.message=message;
	 this.level=level;
	 
	}
	
	/* TP1 ajouter une méthode abstraite showMessage */

}
