package praktikum.inheritance;

public class Test {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println(s1.toString());
		
		Circle2 c2 = new Circle2();
		System.out.println(c2.toString());
		System.out.println("Circle:" + " radius=" + c2.getRadius()
		+ " base area=" + c2.getArea() + " perimeter=" + c2.getPerimeter());
		
		Rectangle r3 = new Rectangle();
		System.out.println(r3.toString());
		System.out.println("Rectangle:" + " width=" + r3.getWidth() + " length=" +
		r3.getLength() + " base area=" + r3.getArea() + " perimeter=" + r3.getPerimeter());
		
		Square s4 = new Square();
		System.out.println(s4.toString());
		System.out.println("Square:" + " width=" + s4.getWidth() + " length=" +
		s4.getLength() + " base area=" + s4.getArea() + " perimeter=" + s4.getPerimeter());
		
		
	}

}
