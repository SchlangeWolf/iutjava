package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventDate implements CritereExamEvent {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent>examevent,ExamEvent exam) {
		// TODO Auto-generated method stub
		List<ExamEvent> DateExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if(exams.getExamDate().toString()==exam.getExamDate().toString()){
				DateExamEvent.add(exams);
			}
		}
		
		return DateExamEvent;
	}
	}


