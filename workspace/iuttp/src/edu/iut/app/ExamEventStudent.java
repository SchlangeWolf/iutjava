package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
 * <b>ExamEventStudent est la classe filtrant les ExamEvent partageant le m�me etudiant que l'ExamEvent r�f�rent</b>
 * @see ExamEvent
 * @see Person
 * @author Schlange
 *
 */
public class ExamEventStudent implements CritereExamEvent {
	/**
	 * L'ExamEvent de r�f�rence
	 */
	private ExamEvent exa;
	/**
	 * Cr�ation du filtre � partir d'un ExamEvent existant
	 * @param exam
	 */
	public ExamEventStudent(ExamEvent exam) {
		// TODO Auto-generated constructor stub
		this.exa=exam;
	}
	/**
	 * Cr�ation du filtre � partir d'un �l�ve existant
	 * @param dat
	 */
	public ExamEventStudent(Person stud){
		this.exa=new ExamEvent();
		this.exa.setStudent(stud);
	}
	/**
	 * Filtrage de la list partageant le m�me etudiant
	 * @param examevent
	 * @return List<ExamEvent>
	 */
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent) {
		
		List<ExamEvent> StudentExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if(exams.getStudent().toString()==this.exa.getStudent().toString()){
				StudentExamEvent.add(exams);
			}
		}
		
		return StudentExamEvent;
	}

}
