import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeatingScreen extends JPanel{
		  JPanel top;
		  JPanel seats;
		  JPanel screen;
		  JLabel screenText;
		  JLabel topText;
		  
		  SeatingScreen(){
		   //Initialize panels
		    top = new JPanel();
		    top.setPreferredSize(new Dimension(300, 600));
		    top.setBackground(Color.white);
		    topText = new JLabel("Choose your seats");
		    top.add(topText);
		    
		    screen = new JPanel();
		    screen.setPreferredSize(new Dimension(900, 50));
		    screen.setBackground(Color.black);
		    screenText = new JLabel("SCREEN");
		    screenText.setFont(new Font("Courier New", Font.BOLD, 36));
		    screen.add(screenText);
		    screen.setBackground(Color.blue);
		    
		    seats = new JPanel();
		    top.setPreferredSize(new Dimension(400, 400));
		    top.setBackground(Color.black);
		    GridLayout seatsgrid = new GridLayout(6,6);
		    seats.setLayout(seatsgrid);  //extra row and column to display row and column labels i.e. rowA seat1
		    
		    //Adding labels to row numbers
		    char letter = 'E';
		    String strletter;
		    for(int i=1; i<=6; i++){
		    		strletter = Character.toString(letter);
		      		JLabel label = new JLabel(strletter); 
		      		seats.add(label,i,0);
		      		letter--;
		    }
		    
		    //Adding numbers
		    for(int j=1; j<= 6; j++){
		      		String temp = Integer.toString(j);
		            JLabel label = new JLabel(temp);	
		      		seats.add(label,0,j);
		    }
		        
		    //Adding checkboxes to the grid
		    for(int m = 1; m < 6; m++) {
		   		for(int n = 1; n < 6; n++) {
		   			//check database here for if seat is taken
		   			JCheckBox box = new JCheckBox();
		   			seats.add(box,m,n);
		   		}
		    }  
		    
			//Background
			JPanel controls = new JPanel();
			BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
			controls.setLayout(layout);
			setPreferredSize(new Dimension(1000, 1050));
			setBackground(Color.black);
			
			//Adding all panels to the screen
			add(top);
			add(seats);
			add(screen);
		    
		  }
		  
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome"); //What it says at top of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SeatingScreen panel = new SeatingScreen(); 
		frame.getContentPane().add(panel);
		frame.pack(); frame.setVisible(true);

	}

}
