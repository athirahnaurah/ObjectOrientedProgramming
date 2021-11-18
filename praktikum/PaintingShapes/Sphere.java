package praktikum.PaintingShapes;

public class Sphere extends Shape {
	private double radius;
	
	// constructor : sets up the sphere
	public Sphere(double r) {
		super("Sphere");
		radius = r;
	}
	
	// return the surface area of the sphere
	// implements abstract method area from superclass
	public double area() {
		return 4 * Math.PI * radius * radius;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " of radius is " + radius; 
	}
}
