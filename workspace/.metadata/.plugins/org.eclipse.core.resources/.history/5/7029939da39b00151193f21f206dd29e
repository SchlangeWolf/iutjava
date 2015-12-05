package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ExamEventClassroom implements CritereExamEvent{
		
	private ExamEvent exa;
	
	public ExamEventClassroom(ExamEvent exam) {
		// TODO Auto-generated constructor stub
		this.exa=exam;
		
	}
	
	public ExamEvent getExa() {
		return exa;
	}

	public void setExa(ExamEvent exa) {
		this.exa = exa;
	}

	@Override
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
