package teori.uts1;

public class Soldier extends Villain {
	private int age;
	private String name;
	
	public Soldier() {
		this.name= "Soldier";
		this.age = 20;
	}
	
	//method overloading
	public void Soldier(String name) {
		this.name = name;
	}
	
	public void Soldier(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return  super.toString() + "Soldier";
	}
}
