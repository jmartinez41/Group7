	
	import java.util.ArrayList;

	class Movies {
		String Name;
		String Time;
		String Theater;
		Movies()
		{
		}
		public Movies(String Name, String Time, String Theater) {
			super();
			this.Name = Name;
			this.Time = Time;
			this.Theater = Theater;
		}
		public String getName() {
			return Name;
		}
		public void setName(String Name) {
			this.Name = Name;
		}
		public String getTime() {
			return Time;
		}
		public void setLastName(String Time) {
			this.Time = Time;
		}
		public String getTheater() {
			return Theater;
		}
		public void setTheater(String Theater) {
			this.Theater = Theater;
		}
		
		
	}
	
	public class MovieTester{
		public static void main(String args[]){
			CinemaBooking pb = new CinemaBooking();
		   pb.add("Incredibles", "1:00", "1");
			pb.add("Movie 2", "2:00", "1");
						
			pb.show();
			
		}	
	}
	class CinemaBooking{
		
		ArrayList<Movies> Movies = new ArrayList<Movies> ();
		
		public void add(String MName, String Time, String Theater) {
			Movies item = new Movies(MName, Time, Theater);
			Movies.add(item);
		}
		public void show() {
			System.out.println("................................. Movie.............................");
			for(Movies item: Movies){
			
				System.out.println(" Movie Name: "+ item.getName() + 
						" Movie time: "+ item.getTime() + " Theater Number: "+ item.getTheater());
			}
			System.out.println("////////////////////////////////////////////////////////////////////////");
		}
	
	}
