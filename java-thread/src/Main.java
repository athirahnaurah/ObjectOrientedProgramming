
public class Main {

	public static void main(String[] args) {
		
		TransferThread t1 = new TransferThread(1, "Athirah", 50000);
		TransferThread t2 = new TransferThread(2, "Naurah", 150000);
		TransferThread t3 = new TransferThread(3, "Emily", 250000);
		
		Thread test = new Thread(t1);
		Thread test2 = new Thread(t2);
		Thread test3 = new Thread(t3);
		
		test.start();
		test2.start();
		test3.start();

	}

}

