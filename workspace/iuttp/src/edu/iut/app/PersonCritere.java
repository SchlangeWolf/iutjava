package edu.iut.app;
import java.util.List;
/**
* <b>PersonCritere est l'interface qui permet de créer des classes de classement par Critère des Person</b>
* @see Person
* @see List
* @author Schlange
*
*/
public interface PersonCritere {
	public List<Person> meetCriteria(List<Person> persons);
}
