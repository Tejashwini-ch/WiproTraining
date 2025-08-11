package CollectionsPackage;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerNumber;
	private String customerLocation;
	 public Customer(String Id, String name, String number, String location) {
		 this.customerId=Id;
		 this.customerName=name;
		 this.customerNumber=number;
		 this.customerLocation=location;
		 
		 
	 }
	 public String getCustomerId() {
		 return customerId;
	 }
	 public String getCustomerName() {
		 return customerName;
	 }
	 public String getCustomerNumber() {
		 return customerNumber;
	 }
	 public String getCustomerLocation() {
		 return customerLocation;
	 }
	 @Override
	 public String toString() {
		return "Customer_ArrayList [customerId=" + customerId + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", customerLocation=" + customerLocation + "]";
	 }
	 
	 

}
