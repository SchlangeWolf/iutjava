package edu.iut.app;
import java.util.List;
/**
* <b>PersonCritere est l'interface qui permet de cr�er des classes de classement par Crit�re des Person</b>
* @see Person
* @see List
* @author Schlange
*
*/
public interface PersonCritere {
	public List<Person> meetCriteria(List<Person> persons);
}
