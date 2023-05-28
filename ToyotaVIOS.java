package attendanceact;

public class ToyotaVIOS extends Vehicle {
	
	String tiretype = "World's best tires";
	
	public void drive() {
		
		System.out.println("VIOS is now driving");
	}
		@Override
		public void stop() {
			System.out.println("VIOS has stopped.");
		}

}
