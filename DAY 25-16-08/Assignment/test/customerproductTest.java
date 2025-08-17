package test.java;



import org.junit.jupiter.api.Test;

import main.java.Customer;
import main.java.Product;
import main.java.CustomerProductDetails;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Date;

public class customerproductTest {
    CustomerProductDetails obj = new CustomerProductDetails();

    @Test
    void testInsertCustomer() {
        Customer c = new Customer();
        c.setCust_name("tejashwini");
        c.setCust_contact("9014859170");
        c.setCust_gender("F");
        c.setCust_addr("Kaman");
        c.setCity("Karmnagar");
        c.setZipcode("505001");

        String result = obj.insertCustomer(c);
        assertEquals("Customer Inserted", result);
    }

    @Test
    void testInsertProduct() {
        Product p = new Product();
        p.setProduct_code("P101");
        p.setProduct_desc("Air Conditioner");
        p.setProduct_price(50000);
        p.setProduct_qty(2);
        p.setProduct_expdate(Date.valueOf("2026-12-31"));

        String result = obj.insertProduct(p, 1);
        assertEquals("Product Inserted", result);
    }

    @Test
    void testBuyProduct() {
        String result = obj.buyProduct(1, 1);
        assertEquals("Product Bought", result);
    }

    @Test
    void testDisplayCustomerProducts() {
        String result = obj.displayCustomerProducts(1);
        System.out.println(result); 
        assertTrue(result.contains("Total Price")); 
    }

}