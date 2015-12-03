package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventJury implements CritereExamEvent {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent, ExamEvent exam) {
		
		List<ExamEvent> JuryExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if(exams.getJury().toString()==exam.getJury().toString()){
				JuryExamEvent.add(exams);
			}
		}
		
		return JuryExamEvent;
	}
	}


