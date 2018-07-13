import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Lottery_Game extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Visual fields
	private JButton guess;
	private JButton newGame;
	private JPanel backPanel;
	private JPanel answerPanel;
	private JPanel rewardPanel;
	private JTextField one;
	private JLabel resultLabel1;
	private JLabel resultLabel2;

	
	//Other fields
	public String user_name;
	public int points;
	public int number;
	public boolean correct= false;
	
	Lottery_Game(String name){
		//Set user name and initialize number of attempts to guess number to 0
		this.user_name= name;
		points = 0;
		
		//Set random lottery numbers
		Random random = new Random();
		number = random.nextInt(9);
		
		one = new JTextField(5);
		
		resultLabel1 = new JLabel();
		resultLabel2 = new JLabel();
		
		guess= new JButton("Guess");
		ButtonListener listener = new ButtonListener();
		guess.addActionListener(listener);
		
		
		newGame= new JButton("New Game");
		newGame.addActionListener(listener);
		
		answerPanel = new JPanel();
		answerPanel.setPreferredSize(new Dimension(80, 40));
		answerPanel.setBackground(Color.red);
		answerPanel.add(resultLabel1);
		resultLabel1.setText("____");
		
		rewardPanel = new JPanel();
		rewardPanel.setPreferredSize(new Dimension(100, 30));
		rewardPanel.setBackground(Color.gray);
		rewardPanel.add(resultLabel2);
		resultLabel2.setText("Total Points: " + points);

		backPanel = new JPanel();
		backPanel.setPreferredSize(new Dimension(80, 60));
		backPanel.setBackground(Color.black);
		backPanel.add(answerPanel);
		
		this.setPreferredSize(new Dimension(300, 150));
		this.setBackground(Color.red);
		add(backPanel);
		add(guess);
		add(newGame);
		add(one);
		add(rewardPanel);

	}
	
	private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == guess) {
				String text1 = one.getText();

				int one;
				one = Integer.parseInt(text1);

					if(number == one) {
						resultLabel1.setText("Correct: " + one);
						points+=100;
					}
			}
			if(event.getSource() == newGame) {
				resultLabel1.setText("___");
				Random random = new Random();
				number = random.nextInt(9);
				
	
			}


	}
	}
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("EC"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lottery_Game panel = new Lottery_Game("Karen"); 
		frame.getContentPane().add(panel);
		frame.pack(); frame.setVisible(true);
	}

	
}
