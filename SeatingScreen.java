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
		  JPanel moviePanel;
		  JPanel top;
		  JPanel seats;
		  JPanel screen;
		  JPanel confirmChoice;
		  JLabel movieText;
		  JLabel screenText;
		  JLabel topText;
		  JLabel confirmText;
		  JCheckBox[] boxes;
		  JButton confirm;
		  String movie;
		  String time;
		  JFrame f;
		  JPanel backPanel;
		  private JButton back;
		  JLabel goBack;
		  
		  SeatingScreen(String MovieName, String MovieTime, JFrame f){
			movie = MovieName;
			time = MovieTime;
			this.f = f;
			
		   //Initialize panels
			moviePanel = new JPanel();
			moviePanel.setPreferredSize(new Dimension(1000, 50));
			moviePanel.setBackground(Color.white);
		    movieText = new JLabel(movie + " " + time);
		    movieText.setFont(new Font("Century Gothic", Font.BOLD, 36));
		    moviePanel.add(movieText);
			
			
		    top = new JPanel();
		    top.setPreferredSize(new Dimension(1000, 50));
		    top.setBackground(Color.white);
		    topText = new JLabel("Choose your seats");
		    topText.setFont(new Font("Century Gothic", Font.BOLD, 36));
		    top.add(topText);
		    
		    screen = new JPanel();
		    screen.setPreferredSize(new Dimension(1000, 50));
		    screen.setBackground(Color.blue);
		    screenText = new JLabel("MOVIE SCREEN");
		    screenText.setFont(new Font("Courier New", Font.BOLD, 36));
		    screen.add(screenText);

		    seats = new JPanel();
		    seats.setPreferredSize(new Dimension(400, 400));
		    seats.setBackground(Color.blue);
		    GridLayout seatsgrid = new GridLayout(6,6);
		    seats.setLayout(seatsgrid);  //extra row and column to display row and column labels i.e. rowA seat1

		    confirmChoice = new JPanel();
		    confirmChoice.setPreferredSize(new Dimension(1000, 50));
		    confirmChoice.setBackground(Color.black);
			confirm = new JButton();
			confirmText = new JLabel("Confirm seating choice");
			confirmText.setFont(new Font("Century Gothic", Font.BOLD, 20));
			confirm.add(confirmText);
			confirm.setBackground(Color.white);
			SeatingListener complete = new SeatingListener();
			confirm.addActionListener(complete);
			confirmChoice.add(confirm);
			confirmChoice.setBackground(Color.black);
		    
		    //Adding labels to row numbers
		   int b = 0;
		   int j = 1;;
		   char letter = 'F';
		   int seat = 1;
		   char row = 'E';
		   String rowstr;
		   String tempseat;
		   String strletter;
		   boxes = new JCheckBox[25];
		   //Adding checkboxes to the grid
		   for(int m = 0; m < 6; m++) {
		   		for(int n = 0; n < 6; n++) {
		   			if(m==0) {
		   				if(n!=0) {
				   				//add labels for numbers
					      		String temp = Integer.toString(j);
						           JLabel label = new JLabel(temp);	
						           label.setFont(new Font("Courier New", Font.BOLD, 20));
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
			      		label.setFont(new Font("Courier New", Font.BOLD, 20));
			      		seats.add(label);
			      		letter--;
		   			}
		   			}
		   			else {
		   				//add check boxes
			   			
		 			   //if-statement to check if seat # is above 5 reset letter to l=next row & seat back to 1
		 			   if(seat == 6) {
		 				   seat = 1;
		 				   row--;
		 			   }
		 			   
		 			   rowstr = Character.toString(row);
		 			   tempseat = Integer.toString(seat);
		 			//CHECK DATABASE HERE FOR IF SEAT IS TAKEN 
		 			   //IF TAKEN ADD JLabel with X as text uncomment below code
			 			   //JLabel test = new JLabel("X");
			 			   //seats.add(test);
			 			   //seat++;
		 			   //ELSE use below code
			 			   JCheckBox box = new JCheckBox();
			 			   box.setBackground(Color.darkGray);
			 			   box.setName(rowstr + tempseat);
			 			   seat++;
				   		   seats.add(box);
				   		   boxes[b] =box;
				   		   b++;
		   			}
		   		}
		    }
				   //add final label
		  		JLabel label = new JLabel("A"); 
		  		label.setFont(new Font("Courier New", Font.BOLD, 20));
		  		seats.add(label);
		    
		  	//Option to go back to Movie Times if made incorrect selection
		  		
				backPanel = new JPanel();
				backPanel.setPreferredSize(new Dimension(400, 75));
				backPanel.setBackground(Color.gray);
				goBack = new JLabel();
				back = new JButton();
				back.setBackground(Color.gray);
				back.setBorderPainted(false);
				back.add(goBack);
				backPanel.add(back);
				goBack.setText("Go Back");
				goBack.setFont(new Font("Century Gothic", Font.BOLD, 36));
				SeatingListener backListener = new SeatingListener();
				back.addActionListener(backListener);
				
			//Background
			JPanel controls = new JPanel();
			BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
			controls.setLayout(layout);
			setPreferredSize(new Dimension(1000, 1000));
			setBackground(Color.black);
			
			//Adding all panels to the screen
			add(moviePanel);
			add(top);
			add(seats);
			add(screen);
			add(confirmChoice);
			add(backPanel);
		  }
		  
		  
		  private class SeatingListener implements ActionListener{
		  public void actionPerformed(ActionEvent event){
				if(event.getSource() == confirm) {
					String temp;
					String[] confirmed = new String[25];
					int j = 0;
					int t =24;
					//Iterate through boxes array and check which values are checked
					for(int o=0; o<5;o++) {
						for(int i=4;i>=0;i--) {
							if(boxes[t-i].isSelected() == true){
								temp = boxes[t-i].getName();
								confirmed[j] =temp; //all seats selected are added to this array and can be used to update database
								j++;
							}
						}
						t= t -5;
					}
					//go to confirmation page

					Confirmation panel = new Confirmation(movie, time,confirmed,f); 
					f.setContentPane(panel); 
					f.setVisible(true);
				}
				if(event.getSource() == back) {
					//goes to seating
					MovieTimes panel = new MovieTimes(movie,f);
					f.setContentPane(panel); 
					f.setVisible(true);
				}
				
		  }
		  }
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Choose your seating"); //What it says at top of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SeatingScreen panel = new SeatingScreen("", "",frame); 
		frame.getContentPane().add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.pack(); frame.setVisible(true);

	}

}
