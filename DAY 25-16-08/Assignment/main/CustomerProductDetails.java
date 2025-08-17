package main.java;



import java.sql.*;

public class CustomerProductDetails {
    
   
	// a. Insert Customer
	public String insertCustomer(Customer c) {
	    try (Connection conn = DatabaseConnection.getConnection()) {
	        String sql = "INSERT INTO Customer(cust_name, cust_contact, cust_gender, cust_addr, city, zipcode) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, c.getCust_name());
	        ps.setString(2, c.getCust_contact());
	        ps.setString(3, c.getCust_gender());
	        ps.setString(4, c.getCust_addr());
	        ps.setString(5, c.getCity());
	        ps.setString(6, c.getZipcode());
	        ps.executeUpdate();
	        return "Customer Inserted";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "e";
	    }
	}

	// b. Insert Product
	public String insertProduct(Product p, int cust_id) {
	    try (Connection conn = DatabaseConnection.getConnection()) {
	        String sql = "INSERT INTO Product(product_code, product_desc, product_price, product_qty, product_expdate, cust_id) VALUES(?,?,?,?,?,?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, p.getProduct_code());
	        ps.setString(2, p.getProduct_desc());
	        ps.setDouble(3, p.getProduct_price());
	        ps.setInt(4, p.getProduct_qty());
	        ps.setDate(5, p.getProduct_expdate());
	        ps.setInt(6, cust_id);
	        ps.executeUpdate();
	        return "Product Inserted";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "e";
	    }
	}

	// c. Buy product
	public String buyProduct(int product_id, int qty) {
	    try (Connection conn = DatabaseConnection.getConnection()) {
	        String sql = "UPDATE Product SET product_qty = product_qty - ? WHERE product_id = ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, qty);
	        ps.setInt(2, product_id);
	        ps.executeUpdate();
	        return "Product Bought";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "e";
	    }
	}

	// d. Display Customer Products
	public String displayCustomerProducts(int cust_id) {
	    StringBuilder result = new StringBuilder();
	    try (Connection conn = DatabaseConnection.getConnection()) {
	        String sql = "SELECT c.cust_name, p.product_code, p.product_desc, p.product_price, p.product_qty " +
	                     "FROM Customer c JOIN Product p ON c.cust_id = p.cust_id WHERE c.cust_id=?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, cust_id);
	        ResultSet rs = ps.executeQuery();

	        double total = 0;
	        while (rs.next()) {
	            String pname = rs.getString("product_desc");
	            double price = rs.getDouble("product_price");
	            int qty = rs.getInt("product_qty");
	            double subtotal = price * qty;

	            result.append("Test User bought ")
	                  .append(pname).append(" | Price: ").append(price)
	                  .append(" | Qty: ").append(qty)
	                  .append(" | Subtotal: ").append(subtotal)
	                  .append("\n");

	            total += subtotal;
	        }
	        result.append("Total Price = ").append(total).append("\n");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result.toString();
	}
}