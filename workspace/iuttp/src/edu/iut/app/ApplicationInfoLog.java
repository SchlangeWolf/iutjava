package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
        super.fireMessage("[INFO]", this.message);
	}

}
