package pkg;

public class OrderImpl {
	public static void main(String[] args) {
		Order physicalproductorder=new PhysicalProductOrder("PPO1001");
		Order digitalproductorder=new DigitalProductOrder("DPO1002");
		Order serviceorder=new ServiceOrder("SO1003");
		
		physicalproductorder.process_order();
		physicalproductorder.order_summary();
		System.out.println();
		digitalproductorder.process_order();
		digitalproductorder.order_summary();
		System.out.println();
		serviceorder.process_order();
		serviceorder.order_summary();
		System.out.println();
	}

}
