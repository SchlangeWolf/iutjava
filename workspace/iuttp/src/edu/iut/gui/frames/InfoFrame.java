package edu.iut.gui.frames;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class InfoFrame extends JFrame implements ActionListener{ 
	
	private JFrame frame;
	
	private JLabel function;
	private JLabel firstname;
	private JLabel lastname;
	private JLabel email;
	private JLabel phone;
	private JLabel jury;
	private JLabel date;
	private JLabel classroom;
	private JLabel document;
	
	private JButton creer;
	
	private JTextField fonction;
	private JTextField nom;
	private JTextField prenom;
	private JTextField mail;
	private JTextField tel;
	private JTextField jr;
	private JTextField dat;
	private JTextField salle;
	private JTextField doc;
	
	private JPanel pnllbl;
	private JPanel pnlbtn;
	
	private ExamEvent exam;

	
	public InfoFrame(ExamEvent exam)
	{	
		this.exam=exam;
		frame=new JFrame("Information examen");
		
		pnllbl=new JPanel();
		pnlbtn=new JPanel();
		
		function=new JLabel("Function :");
		fonction=new JTextField(20);
		
		firstname=new JLabel("First name :");
		nom=new JTextField(20);
		
		lastname=new JLabel("Last name :");
		prenom=new JTextField(20);
		
		email=new JLabel("email :");
		mail=new JTextField(10);
		
		phone=new JLabel("Phone number :");
		tel=new JTextField(10);
		
		jury=new JLabel("Jury number:");
		jr=new JTextField(3);
		
		date=new JLabel("Date :");
		dat=new JTextField(10);
		
		classroom=new JLabel("Classroom number :");
		salle=new JTextField(3);
		
		document=new JLabel("Nom document:");
		doc=new JTextField(10);
		
		creer=new JButton("Creer examen");
		creer.addActionListener(this);
		
		pnllbl.add(function);
		pnllbl.add(fonction);
		
		pnllbl.add(firstname);
		pnllbl.add(nom);
		
		pnllbl.add(lastname);
		pnllbl.add(prenom);
		
		pnllbl.add(email);
		pnllbl.add(mail);
		
		pnllbl.add(phone);
		pnllbl.add(tel);
		
		pnllbl.add(jury);
		pnllbl.add(jr);
		
		pnllbl.add(date);
		pnllbl.add(dat);
		
		pnllbl.add(classroom);
		pnllbl.add(salle);
		
		pnllbl.add(document);
		pnllbl.add(doc);
		pnlbtn.add(creer);

		
		frame.setVisible(true);
		
		frame.pack();
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.add(pnllbl,BorderLayout.CENTER);
		frame.add(pnlbtn,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnllbl.setLayout(new GridLayout(10,2));	

		
	}
	
	public static void main(String args[])
	{	
		ExamEvent exam=new ExamEvent();
		new InfoFrame(exam);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==creer)
		{
			//new ExamEvent(new Date(dat.getText()),new Person(fonction.getText(),nom.getText(),prenom.getText(),mail.getText(),tel.getText()), jury,salle.getText(), document)
		}
	}




}
