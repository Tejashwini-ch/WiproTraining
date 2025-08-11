package pkg;

public class PhysicalProductOrder extends Order{
	PhysicalProductOrder(String order_id){
		super(order_id);
	}
	@Override
	void process_order(){
		
		System.out.println("Shipping physical product for order "+order_id);
	}
}