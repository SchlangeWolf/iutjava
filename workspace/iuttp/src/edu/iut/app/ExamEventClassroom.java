package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventClassroom implements CritereExamEvent{

	@Override
	public List<ExamEvent> meetCriteria(List<ExamEvent> examevent, ExamEvent exam) {
		
		List<ExamEvent> ClassroomExamEvent = new ArrayList<ExamEvent>();
		
		for(ExamEvent exams : examevent){
			if(exams.getClassroom().toString()==exam.getClassroom().toString()){
				ClassroomExamEvent.add(exams);
			}
		}
		
		return ClassroomExamEvent;
	}

}
