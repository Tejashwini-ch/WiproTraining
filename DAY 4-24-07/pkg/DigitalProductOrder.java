package pkg;

public class DigitalProductOrder extends Order{
	DigitalProductOrder(String order_id){
		super(order_id);
	}
	void process_order(){
		System.out.println("Sending download linkn for order "+order_id);
	}
}