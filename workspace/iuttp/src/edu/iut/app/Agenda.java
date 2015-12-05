package edu.iut.app;

import java.util.LinkedList;
/**
 * <b>Agenda est la classe contenant tous les ExamEvents dans une list</b>
 * @see ExamEvent
 * @see LinkedList
 * @author Schlange
 *
 */

public class Agenda extends LinkedList<ExamEvent> {
	
	/**
	 * Création d'un agenda vide
	 */
	public Agenda() {	
	}
	/**
	 * Création d'un agenda plein
	 * @param exams
	 */
	public Agenda(LinkedList<ExamEvent> exams){
		super(exams);
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
