package battleBots;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class BattleGui implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JButton button1;
	static JButton button2;
	static JButton button3;
	static JButton button4;
	static JButton buttonM1;
	static JButton buttonM2;
	static JButton buttonM3;
	static JButton buttonM4;
	static JButton buttonS1;
	static JButton buttonS2;
	static JFrame frame1;
	static JFrame frame2;
	static JFrame frame3;
	static JFrame frame4;
	static JFrame frame5;
	static Horde horde;
	static JTextField minionNameTextField;
	static JTextField minionAttackTextField;
	static JTextField minionHealthTextField;
	static JTextArea westHordeArea;
	static JTextArea eastHordeArea;
	public static void main(String[] args) {
		BattleGui batt = new BattleGui();
		horde = new Horde();
		
		//main frame
		frame1 = new JFrame();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(500,500);
		frame1.setLayout(new BorderLayout(10,10));
		frame1.setTitle("Battle Bots Autobattler");
		frame1.setVisible(true);
		
		JPanel panNM = new JPanel();
		JPanel panCM = new JPanel();
		//JPanel panS = new JPanel();
		JPanel panNH = new JPanel();
		JPanel panCH = new JPanel();
		JPanel panCN = new JPanel();
		JPanel panCC = new JPanel();
		
		JPanel panVN = new JPanel();
		JPanel panVC = new JPanel();
		JPanel panPN = new JPanel();
		JPanel panPC = new JPanel();
		
		
		
		//create buttons
		button1 = new JButton("Help");
		button2 = new JButton("Create");
		button3 = new JButton("View");
		button4 = new JButton("Play");
		buttonM1 = new JButton("Menu");
		buttonM2 = new JButton("Menu");
		buttonM3 = new JButton("Menu");
		buttonM4 = new JButton("Menu");
		buttonS1 = new JButton("Submit Player");
		buttonS2 = new JButton("Submit Opponent");
		
		
		
		//button action listeners
		button1.addActionListener(batt);
		button2.addActionListener(batt);
		button3.addActionListener(batt);
		button4.addActionListener(batt);
		buttonM1.addActionListener(batt);
		buttonM2.addActionListener(batt);
		buttonM3.addActionListener(batt);
		buttonM4.addActionListener(batt);
		buttonS1.addActionListener(batt);
		buttonS2.addActionListener(batt);
		
		//
		
		
		//north main panel setup
		JLabel lablel1 = new JLabel("Welcome to battle bots, a simplistic autobattler.");
		panNM.add(lablel1);
		
		//center main panel setup
		panCM.add(button1);
		panCM.add(button2);
		panCM.add(button3);
		panCM.add(button4);
		
		
		
		//south main panel setup
		//panS.add(button5);
		
		//north help panel setup
		JLabel lablel2 = new JLabel("Welcome to battle bots, choose your stuff. Fight to the death and win. Or not");
		panNH.add(lablel2);
		
		//center help panel setup
		panCH.add(buttonM1);
		
		
		
		//Scanner 
		 //Scanner j1 = new Scanner(System.in);//minion name
		// Scanner j2 = new Scanner(System.in);//minion attack
		 //Scanner j3 = new Scanner(System.in);//minion health
		
		//add panels to frame1
		frame1.add(panCM,BorderLayout.CENTER);
		frame1.add(panNM,BorderLayout.NORTH);
		
		//J
		minionNameTextField = new JTextField("Token");
		minionAttackTextField = new JTextField("1");
		String text1 = minionAttackTextField.getText();
		minionHealthTextField = new JTextField("1");
		String text2 = minionHealthTextField.getText();
		//what do i do here?j1 = f1.
		
		JLabel lablel3 = new JLabel("Create a minion");
		panCN.add(lablel3);
		
		
		//Help frame
		frame2 = new JFrame();
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(500,500);
		frame2.setLayout(new BorderLayout(10,10));
		frame2.setTitle("Battle Bots Help");
		frame2.setVisible(false);	
		
		//add panels to frame2
		frame2.add(panNH,BorderLayout.NORTH); 
		frame2.add(panCH,BorderLayout.CENTER);
		
		panCC.add(minionNameTextField);
		panCC.add(minionAttackTextField);
		panCC.add(minionHealthTextField);
		panCC.add(buttonS1);
		panCC.add(buttonS2);
		panCC.add(buttonM2);
		
		//Create frame
		frame3 = new JFrame();
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setSize(500,500);
		frame3.setLayout(new BorderLayout(10,10));
		frame3.setTitle("Battle Bots Create");
		//frame3.add(panS,BorderLayout.SOUTH);
		frame3.setVisible(false);
		frame3.add(panCN,BorderLayout.NORTH);
		frame3.add(panCC,BorderLayout.CENTER);
		
		
		
		JLabel lablel4 = new JLabel("View created minions");
		panVN.add(lablel4);
		panVC.add(buttonM3);
		
		//View frame
		frame4 = new JFrame();
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setSize(500,500);
		frame4.setLayout(new BorderLayout(10,10));
		frame4.setTitle("Battle Bots Help");
		//frame4.add(panS,BorderLayout.SOUTH);
		frame4.setVisible(false);
		frame4.add(panVN,BorderLayout.NORTH);
		frame4.add(panVC,BorderLayout.CENTER);
		
		panPC.add(buttonM4);
		
		//Play frame
		frame5 = new JFrame();
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setSize(500,500);
		frame5.setLayout(new BorderLayout(10,10));
		frame5.setTitle("Battle Bots Play");
		frame5.setVisible(false);
		frame5.add(panPN,BorderLayout.NORTH);
		frame5.add(panPC,BorderLayout.CENTER);
		//frame5.add(panS,BorderLayout.SOUTH);
		
		
		
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			//JOptionPane.showMessageDialog(button1, "This is the help page");
			frame1.setVisible(false);
			frame2.setVisible(true);
			
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(button2, "This is the create menu, select a type then enter appropriate data");
			frame1.setVisible(false);
			frame3.setVisible(true);
		}
		if(e.getSource() == button3) {
			JOptionPane.showMessageDialog(button3, "This is the view menu");
			frame1.setVisible(false);
			frame4.setVisible(true);
		}
		if(e.getSource() == button4) {
			JOptionPane.showMessageDialog(button4, "This is the play menu");
			JPanel panPW = new JPanel();
			JPanel panPE = new JPanel();
			frame1.setVisible(false);
			frame5.setVisible(true);
			westHordeArea = new JTextArea();
			eastHordeArea = new JTextArea();
			panPE.add(eastHordeArea);
			panPW.add(westHordeArea);
			frame5.add(panPE,BorderLayout.EAST);
			frame5.add(panPW,BorderLayout.WEST);
			
			
			for(Minion minion : horde.horde1) {
				westHordeArea.append(minion.toString()+ "\n");
			}
			for(Minion minion : horde.horde2) {
				eastHordeArea.append(minion.toString()+ "\n");
			}
		}
		if(e.getSource() == buttonM1||e.getSource() == buttonM2||e.getSource() == buttonM3||e.getSource() == buttonM4) {
			JOptionPane.showMessageDialog(buttonM1, "Will return to menu");
			frame1.setVisible(true);
			frame2.setVisible(false);
			frame3.setVisible(false);
			frame4.setVisible(false);
			frame5.setVisible(false);
			}
		
		if(e.getSource() == buttonS1) {
			horde.horde1.add(new Minion(minionNameTextField.getText(), Integer.parseInt(minionAttackTextField.getText()), Integer.parseInt(minionHealthTextField.getText())));
			JOptionPane.showMessageDialog(buttonS1, horde.horde1.get(horde.horde1.size()-1).name);
			
		}
		if(e.getSource() == buttonS2) {
			horde.horde2.add(new Minion(minionNameTextField.getText(), Integer.parseInt(minionAttackTextField.getText()), Integer.parseInt(minionHealthTextField.getText())));
			JOptionPane.showMessageDialog(buttonS2, horde.horde2.get(horde.horde2.size()-1).name);
			
		}
	}

}
