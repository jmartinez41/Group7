import javax.swing.*;
import java.awt.*;
	
public class BookingScreen
{
		  
		  JPanel top;
		  JPanel[][] seats;
		  
		  BookingScreen()
		  {
		   //Initialize panels
		    top = new JPanel();
		    seats = new JPanel[6][6];
		    
		    seats.setLayout(new GridLayout(6,6));  //extra row and column to display row and column labels i.e. rowA 
		    
		    //Adding labels to row numbers
		    char letter = 'E';
		    for(int i=1; i<=6; i++)
		    {
		      		JLabel label = new JLabel();
		      		letter--;
				    seats[i][0] = new JPanel();
		      		add(seats[i][0]);      
		    }
		    //Adding numbers
		    for(int j=1; j<= 6; j++)
		    {
		      		String temp = Integer.toString(i);
		            JLabel label = new JLabel(temp);
				    seats[0][j] = new JPanel();
		      		add(seats[0][j]);
		   
		    }
		        
		    //Adding checkboxes to the grid
		    for(int m = 1; m <= 6; m++) 
		    {
		   		for(int n = 1; n <= 6; n++) 
		   		{
		      		panelHolder[m][n] = new JPanel();
		      		add(panelHolder[m][n]);
		   		}
		    }  
		    
		  }
		  
}

