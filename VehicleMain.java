package attendanceact;

public class VehicleMain {
	
	public static void main(String[]args) {
		
		System.out.println("===================================================================");
		System.out.println("|			  VEHICLES		             	  |");
		System.out.println("===================================================================");
		
		ToyotaVIOS car = new ToyotaVIOS();
		car.SPEED = 200;
		car.COLOR = "Silver gray";
		car.PRICE = 1100000;
		System.out.println("THE TOYOTA VIOS");
		System.out.println("");
		System.out.println("Speed = " + car.SPEED + "km/h");
		System.out.println("Color = " + car.COLOR);
		System.out.println("Price = " + car.PRICE);
		System.out.println("Tire Type = " + car.tiretype);
		car.drive();
		car.stop();
		System.out.println("===================================================================");
		
		U2SpyPlane plane = new U2SpyPlane();
		plane.COLOR = "White";
		plane.SPEED = 1000;
		plane.PRICE = 20000000;
		System.out.println("THE U-2 SPY PLANE");
		System.out.println("");
		System.out.println("Speed = " + plane.SPEED + " mp/h");
		System.out.println("Color = " + plane.COLOR);
		System.out.println("Price = " + plane.PRICE);
		System.out.println("Wing Span = " + plane.Wingspan);	
		plane.fly();
		plane.stop();
		System.out.println("===================================================================");
		
		FandangoYacht yacht = new FandangoYacht();
		yacht.COLOR = "Brown";
		yacht.SPEED = 500;
		yacht.PRICE = 10000000;
		System.out.println("THE FANDANGO YACHT");
		System.out.println("");
		System.out.println("Speed = " + yacht.SPEED + " km/h");
		System.out.println("Color = " + yacht.COLOR);
		System.out.println("Price = " + yacht.PRICE);
		System.out.println("Main Sail Color =  " + yacht.MainSail);	
		yacht.Float();
		yacht.stop();
		System.out.println("===================================================================");
				}
	}
