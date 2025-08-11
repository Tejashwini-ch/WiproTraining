package CollectionsPackage;
import java.util.*;
public class CustomerImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Customer> customerList=new ArrayList<>();
		customerList.add(new Customer("C001","Alex","9014859170","Hyderabad"));
		customerList.add(new Customer("C002","Bob","9849072027","Bangalore"));
		customerList.add(new Customer("C003","Catherine","9441772393","Chennai"));
		customerList.add(new Customer("C004","Dolly","9014585234","Kolkata"));
		customerList.add(new Customer("C005","Elsa","5874512369","Gurgaon"));
		customerList.add(new Customer("C006","Frenzy","9492036370","Pune"));
		
		//we have to print the list
		for(Customer val:customerList) {
			System.out.println(val);
		}
		
		//Collections.sort(customerList);---it gives us error
		//remove value at index 3
		System.out.println("\nRemoving at index 3");
		customerList.remove(3);
		//printing list after removing index 3
		System.out.println("Updated Customer List after removing index 3:");
        for (Customer val : customerList) {
            System.out.println(val);
        }
		
		//finding C003 using iterator
		Iterator<Customer> iterator = customerList.iterator();
		boolean foundId = false;

		while (iterator.hasNext()) {
		    Customer customer = iterator.next();
		    if (customer.getCustomerId().equalsIgnoreCase("C003")) {
		    	//here while checking we use equals ignore case means if we give ID 
		    	//in Capital or lower letter if it matches with ID if its found.
		    	System.out.println("\nCustomer C003 found");
		        System.out.println("Customer Name: " + customer.getCustomerName());
		        System.out.println("Customer Location: " + customer.getCustomerLocation());
		        foundId = true;
		        break;
		    }
		}

		if (!foundId) {
		    System.out.println("Customer C003 not found in the list.");
		}

		

	}

}
