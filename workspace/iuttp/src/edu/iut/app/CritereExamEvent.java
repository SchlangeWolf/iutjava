package edu.iut.app;

import java.util.List;
/**
* <b>CritereExamEvent est l'interface qui permet de créer des classes de classement par Critère des ExamEvent</b>
* @see ExamEvent
* @see List
* @author Schlange
*
*/
public interface CritereExamEvent {
	public List<ExamEvent> meetCriteria(List<ExamEvent>examevent);

}
