package praktikum.inheritance;

public class Shape {
	//instance variables
	private String color;
	private boolean filled;
	//constructor that initializes the color and filled 
	public Shape() {
		color = "green";
		filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	// getter and setter for the color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// getter and setter for the filled
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape[color= " + getColor() + " ,filled= " + isFilled() + "]";
	}
}
