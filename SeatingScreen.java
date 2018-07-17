import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		    top.setPreferredSize(new Dimension(900, 50));
		    top.setBackground(Color.white);
		    topText = new JLabel("Choose your seats");
		    topText.setFont(new Font("Courier New", Font.BOLD, 36));
		    top.add(topText);
		    
		    screen = new JPanel();
		    screen.setPreferredSize(new Dimension(900, 50));
		    screen.setBackground(Color.black);
		    screenText = new JLabel("SCREEN");
		    screenText.setFont(new Font("Courier New", Font.BOLD, 36));
		    screen.add(screenText);
		    screen.setBackground(Color.blue);
		    
		    seats = new JPanel();
		    seats.setPreferredSize(new Dimension(400, 400));
		    seats.setBackground(Color.red);
		    GridLayout seatsgrid = new GridLayout(6,6);
		    seats.setLayout(seatsgrid);  //extra row and column to display row and column labels i.e. rowA seat1
		    
		    //Adding labels to row numbers
		   int j = 1;;
		   char letter = 'F';
		   String strletter;
		   //Adding checkboxes to the grid
		   for(int m = 0; m < 6; m++) {
		   		for(int n = 0; n < 6; n++) {
		   			if(m==0) {
		   				if(n!=0) {
				   				//add labels for numbers
					      		String temp = Integer.toString(j);
						           JLabel label = new JLabel(temp);	
						      		seats.add(label);
						      		j++;
				   				}
		   				}
		   			else if(n==0) {
		   				if(letter == 'F') {
		   					//add blank label to fill
				      		JLabel label = new JLabel(""); 
				      		seats.add(label);
				      		letter--;
		   				}
		   				else {
		   				//add labels for letters
			    		strletter = Character.toString(letter);
			      		JLabel label = new JLabel(strletter); 
			      		seats.add(label);
			      		letter--;
		   			}
		   			}
		   			else {
		   				//add check boxes
			   			//check database here for if seat is taken
			   			JCheckBox box = new JCheckBox();
			   			seats.add(box);
		   			}
		   		}
		    }
		   //add final label
  		JLabel label = new JLabel("A"); 
  		seats.add(label);
		    
			//Background
			JPanel controls = new JPanel();
			BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
			controls.setLayout(layout);
			setPreferredSize(new Dimension(1000, 1000));
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
