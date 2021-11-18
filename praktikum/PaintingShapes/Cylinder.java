package praktikum.PaintingShapes;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	// return the surface area of the sphere
	// implements abstract method area from superclass
	public double area() {
		return Math.PI * radius * radius * height;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " of radius is " + radius + " and height is " + height; 
	}
}
