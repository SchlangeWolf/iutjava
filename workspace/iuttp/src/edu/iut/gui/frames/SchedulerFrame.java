package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;
	
	protected void setupUI() {
		
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu;
		JMenu menuEdition;
		JMenu menuView;
		JMenu menuAide;
		
		JMenuItem menuItem;
		
		
		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/
		
		
		
		menu = new JMenu("File");
		menuEdition= new JMenu("Edit");
		menuView= new JMenu("View");
		menuAide= new JMenu("Help");
		
		
		JMenuItem menuItem1=new JMenuItem("Load");
		JMenuItem menuItem2=new JMenuItem("Save");
		JMenuItem menuItem3=new JMenuItem("Quit");
		
		JMenuItem menuItem4=new JMenuItem("View");
		JMenuItem menuItem5=new JMenuItem("Month");
		JMenuItem menuItem6=new JMenuItem("Week");
		JMenuItem menuItem7=new JMenuItem("Day");
		
		JMenuItem menuItem8=new JMenuItem("Display");
		JMenuItem menuItem9=new JMenuItem("About");
		
		menuItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null,"Fonctionnalité pas prêt !");
				
			}
		});
		
		menuItem2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null,"Fonctionnalité pas prêt !");
				
			}
		});
		
		menuItem3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				dispose();
				
			}
		});
		
		menuItem8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null,"Fonctionnalité pas prêt !");
				
			}
		});
		
		menuItem9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null,"Fonctionnalité pas prêt !");
				
			}
		});
		
		
		menu.add(menuItem2);
		menu.add(menuItem3);
		
		menuView.add(menuItem5);
		menuView.add(menuItem6);
		menuView.add(menuItem7);
		
		menuEdition.add(menuView);
		
		menuAide.add(menuItem8);
		menuAide.add(menuItem9);
		
		menuBar.add(menu);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);
		menuBar.add(menu);
		menuBar.add(menuEdition);
		menuBar.add(menuAide);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		this.pack();
		layerLayout.next(contentPane);
	}
	
	public SchedulerFrame() {
		super();
		
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}
	
	public static void main(String[] args)
	{
		new SchedulerFrame();
	}

	
	
	
}
