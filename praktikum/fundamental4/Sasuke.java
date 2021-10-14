package praktikum.fundamental4;

public class Sasuke extends Itachi{
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu(); // memanggil printDojutsu dari class induk
		System.out.println(Dojutsu);
	}

}
