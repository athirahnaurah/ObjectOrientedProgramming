package praktikum.PaintingShapes;

public class Paint {
	private double coverage;
	
	public Paint(double c) {
		coverage = c;
	}
	
	//compute the amount of paint needed to paint a shape
	public double amount (Shape s) {
	//	correct the return
	//  the amount of paint needed is the area of the shape divided by the coverage for the paint. 	
		return s.area() / coverage;
	}
}

//System.out.println("Computing amount for " + s);
//	return 0;