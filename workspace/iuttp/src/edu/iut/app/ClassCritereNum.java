package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class ClassCritereNum implements ClassCritere {
	
	private Classroom clas;
	
	public List<Classroom> comparer(Classroom roomPrincp, List<Classroom> room){
		this.clas=roomPrincp;
		
		return meetCriteria(room);
	}
	
	public List<Classroom> comparer(String roomPrincp, List<Classroom> room){
		this.clas= new Classroom(roomPrincp);
		
		return meetCriteria(room);
	}
	
	public List<Classroom> meetCriteria(List<Classroom> room) {
		// TODO Auto-generated method stub
		List<Classroom> ret = new ArrayList<Classroom>();
		
		for(Classroom clas : room){
			if(clas.getClassRoomNumber().equalsIgnoreCase(this.clas.getClassRoomNumber()) && !(clas.getClassRoomNumber().equalsIgnoreCase(Classroom.noAffect))){
				ret.add(clas);
			}
		}
		
		return ret;
	}

}
