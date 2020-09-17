package day2;
public class Main {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.setSize(20);
		vehicle.setSpeed(30);
		System.out.println(vehicle.toString());
		vehicle.speedUp();
		vehicle.speedDown();
	}

}
