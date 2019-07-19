import java.util.*;

public class Booking{
	static private int bookingId;
	Customer customer;
	float td;//travelledDistance
	String usedVehicle;	
	float TotalCharges;
	Taxi mini,sedan,suv;
	
	public Booking(String type,float km){

			this.bookingId +=1;
			this.usedVehicle = type;
			//this.travelledDist = km;	
			setCustomerInfo();
				
		mini = new Taxi("mini",50,3,10,8,8,75,15);
		sedan = new Taxi("sedan",80,5,12,10,10,100,13);
		suv = new Taxi("suv",100,5,15,12,0,0,11);
	}

	public void setCustomerInfo(){

			customer = new Customer();						
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your Name:");
			customer.setName(s.nextLine());
			System.out.println("Enter your Id:");
			customer.setId(s.nextInt());
			customer.numOfBookings+=1;
			
	}


	public float calculateTotalCharges(){
		System.out.println("\nEnter the km travelled :");
		Scanner sin = new Scanner(System.in);
		td = sin.nextFloat();
		float tmp = td;
		float totalCharge=0;		
		Taxi obj = new Taxi() ;
		if(usedVehicle.equalsIgnoreCase("mini"))obj = mini;
		else if(usedVehicle.equalsIgnoreCase("sedan"))obj = sedan;
		else if(usedVehicle.equalsIgnoreCase("suv"))	obj=suv;



				if(td>obj.bChargeCnd){
					totalCharge += obj.baseCharge;
					td-= obj.bChargeCnd;
					
					if(td>obj.tmpCond){
						totalCharge += obj.nextFifteenCharge*obj.tmpCond;
						td-=obj.tmpCond;
						if(td>0)
						{
							if(tmp>obj.flatReq){
								totalCharge=0;
								totalCharge+=obj.flatCharge*tmp;
								return totalCharge; 
							}
							else
							{
									totalCharge+=obj.additionalKmCharge;
									return totalCharge;
							}
						}
					}
					else{
						totalCharge += obj.nextFifteenCharge*td;
						System.out.println(" test "+obj.nextFifteenCharge*td);
						td=0;
						return totalCharge;
					}
					
				}
				else{	
					totalCharge+=mini.baseCharge*td;					
					return totalCharge;
				}				

			
				return 0;
		}
}
