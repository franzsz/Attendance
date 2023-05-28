package attendanceact;

public class FandangoYacht extends Vehicle {
	
	String MainSail = "Blue";
	
	public void Float() {
		System.out.println("The Yacht is now sailing.");
	}
	
	@Override
	public void stop() {
		
		System.out.println("The Yacht stopped sailing");
	}
	
}
