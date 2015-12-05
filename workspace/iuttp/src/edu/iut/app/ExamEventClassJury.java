package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
 * <b>ExamEventClassJury est la classe permettant de filtrer une liste de ExamEvent ayant le même jury que l'ExamEvent de référence</b>
 * @see ExamEvent
 * @see Person
 * @author Schlange
 *
 */
public class ExamEventClassJury implements CritereExamEvent {
	/**
	 * L'ExamEvent de référence
	 */
	private ExamEvent exa;
	
	/**
	 * Création d'un filtre à partir d'un ExamEvent existant
	 * @see ExamEvent
	 * @param exam
	 */
	public ExamEventClassJury(ExamEvent exam) {
		// TODO Auto-generated constructor stub
		this.exa=exam;
	}
	/**
	 * Création d'un filtre à partir d'un Jury existant et d'une nouvelle classe
	 * @param jury
	 * @param clas
	 * @see ExamEvent
	 * @see ArrayList
	 */
	public ExamEventClassJury(ArrayList jury, String clas) {
		// TODO Auto-generated constructor stub
		this.exa=new ExamEvent();
		this.exa.setJury(jury);
		this.exa.setClassroom(new Classroom(clas));
	}
	/**
	 * Création d'un filtre à partir d'un Jury existant et d'une classe existante
	 * @param jury
	 * @param clas
	 * @see ExamEvent
	 * @see Classroom
	 * @see ArrayList
	 */
	public ExamEventClassJury(ArrayList jury, Classroom clas) {
		// TODO Auto-generated constructor stub
		this.exa=new ExamEvent();
		this.exa.setJury(jury);
		this.exa.setClassroom(clas);
	}
	

	/**
	 * Filtrage de la list donnée avec l'ExamEvent de référence
	 * @param examevent
	 * @return List<ExamEvent>
	 */
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent) {
		
		List<ExamEvent> ClassJuryExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if((exams.getJury().toString()==this.exa.getJury().toString())&&(exams.getClassroom().toString()==this.exa.getClassroom().toString())){
				ClassJuryExamEvent.add(exams);
			}
		}
		
		return ClassJuryExamEvent;
	}
	
	

}
