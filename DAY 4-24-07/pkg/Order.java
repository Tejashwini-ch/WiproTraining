package pkg;

public abstract class Order {
	protected String order_id;
	//constructor
	public Order(String order_id) {
        this.order_id = order_id;
    }
	//abstract method
	abstract void process_order();
	//concrete method
	void order_summary(){
		System.out.println("Order "+order_id+" summary printed");
	}
}

