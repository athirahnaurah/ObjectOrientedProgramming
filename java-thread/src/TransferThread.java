
public class TransferThread implements Runnable {
	private int noATM;
	private String nama;
	private int jmlTransfer;
	
	public TransferThread(int noATM, String nama, int jml) {
		this.noATM = noATM;
		this.nama = nama;
		jmlTransfer = jml;
	}
	
	@Override
	public void run() {	
		System.out.println("ATM ke-"+noATM + ": "+ nama + " berhasil transfer sejumlah " + jmlTransfer);	
	}
}
