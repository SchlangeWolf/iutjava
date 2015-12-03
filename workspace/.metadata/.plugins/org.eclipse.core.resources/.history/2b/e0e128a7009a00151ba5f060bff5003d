package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventStudent implements CritereExamEvent {

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent, ExamEvent exam) {
		
		List<ExamEvent> StudentExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if(exams.getStudent().toString()==exam.getStudent().toString()){
				StudentExamEvent.add(exams);
			}
		}
		
		return StudentExamEvent;
	}

}
