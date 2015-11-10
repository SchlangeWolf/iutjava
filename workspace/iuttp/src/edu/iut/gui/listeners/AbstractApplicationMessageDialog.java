package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements IApplicationLogListener {

	
	/* TP1 ajouter une méthode abstraite showMessage */
	public abstract void showMessage();

	protected void showMessage(String level, String message) {
		// TODO Auto-generated method stub
		
	}
	
	
}
