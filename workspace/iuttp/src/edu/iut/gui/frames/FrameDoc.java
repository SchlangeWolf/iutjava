package edu.iut.gui.frames;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.iut.app.ExamEvent;

public class FrameDoc {
	
	private JFrame fenetre;
	
	private JLabel document;
	
	private JTextField doc;
	
	private JButton Ajoutdoc;
	
	private JPanel pnllbl;
	private JPanel pnlajoutdoc;
	private JPanel pnlbtn;
	private JButton suivant;
	
	private ExamEvent exam;
	
	
	
	
	public FrameDoc(ExamEvent exam) {
	
		this.exam=exam;
		fenetre=new JFrame("Information Jury");
		
		document=new JLabel("Document :");
		doc=new JTextField(10);
		
		Ajoutdoc=new JButton("Ajout document");
		suivant=new JButton("Suivant");
		
		pnllbl=new JPanel();
		pnlajoutdoc=new JPanel();
		
		pnlbtn=new JPanel();
		
		pnllbl.add(document);
		pnlajoutdoc.add(doc);
		pnlajoutdoc.add(Ajoutdoc);
		pnlbtn.add(suivant);
		
		
		fenetre.setVisible(true);
		
		fenetre.pack();
		fenetre.setSize(300, 150);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setLayout(new BorderLayout());
		fenetre.add(pnllbl,BorderLayout.WEST);
		fenetre.add(pnlajoutdoc,BorderLayout.EAST);
		fenetre.add(pnlbtn,BorderLayout.SOUTH);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnllbl.setLayout(new GridLayout(1,1));
		pnlajoutdoc.setLayout(new GridLayout(2,1));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FrameDoc(new ExamEvent());
	}

}
