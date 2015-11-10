package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends AbstractApplicationMessageDialog {


	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Erreur");
		
	}

	@Override
	public void newMessage(String level, String message) {
		// TODO Auto-generated method stub
		this.showMessage();
		
		
		
	}
	

}
