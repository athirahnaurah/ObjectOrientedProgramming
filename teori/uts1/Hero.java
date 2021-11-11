package teori.uts1;

public class Hero extends GameCharacter {
	private String name;
	private int age;
	
	public Hero() {
		this.name= "Hero";
		this.age = 17;
	}
	
	//method overloading
	public void Hero(String name) {
		this.name = name;
	}
	
	public void Hero(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return  super.toString() + "and I'm a" + name;
	}
}
