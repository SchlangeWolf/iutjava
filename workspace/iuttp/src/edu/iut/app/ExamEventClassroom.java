package edu.iut.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * <b>Agenda est la classe contenant tous les ExamEvents dans une list</b>
 * @see ExamEvent
 * @see LinkedList
 * @author Schlange
 *
 */
public class ExamEventClassroom implements CritereExamEvent{
	
	/**
	 * L'ExamEvent de r�f�rence
	 */
	private ExamEvent exa;
	
	/**
	 * Cr�ation du filtre � partir d'un ExamEvent existant
	 * @param exam
	 */
	public ExamEventClassroom(ExamEvent exam) {
		this.exa=exam;
	}
	/**
	 * Cr�ation du filtre � partir d'une classe existante
	 * @param clas
	 */
	public ExamEventClassroom(Classroom clas) {
		this.exa=new ExamEvent();
		this.exa.setClassroom(clas);
	}
	/**
	 * Cr�ation du filtre � partir d'une nouvelle Classe
	 * @param clas
	 */
	public ExamEventClassroom(String clas) {
		
		this.exa=new ExamEvent();
		this.exa.setClassroom(new Classroom(clas));
		
	}

	/**
	 * Filtrage de la list en fontion du ExamEvent r�f�rent
	 * @param examevent
	 */
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent) {
		
		List<ExamEvent> ClassroomExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if(exams.getClassroom().toString()==this.exa.getClassroom().toString()){
				ClassroomExamEvent.add(exams);
			}
		}
		
		return ClassroomExamEvent;
	}
	
	

}
