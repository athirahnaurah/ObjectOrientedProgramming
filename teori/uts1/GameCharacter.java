package teori.uts1;

public class GameCharacter {
	private String name;
	private int age;
	
	public GameCharacter() {
		this.name = "A";
		this.age = 17;
	}
	
	//method overloading
	public void GameCharacter(String name) {
		this.name = name;
	}
	
	public void GameCharacter(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "My character is" + name;
	}
}
