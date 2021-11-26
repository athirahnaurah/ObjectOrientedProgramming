package praktikum.ExceptionHandling;

public class VarReference {

	public static void main(String[] args) {
		String nama = "athirah";
		try {
			System.out.println("hello " + nama);
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
