import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ConfirmationPage extends JPanel {
	private JPanel confirmationPanel;
	private JLabel confirmationLabel;
	private JPanel backToMainScreenPanel;
	private JLabel mainScreenLabel;
	private JButton toMainScreen;
	
	ConfirmationPage(){
		//Confirmation panel
		confirmationPanel = new JPanel();
		confirmationPanel.setPreferredSize(new Dimension(1000, 100));
		confirmationPanel.setBackground(Color.blue);	
		confirmationLabel = new JLabel();
		confirmationPanel.add(confirmationLabel);
		confirmationLabel.setText("Confirmation number:" + randomNumber(10000,99999)
		                          + ", Seat: ");//seat comes in here(database)
		confirmationLabel.setFont(new Font("Courier New", Font.BOLD, 36));
		
		//Back to main screen panel
		backToMainScreenPanel = new JPanel();
		backToMainScreenPanel.setPreferredSize(new Dimension(1000, 100));
		backToMainScreenPanel.setBackground(Color.white);
		mainScreenLabel = new JLabel();
		backToMainScreenPanel.add(mainScreenLabel);
		mainScreenLabel.setText("Back to Main Screen.");
		mainScreenLabel.setFont(new Font("Courier New", Font.BOLD, 36));
		toMainScreen = new JButton();
		toMainScreen.setPreferredSize(new Dimension(30,30));
		MainScreenListener listener = new MainScreenListener();
		toMainScreen.addActionListener(listener);
		
		//background
		JPanel background = new JPanel();
		BoxLayout layout = new BoxLayout(background, BoxLayout.Y_AXIS);
		background.setLayout(layout);
		setPreferredSize(new Dimension(1000, 1050));
		setBackground(Color.black);
		
		//adding panels to screen
		add(confirmationPanel);
		add(backToMainScreenPanel);
		}
	private class MainScreenListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == toMainScreen) {
				//goes to main screen
			}
		}
	}
	public int randomNumber(int min, int max) {
		int newNumber;
		Random r = new Random();
		newNumber = r.nextInt((max - min) + 1) + min;
		return newNumber;
	}
	public static void main(String[]args) {
		JFrame frame = new JFrame("Welcome"); //What it says at top of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ConfirmationPage panel = new ConfirmationPage(); 
		frame.getContentPane().add(panel);
		frame.pack(); 
		frame.setVisible(true);
	}

}
