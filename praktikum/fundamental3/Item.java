package praktikum.fundamental3;

public class Item {	
	private String name;
	
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		//this(); //memanggil constructor dalam kelas ini yang memiliki parameter yg sama
		System.out.println(this.name);
	}
}
