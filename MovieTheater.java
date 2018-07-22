import javax.swing.JFrame;

public class MovieTheater extends JFrame {
	
	MovieTheater(){
		JFrame frame = new JFrame("Welcome"); //What it says at top of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainScreen panel = new MainScreen(frame); 
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.getContentPane().add(panel);
		frame.pack(); frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTheater test = new MovieTheater();

	}

}
