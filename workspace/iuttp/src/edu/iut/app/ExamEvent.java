package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
/**
 * <b>ExamEvent est la classe représentant un examen, passage du compte rendu de stage</b>
 * @author Schlange
 *
 */
public class ExamEvent {
	/**
	 * La date de l'examen
	 * @see Date
	 */
	protected Date examDate;
	/**
	 * L'élève qui passe son compte rendu
	 * @see Person
	 */
	protected Person student;
	/**
	 * Les Professeurs Jury de la personne
	 * @see Person
	 * @see ArrayList
	 */
	protected ArrayList<Person> jury;
	/**
	 * La salle de l'examen
	 * @see Classroom
	 */
	protected Classroom classroom;
	/**
	 * La liste des Documents necessaires lord du compte rendu
	 * @see ArrayList
	 */
	protected ArrayList<Document> documents;
	/**
	 * Création d'un ExamEvent vide
	 */
	public ExamEvent() {		
	}
	/**
	 * Création d'un ExamEvent complet
	 * @param date
	 * @param person
	 * @param jury
	 * @param classRoom
	 * @param document
	 */
	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
			Classroom classRoom, ArrayList<Document> document) {
		this.examDate = date;
		this.student=person;
		this.jury=jury;
		this.classroom=classRoom;
		this.documents=document;
}
	/**
	 * Création d'un ExamEvent sans Jury
	 * @param date
	 * @param person
	 * @param classRoom
	 * @param document
	 */
	public ExamEvent(Date date, Person person,
			Classroom classRoom, ArrayList<Document> document) {
		this.examDate = date;
		this.student=person;
		this.classroom=classRoom;
		this.documents=document;
}
	
	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Person getStudent() {
		return student;
	}

	public void setStudent(Person student) {
		this.student = student;
	}

	public ArrayList<Person> getJury() {
		return jury;
	}

	public void setJury(ArrayList<Person> jury) {
		this.jury = jury;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}
	
	
	
}
