package edu.iut.app;
import java.util.List;
/**
* <b>DocCritere est l'interface qui permet de cr�er des classes de classement par Crit�re des Document</b>
* @see Document
* @see List
* @author Schlange
*
*/
public interface DocCritere {
	public List<Document> meetCriteria(List<Document> docs);
}
