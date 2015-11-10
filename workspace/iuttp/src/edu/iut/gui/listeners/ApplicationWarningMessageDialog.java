package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationWarningMessageDialog extends AbstractApplicationMessageDialog {

	@Override
	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		
		System.out.println("WARNING");
	}

	@Override
	public void newMessage(String level, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		
	}

	

}
