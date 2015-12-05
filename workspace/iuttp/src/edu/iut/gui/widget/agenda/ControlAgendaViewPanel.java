package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.Agenda;
import edu.iut.app.ApplicationSession;
import edu.iut.app.ExamEvent;
import edu.iut.gui.frames.InfoFrame;

public class ControlAgendaViewPanel extends JPanel implements ActionListener {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	JSpinner annee;
	JComboBox<String>mois;
	JComboBox<String>jour;
	JButton creer;
	JButton supprimer;
	private Agenda agenda;
	
	
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		
		new Agenda();
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		annee= new JSpinner(new SpinnerNumberModel(2015, 2010, 2020, 1));
		add(annee);
		mois= new JComboBox<String> (ApplicationSession.instance().getMonths());
		add(mois);
		jour= new JComboBox<String> (ApplicationSession.instance().getDays());
		add(jour);
		creer=new JButton("Create an exam");
		creer.addActionListener(this);
		supprimer=new JButton("Delete an exam");
		add(creer);
		add(supprimer);
		
	}
	
	public int getYear() {
		return selectedYear;
	}
	public int getMonth() {
		return selectedMonth;
	}
	public int getDay() {
		return selectedDay;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==creer)
		{
			new InfoFrame(new Agenda());
		}
		
	}

	
	
	
	

	
}
