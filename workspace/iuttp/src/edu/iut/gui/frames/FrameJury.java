package edu.iut.gui.frames;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.iut.app.ExamEvent;

public class FrameJury extends JFrame implements ActionListener{
	
	private JFrame fenetre;
	
	private JLabel jury;
	
	private JTextField jr;
	
	private JButton Ajoutjr;
	
	private JPanel pnllbl;
	private JPanel pnlajoutjr;
	private JPanel pnlbtn;
	private JButton creerexam;
	
	private ExamEvent exam;
	
	
	
	
	public FrameJury(ExamEvent exam)
	{
		this.exam=exam;
		fenetre=new JFrame("Information Jury");
		
		jury=new JLabel("Jury :");
		jr=new JTextField(10);
		
		Ajoutjr=new JButton("Ajout jury");
		creerexam=new JButton("Creer exam");
		
		pnllbl=new JPanel();
		pnlajoutjr=new JPanel();
		
		pnlbtn=new JPanel();
		
		pnllbl.add(jury);
		pnlajoutjr.add(jr);
		pnlajoutjr.add(Ajoutjr);
		pnlbtn.add(creerexam);
		
		
		fenetre.setVisible(true);
		
		fenetre.pack();
		fenetre.setSize(300, 150);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setLayout(new BorderLayout());
		fenetre.add(pnllbl,BorderLayout.WEST);
		fenetre.add(pnlajoutjr,BorderLayout.EAST);
		fenetre.add(pnlbtn,BorderLayout.SOUTH);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnllbl.setLayout(new GridLayout(1,1));
		pnlajoutjr.setLayout(new GridLayout(2,1));
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamEvent exam=new ExamEvent();
		new FrameJury(exam);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==creerexam)
		{
			
		}
	}

}
