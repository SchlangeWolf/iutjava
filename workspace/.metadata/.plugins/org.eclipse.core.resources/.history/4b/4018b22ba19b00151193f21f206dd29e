package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventClassJury implements CritereExamEvent {
	
	private ExamEvent exa;
	
	public ExamEventClassJury(ExamEvent exam) {
		// TODO Auto-generated constructor stub
		this.exa=exam;
	}

	@Override
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
