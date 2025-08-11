package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.Test;

import main.java.Box;
public class BoxTest {
	Box box=new Box();
	@Test
	public void testAreaOfCircle() {
		double delta=0.1;//we can use this when we use math.pi
		assertEquals(78.5, box.areaOfCircle(5),delta);
	}
	@Test
	public void testAreaOfTriangle() {
		assertEquals(0.72, box.areaOfTriangle(1.2, 1.2));
	}
	@Test
	public void testAreaOfSquare() {
		assertEquals(6.25, box.areaOfSquare(2.5));
		
	}
	@Test
	public void testAreaOfRectangle() {
		assertEquals(0.52, box.areaOfRectangle(1.3, 0.4));
	}
	@Test
	public void testSimpleInterest() {
		assertEquals(99.0, box.simpleInterest(1000, 2.2, 4.5));
	}
	@Test
	public void testAmount() {
		assertEquals(1202.5, box.amount(1000,5,2));
	}
	

}
