import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MovieTimes extends JPanel{
	
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
	String MovieName;
	JFrame f;
	JPanel backPanel;
	private JButton back;
	JLabel goBack;
	
	MovieTimes(String MovieName, JFrame f){
		this.f =f;
		
		//Option to go back to Main Screen if made incorrect selection
		backPanel = new JPanel();
		backPanel.setPreferredSize(new Dimension(500, 75));
		backPanel.setBackground(Color.gray);
		goBack = new JLabel();
		back = new JButton();
		back.setBackground(Color.gray);
		back.setBorderPainted(false);
		back.add(goBack);
		backPanel.add(back);
		goBack.setText("Go Back");
		goBack.setFont(new Font("Century Gothic", Font.BOLD, 36));
		TimeListener backListener = new TimeListener();
		back.addActionListener(backListener);

		
		// displays movie title
		this.MovieName = MovieName;
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1000, 50));
		titlePanel.setBackground(Color.blue);	
		titleLabel = new JLabel();
		titlePanel.add(titleLabel);
		titleLabel.setText( MovieName);
		titleLabel.setFont(new Font("Century Gothic", Font.BOLD, 36));
		
		//TimeOnePanel
		timeOnePanel = new JPanel();
		timeOnePanel.setPreferredSize(new Dimension(1000, 100));
		timeOnePanel.setBackground(Color.white);
		oneLabel = new JLabel();
		timeOnePanel.add(oneLabel);
		oneLabel.setText("Time1");
		oneLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time1 = new JRadioButton();
		time1.setBackground(Color.white);
		time1.setName("Time 1"); //Need to link time to database
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
		twoLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time2 = new JRadioButton();
		time2.setBackground(Color.white);
		time2.setName("Time 2"); //Need to link time to database
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
		threeLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time3 = new JRadioButton();
		time3.setBackground(Color.white);
		time3.setName("Time 3"); //Need to link time to database
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
		fourLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time4 = new JRadioButton();
		time4.setBackground(Color.white);
		time4.setName("Time 4"); //Need to link time to database
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
		fiveLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time5 = new JRadioButton();
		time5.setBackground(Color.white);
		time5.setName("Time 5"); //Need to link time to database
		timeFivePanel.add(time5);
		time5.setPreferredSize(new Dimension(30,30));
		TimeListener t5Listener = new TimeListener();
		time5.addActionListener(t5Listener);
		
		//background
		setPreferredSize(new Dimension(1000, 1050));
		setBackground(Color.black);
		
		//adds Panels to screen
		add(titlePanel);
		add(timeOnePanel);
		add(timeTwoPanel);
		add(timeThreePanel);
		add(timeFourPanel);
		add(timeFivePanel);
		add(backPanel);
		
	}
	private class TimeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == time1) {
				//goes to seating 
				SeatingScreen panel = new SeatingScreen(MovieName,time1.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == time2) {
				//goes to seating
				SeatingScreen panel = new SeatingScreen(MovieName,time2.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == time3) {
				//goes to seating
				SeatingScreen panel = new SeatingScreen(MovieName,time3.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == time4) {
				//goes to seating
				SeatingScreen panel = new SeatingScreen(MovieName,time4.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == time5) {
				//goes to seating
				SeatingScreen panel = new SeatingScreen(MovieName,time5.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == back) {
				//goes to seating
				MainScreen panel = new MainScreen(f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
		}
	}
	
	public static void main(String[]args) {
		JFrame frame = new JFrame("Movie Times");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MovieTimes panel = new MovieTimes("test", frame); 
		frame.getContentPane().add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.pack(); 
		frame.setVisible(true);
	}
}