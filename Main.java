

public class Main{
	public static void main(String[] args){
		System.out.println("\nTaxi Booking.");
	

		Booking b1 = new Booking("mini",150);
		Booking b2 = new Booking("sedan",150);
		System.out.println("TOtal Cost: "+b1.calculateTotalCharges());
		System.out.println("TOtal Cost: "+b2.calculateTotalCharges());
		
		
	}
}
