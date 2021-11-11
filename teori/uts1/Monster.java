package teori.uts1;

public class Monster extends Villain {
	private int age;
	private String name;
	
	public Monster() {
		this.name= "Monster";
		this.age = 60;
	}
	
	//method overloading
	public void Monster(String name) {
		this.name = name;
	}
	
	public void Monster(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return  super.toString() + "Rawrgh";
	}
}
