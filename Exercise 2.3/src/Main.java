
public class Main {

	public static void main(String[] args) {
		Pen MyPen = new Pen();
		Pen AbuPen = new Pen();
		
		System.out.println("=======My Pen=======");
		MyPen.printPen();
		MyPen.totalWeight();
		MyPen.promotion();
		MyPen.refill();
		
		System.out.println("\n=======Abu's Pen=======");
		AbuPen.printPen();
		AbuPen.totalWeight();
		AbuPen.promotion();
		AbuPen.refill();
	}

}
