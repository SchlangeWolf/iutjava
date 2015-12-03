package edu.iut.app;

import java.util.ArrayList;
import java.util.List;
/**
* <b>ClassCritereNum permet de trier une list de Classroom en fonction de leur num�ro
* @see ClassRoom
* @see List
* @author Schlange
*
*/
public class ClassCritereNum implements ClassCritere {
	
	/**
	 * <b>Cette Classroom sert de r�f�rente pour le trie</b>
	 */
	private Classroom clas;
	
	/**
	 * Permet d'initialiser le critere � partir d'une Classroom deja existante
	 * @param roomPrincp
	 * 		La ClassRoom que l'on va comparer
	 */
	public ClassCritereNum(Classroom roomPrincp){
		this.clas=roomPrincp;
	}
	/**
	 * Permet d'initialiser le critere � partir d'une nouvelle Classroom ou d'un num�ro
	 * @param roomPrincp
	 * 		Cr�er une Classroom avec ce num�ro
	 */
	public ClassCritereNum(String roomPrincp){
		this.clas= new Classroom(roomPrincp);
	}
	/**
	 * Effectue le filtre
	 * @return La liste des Classroom corespondant au crit�re
	 */
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
	
	public void setClas(Classroom clas) {
		this.clas = clas;
	}
	
	
}
