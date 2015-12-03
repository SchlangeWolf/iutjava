package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventClassJury implements CritereExamEvent {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent, ExamEvent exam) {
		
		List<ExamEvent> ClassJuryExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if((exams.getJury().toString()==exam.getJury().toString())&&(exams.getClassroom().toString()==exam.getClassroom().toString())){
				ClassJuryExamEvent.add(exams);
			}
		}
		
		return ClassJuryExamEvent;
	}
	
	

}
