package edu.iut.app;
/**
 * <b>Person est la classe représentant les personnes concernées par les stages</b>
 * @author Wilhelm
 *
 */
public class Person {
	/**
	 * la fonction de la personne (enumeration des valeurs possibles ci-dessous
	 */
	protected PersonFunction personFunction;
	/**
	 * le prenom de la personne
	 */
	protected String firstname;
	/**
	 * le nom de famille de la personne
	 */
	protected String lastname;
	/**
	 * l'email de la personne
	 */
	protected String email;
	/**
	 * le numéro de téléphone de la personne
	 */
	protected String phone;
	/**
	 * Ceci est une énumération des valeurs possibles de la donftion d'une personne
	 * @author Wilhelm
	 *
	 */
	public enum PersonFunction{
		/* EX2 : Internationalisation */
		/**
		 * si la personne n'a pas encore de fonction
		 */
		NONE("None"),
		/**
		 * si la personne fait partie d'un Jury
		 */
		JURY("Jury"),
		/**
		 * Si la personne est un étudiant
		 */
		STUDENT("Student");
		/**
		 * la fonction de la personne
		 */
		private String personFunction;
		/**
		 * affectation de la fonction de la personne
		 * @param personFunction
		 */
		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}
		/**
		 * renvoi la fonction de la personne
		 */
		public String toString() {
			return personFunction;
		}		
	}
	/**
	 * Création d'une personne vide
	 */
	public Person() {
		personFunction = PersonFunction.NONE;
	}
	/**
	 * Création d'une personne complète
	 * @param personFunction
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 */
	public Person(PersonFunction personFunction,
				  String firstname,
				  String lastname,
				  String email,
				  String phone) {
		/* EX2: initialisation */
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.phone=phone;
	}
	
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}
	public PersonFunction getFunction() {
		return personFunction;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}

}
