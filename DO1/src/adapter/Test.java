package adapter;

public class Test {
	
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle train = new Train();
		Vehicle plane = new Plane();
		Boat boat = new Boat();
		BoatAdapter boatAdapter = new BoatAdapter(boat);
		
		car.moveFaster();
		train.moveFaster();
		plane.moveFaster();
		boatAdapter.moveFaster();
	}
	
}
