package praktikum.inheritance;

public class Circle2 extends Shape {
	private double radius;
	
	public Circle2() {
		radius = 1.0;
	}
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	public Circle2(double radius, String color, boolean filled){
		this.radius = radius;
		super.setColor(color);
		super.setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + this.radius + "], which is a subclass of " + super.toString();
	}
}
