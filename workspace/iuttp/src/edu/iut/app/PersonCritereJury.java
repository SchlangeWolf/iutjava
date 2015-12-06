package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
* <b>PersonCritereJury permet de filtrer une liste de Person en ne gardant que les Jury/b>
* @see Person
* @see ArrayList
* @see List
* @author Schlange
*
*/
public class PersonCritereJury implements PersonCritere{
	
	/**
	 * Effectue le filtre
	 * @return La liste des Person étant jury
	 */
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> juryPersons = new ArrayList<Person>();
		
		for(Person pers : persons){
			if(pers.getFunction().toString().equalsIgnoreCase("Jury")){
				juryPersons.add(pers);
			}
		}
		
		return juryPersons;
	}

}
