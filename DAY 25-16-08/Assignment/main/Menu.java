package main.java;

import java.sql.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerProductDetails shop = new CustomerProductDetails();
        int choice;

        do {
            System.out.println("\n==== SHOP MENU ====");
            System.out.println("1. Insert Customer");
            System.out.println("2. Insert Product");
            System.out.println("3. Buy Product");
            System.out.println("4. Display Customer Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Customer c = new Customer();
                    System.out.print("Enter Customer Name: ");
                    c.setCust_name(sc.nextLine());
                    System.out.print("Enter Contact: ");
                    c.setCust_contact(sc.nextLine());
                    System.out.print("Enter Gender: ");
                    c.setCust_gender(sc.nextLine());
                    System.out.print("Enter Address: ");
                    c.setCust_addr(sc.nextLine());
                    System.out.print("Enter City: ");
                    c.setCity(sc.nextLine());
                    System.out.print("Enter Zipcode: ");
                    c.setZipcode(sc.nextLine());

                    System.out.println(shop.insertCustomer(c));
                    break;

                case 2:
                    Product p = new Product();
                    System.out.print("Enter Product Code: ");
                    p.setProduct_code(sc.nextLine());
                    System.out.print("Enter Product Description: ");
                    p.setProduct_desc(sc.nextLine());
                    System.out.print("Enter Product Price: ");
                    p.setProduct_price(sc.nextDouble());
                    System.out.print("Enter Product Quantity: ");
                    p.setProduct_qty(sc.nextInt());
                    sc.nextLine(); 
                    System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
                    String date = sc.nextLine();
                    p.setProduct_expdate(Date.valueOf(date));
                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();

                    System.out.println(shop.insertProduct(p, custId));
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    System.out.print("Enter Quantity to Buy: ");
                    int qty = sc.nextInt();

                    System.out.println(shop.buyProduct(productId, qty));
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int cust_id = sc.nextInt();
                    System.out.println(shop.displayCustomerProducts(cust_id));
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}