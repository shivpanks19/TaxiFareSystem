public class Customer{

	private int id;
	private String name;
	int numOfBookings=1;

	public void setId(int id){
		this.id = id;
	}
		
	public int getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}
		
	public String getName(){
		return this.name;
	}
}
