package pkg;

class creditCardPayment{
	public void makePayment(double amount) {
		System.out.println("Credit card payment of $"+amount+" processed.");
	}
}
class PaypalPayment{
	public void makePayment(double amount) {
		System.out.println("PayPal payment of $"+amount+" processed.");
	}
}
public class Payment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creditCardPayment cp=new creditCardPayment();
		PaypalPayment pp=new PaypalPayment();
		cp.makePayment(1000.0);
		pp.makePayment(2000.0);

	}

}
