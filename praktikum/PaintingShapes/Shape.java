package praktikum.PaintingShapes;

abstract class Shape {
	private String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}
	
	// computes the area of the shapes
	abstract double area();
	
	public String toString() {
		return shapeName;
	}
	
}
