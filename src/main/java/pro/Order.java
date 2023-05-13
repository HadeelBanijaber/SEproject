package pro;

public class Order {
	String oId;
	String cId;
	String pId;
	String wId;
	Status status=Status.WATTING;
	int numOfOrde;
	int deliveryPrice;
	int productPrice;
	
	
	
	public Order(String oId,String cId,String pId,String wId,int numOfOrder,int deliveryPrice,int productPrice ) {
		this.oId=oId;
		this.cId=cId;
		this.pId=pId;
		this.wId=wId;
		this.numOfOrde=numOfOrder;
		this.deliveryPrice=deliveryPrice;
		this.productPrice=productPrice;
		
		
	}
	public void setStatus(Status s) {
		status=s;
	}
	public Status getStatus() {
		return status;
	}
	
}
