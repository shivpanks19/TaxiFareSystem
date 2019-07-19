public class Taxi {
	String type ;
	int baseCharge;
	int nextFifteenCharge;
	int additionalKmCharge;
	int bChargeCnd;
	int flatCharge ;
	int flatReq;

	int tmpCond;
	
		public Taxi(){};	
	public Taxi(String type, int bCharge,int bcnd,int nxt15, int add,int flat, int req,int tempCond){
		this.type = type;
		this.baseCharge = bCharge;
		this.bChargeCnd = bcnd;
		this.nextFifteenCharge = nxt15;
		this.additionalKmCharge = add;
		this.flatCharge = flat;
		this.flatReq = req;	
		this.tmpCond = tempCond;
	}
	

}
