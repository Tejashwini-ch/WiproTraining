package main.java;

public class Box {
	public double areaOfCircle(double radius) {
		return Math.PI*radius*radius;
	}
	public double areaOfTriangle(double base, double height) {
		return 0.5*base*height;
	}
	public double areaOfSquare(double side) {
		return side*side;
	}
	public double areaOfRectangle(double length, double breadth) {
		return length*breadth;
	}
	public double simpleInterest(double principal, double rate, double time) {
		double result=(principal*rate*time)/100;
		return result;
	}
	public double amount(double principal, double rate, double time) {
		double SimpleInterest=simpleInterest(principal,rate,time);
		double compound = principal * Math.pow((1 + rate / 100), time);
        return SimpleInterest + compound;


		
	}

}
