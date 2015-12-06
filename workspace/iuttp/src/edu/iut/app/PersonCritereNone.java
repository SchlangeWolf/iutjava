package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

/**
* <b>PersonCritereNone permet de filtrer une liste de Person en ne gardant que ceux n'ayant pas de fontion/b>
* @see Person
* @see ArrayList
* @see List
* @author Schlange
*
*/
public class PersonCritereNone implements PersonCritere {
	/**
	 * Effectue le filtre
	 * @return La liste des Person n'ayant pas de fonction
	 */
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> nonePersons = new ArrayList<Person>();
		
		for(Person pers : persons){
			if(pers.getFunction().toString().equalsIgnoreCase("None")){
				nonePersons.add(pers);
			}
		}
		
		return nonePersons;
	}
}
