package edu.iut.app;

import java.util.List;
/**
* <b>CritereExamEvent est l'interface qui permet de cr�er des classes de classement par Crit�re des ExamEvent</b>
* @see ExamEvent
* @see List
* @author Schlange
*
*/
public interface CritereExamEvent {
	public List<ExamEvent> meetCriteria(List<ExamEvent>examevent);

}
