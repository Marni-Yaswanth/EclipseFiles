package abstraction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle;
		vehicle = new Car();
		vehicle.start();
		vehicle = new Scooter();
		vehicle.start();
	}

}
