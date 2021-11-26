package praktikum.ExceptionHandling;

public class Pembagian {

	public static void main(String[] args) {
		
		try 
		{
			int value1 = 10;
			int value2 = 0;
			int result = value1/ value2;
			System.out.println(value1 + "/" + value2 + "=" + result );
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Operasi pembagian tidak valid!");
		}
	}

}
