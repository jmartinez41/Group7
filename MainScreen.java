import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainScreen extends JPanel{
	//Visual fields
	private JPanel logoPanel;
	private JPanel majorMoviesPanel;
	private JPanel otherMoviesPanel;
	private JLabel welcomeLabel;
	private JButton Movie1;
	private JButton Movie2;
	private JButton Movie3;
	private JButton Movie4;
	private JButton Movie5; 
	private JLabel Movie1Label;
	private JLabel Movie2Label;
	private JLabel Movie3Label;
	private JLabel Movie4Label;
	private JLabel Movie5Label;
	JFrame f;
	
	//Constructor for Main Sceen
	MainScreen(JFrame f){
		this.f =f;
		
		//Set Logo Panel
		logoPanel = new JPanel(); //add image later
		logoPanel.setPreferredSize(new Dimension(1000, 50));
		logoPanel.setBackground(Color.blue);	
		welcomeLabel = new JLabel();
		logoPanel.add(welcomeLabel);
		welcomeLabel.setText("Welcome, Choose a movie.");
		welcomeLabel.setFont(new Font("Century Gothic", Font.BOLD, 36));
		
		
		//Major Movies Panel
		majorMoviesPanel = new JPanel();
		majorMoviesPanel.setPreferredSize(new Dimension(900, 350));
		majorMoviesPanel.setBackground(Color.black); 
		Movie1 = new JButton();
		Movie1.setBackground(Color.white);
		Movie2 = new JButton();
		Movie2.setBackground(Color.white);
		majorMoviesPanel.add(Movie1);
		majorMoviesPanel.add(Movie2);
		Movie1.setPreferredSize(new Dimension(300,350));
		Movie2.setPreferredSize(new Dimension(300,350));
		MovieListener m1listener = new MovieListener();
		Movie1.addActionListener(m1listener);
		MovieListener m2listener = new MovieListener();
		Movie2.addActionListener(m2listener);
		
					//ADDED LABELS TO BUTTONS
					Movie1Label = new JLabel();
					Movie1.add(Movie1Label);
					Movie1Label.setText("Avengers Infinity War");
					Movie1.setName("Avengers Infinity War");
					Movie1Label.setFont(new Font("Century Gothic", Font.BOLD, 20));
					
					Movie2Label = new JLabel();
					Movie2.add(Movie2Label);
					Movie2Label.setText("Jurrassic World: Fallen Kingdom");
					Movie2.setName("Jurrassic World: Fallen Kingdom");
					Movie2Label.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		
		//Other Movies Panel
		otherMoviesPanel = new JPanel();
		otherMoviesPanel.setPreferredSize(new Dimension(900, 300));
		otherMoviesPanel.setBackground(Color.black);
		Movie3 = new JButton();
		Movie4 = new JButton();
		Movie5 = new JButton();
		Movie3.setBackground(Color.white);
		Movie4.setBackground(Color.white);
		Movie5.setBackground(Color.white);
		Movie3.setPreferredSize(new Dimension(250,300));
		Movie4.setPreferredSize(new Dimension(250,300));
		Movie5.setPreferredSize(new Dimension(250,300));
		otherMoviesPanel.add(Movie3);
		otherMoviesPanel.add(Movie4);
		otherMoviesPanel.add(Movie5);
		MovieListener m3listener = new MovieListener();
		Movie3.addActionListener(m3listener);
		MovieListener m4listener = new MovieListener();
		Movie4.addActionListener(m4listener);
		MovieListener m5listener = new MovieListener();
		Movie5.addActionListener(m5listener);

		
						//ADDED LABELS TO BUTTONS
						Movie3Label = new JLabel();
						Movie3.add(Movie3Label);
						Movie3Label.setText("Ant-Man and the Wasp");
						Movie3.setName("Ant-Man and the Wasp");
						Movie3Label.setFont(new Font("Century Gothic", Font.BOLD, 15));
						
						Movie4Label = new JLabel();
						Movie4.add(Movie4Label);
						Movie4Label.setText("Incredibles 2");
						Movie4.setName("Incredibles 2");
						Movie4Label.setFont(new Font("Century Gothic", Font.BOLD, 15));
						
						Movie5Label = new JLabel();
						Movie5.add(Movie5Label);
						Movie5Label.setText("BIG 30: Anniversary");
						Movie5.setName("BIG 30: Anniversary");
						Movie5Label.setFont(new Font("Century Gothic", Font.BOLD, 15));
		
		//Background
		JPanel controls = new JPanel();
		
        GridLayout layout = new GridLayout();
        layout.setVgap(0);
		controls.setLayout(layout);
		setPreferredSize(new Dimension(1000, 800));
		setBackground(Color.black);
		
		
		//Adding all panels to the screen
		add(logoPanel);
		add(majorMoviesPanel);
		add(otherMoviesPanel);

	}
	
	//Activating movie buttons
	private class MovieListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == Movie1) {
				//go to movie1 ticket screen
				MovieTimes panel = new MovieTimes(Movie1.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == Movie2) {
				//go to movie2 ticket screen
				MovieTimes panel = new MovieTimes(Movie2.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == Movie3) {
				//go to movie3 ticket screen
				MovieTimes panel = new MovieTimes(Movie3.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == Movie4) {
				//go to movie4 ticket screen
				MovieTimes panel = new MovieTimes(Movie4.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
			if(event.getSource() == Movie5) {
				//go to movie5 ticket screen
				MovieTimes panel = new MovieTimes(Movie5.getName(),f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
	}
	}
	


		
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome"); //What it says at top of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainScreen panel = new MainScreen(frame); 
		frame.getContentPane().add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.pack(); frame.setVisible(true);

	}

}
