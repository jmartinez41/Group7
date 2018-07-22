import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Confirmation extends JPanel {
	String movie;
	String time;
	String[] seats;
	String ticketnum;
	
	JPanel top;
	JPanel info;
	JPanel seatInfo;
	JPanel thankYou;
	JLabel topText;
	JLabel infoText;
	JLabel seatText;
	JLabel thankYouText;
	JFrame f;
	
	Confirmation(String movieName, String movieTime, String[] seatsChosen,JFrame f){
		movie = movieName;
		time = movieTime;
		seats = seatsChosen;
		this.f=f;
		
		//CAN UPDATE DATABASE FOR MOVIE & TIME AND SEATS TAKEN HERE 
		
		//Initialize panels
		top = new JPanel();
		top.setPreferredSize(new Dimension(1500, 100));
		top.setBackground(Color.white);
	    topText = new JLabel("Ticket Confirmation information");
	    topText.setFont(new Font("Century Gothic", Font.BOLD, 36));
	    top.add(topText);
	    
		info = new JPanel();
		info.setPreferredSize(new Dimension(1500, 50));
		info.setBackground(Color.white);
	    infoText = new JLabel(movie + " " + time);
	    infoText.setFont(new Font("Century Gothic", Font.BOLD, 36));
	    info.add(infoText);
	    
		seatInfo = new JPanel();
		seatInfo.setPreferredSize(new Dimension(1500, 500));
		seatInfo.setBackground(Color.white);
		//Iterate through seats chosen array to list seats
		String temp = "Seats chosen: ";
		int i = 0;
		while(i<seats.length && seats[i] != null ) {
			temp += " " + seats[i];
			i++;
		}
		if(temp== "Seats chosen: ") {
			temp = "No seats chosen";
		}
	    seatText = new JLabel(temp);
	    seatText.setFont(new Font("Century Gothic", Font.BOLD, 36));
	    seatInfo.add(seatText);
	    
		thankYou = new JPanel();
		thankYou.setPreferredSize(new Dimension(1500, 500));
		thankYou.setBackground(Color.white);
	    thankYouText = new JLabel("Enjoy your movie!");
	    thankYouText.setFont(new Font("Century Gothic", Font.BOLD, 36));
	    thankYou.add(thankYouText);
	    
		//Background
		JPanel controls = new JPanel();
		GridLayout layout = new GridLayout();
		controls.setLayout(layout);
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.white);
	    
	    add(top);
	    add(info);
	    add(seatText);
	    add(thankYou);
	    
	    //CAN UPDATE DATABASE FOR SEATS TAKEN HERE
	    
	    //After given amount of seconds goes back to main screen
	    Timer time = new Timer();
	    int seconds=7;
	    class ExitTask extends TimerTask{
			@Override
			public void run() {				
				MainScreen panel = new MainScreen(f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
	    }
	    
	    time.schedule(new ExitTask(), seconds*1000);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Enjoy your movie"); //What it says at top of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] test = {"a","b"};
		Confirmation panel = new Confirmation("Movie", "time",test,frame); 
		frame.getContentPane().add(panel);
		frame.pack(); frame.setVisible(true);
	}

}
