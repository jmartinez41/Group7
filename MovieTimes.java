import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MovieTimes extends JPanel {
	
	private JPanel titlePanel;
	private JPanel timeOnePanel;
	private JPanel timeTwoPanel;
	private JPanel timeThreePanel;
	private JPanel timeFourPanel;
	private JPanel timeFivePanel;
	private JLabel titleLabel;
	private JLabel oneLabel,twoLabel, threeLabel, fourLabel, fiveLabel;
	private JRadioButton time1;
	private JRadioButton time2;
	private JRadioButton time3;
	private JRadioButton time4;
	private JRadioButton time5;
	
	MovieTimes(){
		// displays movie title
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1000, 100));
		titlePanel.setBackground(Color.blue);	
		titleLabel = new JLabel();
		titlePanel.add(titleLabel);
		titleLabel.setText("Times for:          ; please choose one. ");
		titleLabel.setFont(new Font("Courier New", Font.BOLD, 36));
		
		//TimeOnePanel
		timeOnePanel = new JPanel();
		timeOnePanel.setPreferredSize(new Dimension(1000, 100));
		timeOnePanel.setBackground(Color.white);
		oneLabel = new JLabel();
		timeOnePanel.add(oneLabel);
		oneLabel.setText("Time1");
		oneLabel.setFont(new Font("Courier New", Font.BOLD, 30));
		time1 = new JRadioButton();
		timeOnePanel.add(time1);
		time1.setPreferredSize(new Dimension(30,30));
		TimeListener t1Listener = new TimeListener();
		time1.addActionListener(t1Listener);
		
		//TimeTwoPanel
		timeTwoPanel = new JPanel();
		timeTwoPanel.setPreferredSize(new Dimension(1000, 100));
		timeTwoPanel.setBackground(Color.white);
		twoLabel = new JLabel();
		timeTwoPanel.add(twoLabel);
		twoLabel.setText("Time2");
		twoLabel.setFont(new Font("Courier New", Font.BOLD, 30));
		time2 = new JRadioButton();
		timeTwoPanel.add(time2);
		time2.setPreferredSize(new Dimension(30,30));
		TimeListener t2Listener = new TimeListener();
		time2.addActionListener(t2Listener);
		
		//TimeThreePanel
		timeThreePanel = new JPanel();
		timeThreePanel.setPreferredSize(new Dimension(1000, 100));
		timeThreePanel.setBackground(Color.white);
		threeLabel = new JLabel();
		timeThreePanel.add(threeLabel);
		threeLabel.setText("Time3");
		threeLabel.setFont(new Font("Courier New", Font.BOLD, 30));
		time3 = new JRadioButton();
		timeThreePanel.add(time3);
		time3.setPreferredSize(new Dimension(30,30));
		TimeListener t3Listener = new TimeListener();
		time3.addActionListener(t3Listener);
		
		//TimeFourPanel
		timeFourPanel = new JPanel();
		timeFourPanel.setPreferredSize(new Dimension(1000, 100));
		timeFourPanel.setBackground(Color.white);
		fourLabel = new JLabel();
		timeFourPanel.add(fourLabel);
		fourLabel.setText("Time4");
		fourLabel.setFont(new Font("Courier New", Font.BOLD, 30));
		time4 = new JRadioButton();
		timeFourPanel.add(time4);
		time4.setPreferredSize(new Dimension(30,30));
		TimeListener t4Listener = new TimeListener();
		time4.addActionListener(t4Listener);
		
		//TimeFivePanel	
		timeFivePanel = new JPanel();
		timeFivePanel.setPreferredSize(new Dimension(1000, 100));
		timeFivePanel.setBackground(Color.white);
		fiveLabel = new JLabel();
		timeFivePanel.add(fiveLabel);
		fiveLabel.setText("Time5");
		fiveLabel.setFont(new Font("Courier New", Font.BOLD, 30));
		time5 = new JRadioButton();
		timeFivePanel.add(time5);
		time5.setPreferredSize(new Dimension(30,30));
		TimeListener t5Listener = new TimeListener();
		time5.addActionListener(t5Listener);
		
		//background
		JPanel background = new JPanel();
		BoxLayout layout = new BoxLayout(background, BoxLayout.Y_AXIS);
		background.setLayout(layout);
		background.setPreferredSize(new Dimension(1000, 1050));
		background.setBackground(Color.black);
		
		//adds Panels to screen
		background.add(timeOnePanel);
		background.add(timeTwoPanel);
		background.add(timeThreePanel);
		background.add(timeFourPanel);
		background.add(timeFivePanel);
		
	}
	private class TimeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == time1) {
				//goes to seating 
			}
			if(event.getSource() == time2) {
				//goes to seating
			}
			if(event.getSource() == time3) {
				//goes to seating
			}
			if(event.getSource() == time4) {
				//goes to seating
			}
			if(event.getSource() == time5) {
				//goes to seating
			}
		}
	}
	public static void main(String[]args) {
		JFrame frame = new JFrame("Movie Times");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MovieTimes panel = new MovieTimes();
		frame.getContentPane().add(panel);
		frame.pack(); 
		frame.setVisible(true);
	}
}
