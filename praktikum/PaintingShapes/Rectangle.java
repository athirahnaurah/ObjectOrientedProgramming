package praktikum.PaintingShapes;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle (double l, double w) {
		super("Rectangle");
		length = l;
		width = w;
	}
	
	// return the surface area of the sphere
	// implements abstract method area from superclass
	public double area() {
		return length * width;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " of length is " + length + " and width is " + width; 
	}
}
