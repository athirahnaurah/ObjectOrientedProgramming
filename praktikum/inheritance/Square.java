package praktikum.inheritance;

public class Square extends Rectangle{
	
	public Square() {
		super();
	}
	
	public Square(double w, double l) {
		super(w,l);
	}
	
	public Square(double w, double l, String c, boolean f) {
		super(w,l,c,f);
	}
	
	@Override
	public String toString() {
		return "Square with side" + super.getWidth() + ", which is a subclass of "
				+ super.toString();
	}
	
	@Override
	public void setLength(double l) {
		super.setLength(l);
	}
	
	@Override
	public void setWidth(double l) {
		super.setWidth(l);
	}
	
	@Override
	public double getArea() {
		return super.getLength() * super.getWidth();
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (super.getLength() + super.getWidth());
	}
	
}
