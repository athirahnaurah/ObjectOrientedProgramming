package praktikum.fundamental4;

public class Makanan {
		private String nama_makanan;
		private double harga_makanan;
		private int stok;
		
		//inisialisasi data secara eksplisit
		public Makanan(String nama, double harga, int stk) {
			this.nama_makanan = nama;
			this.harga_makanan = harga;
			this.stok = stk;
		}
		//setter(mutator) and accessor(getter)
		public String getNama_makanan() {
			return nama_makanan;
		}

		public double getHarga_makanan() {
			return harga_makanan;
		}

		public int getStok() {
			return stok;
		}
		
		public void kurangiStok(int stokTerjual) {
			this.stok -= stokTerjual;
		}
		
		
}
