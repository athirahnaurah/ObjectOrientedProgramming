package teori.uts1;

public class Villain extends GameCharacter{
	private int age;
	private String name;
	
	public Villain() {
		this.name= "Villain";
		this.age = 17;
	}
	
	//method overloading
	public void Villain(String name) {
		this.name = name;
	}
	
	public void Villain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return  super.toString() + "and I'm a" + name;
	}
}
