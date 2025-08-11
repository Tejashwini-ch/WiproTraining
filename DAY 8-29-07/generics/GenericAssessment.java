package generics;
class BoxAssessment<T extends Number> {
    private T length;
    private T breadth;

    public void setLengthBreadth(T length, T breadth) {
        this.length = length;
        this.breadth=breadth;
    }

    public int getArea() {
        // Assuming L and B are Double
        int l = length.intValue();
        int b = breadth.intValue();
        return l * b;
    }
    
    //ARea of circle
    private T radius;
    public void setCircleRadius(T radius) {
    	this.radius=radius;
    }
    public double getcircleArea() {
    	double r=radius.doubleValue();
    	return 3.14*r*r;
    }
    
    //Perimeter of square
    private T side;
    public void setSquareSide(T side) {
    	this.side=side;
    }
    public float getSquarePerimeter() {
    	float s =side.floatValue();
    	return 4*s;
    }
    
    //Area of triangle
    private T base;
    private T height;
    public void setBaseHeight(T base, T height) {
    	this.base=base;
    	this.height=height;
    }
    public double getTriangleArea() {
    	double b=base.doubleValue();
    	double h=height.doubleValue();
    	return 0.5*b*h;
    }
}

public class GenericAssessment {
    public static void main(String[] args) {
        BoxAssessment<Integer> boxRectangleArea = new BoxAssessment<>();
        boxRectangleArea.setLengthBreadth(12, 12);
        System.out.println("The area of rectangle is: " + boxRectangleArea.getArea());
        
        //area of circle
        BoxAssessment<Double> boxCircleArea= new BoxAssessment<>();
        boxCircleArea.setCircleRadius(1.1);
        System.out.println("Area of circle is: "+boxCircleArea.getcircleArea());
        
        //perimeter of square
        BoxAssessment<Float> boxSquarePerimeter=new BoxAssessment<>();
        boxSquarePerimeter.setSquareSide(25f);
        System.out.println("The perimeter of square is: "+boxSquarePerimeter.getSquarePerimeter());
        
        //Area of triangle
        BoxAssessment<Double> boxTriangleArea= new BoxAssessment<>();
        boxTriangleArea.setBaseHeight(1.3, 1.5);
        System.out.println("The area of circle is: "+boxTriangleArea.getTriangleArea());

    }
}