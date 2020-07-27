public class MainProgram {
	public static void main(String[] args) {
		Vehicle myCar = new Vehicle(4, 2005, "Holden", "Captiva");
		//Vehicle myCar = new Vehicle();
		myCar.soundHorn();
		myCar.goForward(500);
	}
}

