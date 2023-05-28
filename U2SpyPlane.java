package attendanceact;

public class U2SpyPlane extends Vehicle{

	int Wingspan = 500;
	
		
		public void fly() {
			
			System.out.println("The plane is now flying");
		}
	@Override
	public void stop() {
	
			System.out.println("The plane stopped");
	}
}
