package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import main.DatabaseController;
import main.DatabaseMain;

public class Frame extends JFrame {
	
	/**
	 * window object to structure program frame
	 */
	public Frame() {
		this.setTitle("Database Management");
		this.setJMenuBar(createFrameMenu());
		this.setSize(800, 600);
		this.getContentPane().setLayout(new BorderLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * window taskbar menu and action listeners for menu buttons 
	 * @return
	 */
	public JMenuBar createFrameMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu connectionMenu = new JMenu("Connection");
		JMenuItem connectItem = new JMenuItem("Make Connection");
		JMenuItem closeItem = new JMenuItem("Close Connection");
		JMenu fileMenu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		JMenu aboutMenu = new JMenu("About");
		JMenuItem infoItem = new JMenuItem("Info");
		JMenuItem logOnItem = new JMenuItem("Sign In");
		JMenuItem logOffItem = new JMenuItem("Sign Out");
		
		connectItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DatabaseMain.startConnection();
			}
		});
		closeItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
	//			DatabaseMain.dbc.closeConnection(DatabaseMain.con);
			}
		});

		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(DO_NOTHING_ON_CLOSE);
			}
		});

		infoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO show information page
			}
		});
		
		logOnItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DatabaseMain.logOff();
			}
		});
		
		logOffItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DatabaseMain.logOff();
			}
		});

		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		connectionMenu.add(connectItem);
		connectionMenu.add(closeItem);
		connectionMenu.add(logOnItem);
		connectionMenu.add(logOffItem);
		menuBar.add(connectionMenu);
		aboutMenu.add(infoItem);
		menuBar.add(aboutMenu);
		return menuBar;
	}
}
