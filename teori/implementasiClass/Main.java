package teori.implementasiClass;

public class Main {

	public static void main(String[] args) {
		TokoAlatTulis toko = new TokoAlatTulis();
		
		toko.setNamaPembeli("Athirah");
		toko.setNamaBarang("Buku tulis");
		toko.setHargaBarang(5000);
		toko.setJmlBeli(4);
		toko.setTotalHarga();
		toko.pembelian();
		
		toko.setNamaPembeli("Naurah");
		toko.setNamaBarang("Pulpen");
		toko.setHargaBarang(3000);
		toko.setJmlBeli(3);
		toko.setTotalHarga();
		toko.pembelian();
		
		toko.setNamaPembeli("Firdaus");
		toko.setNamaBarang("Tipex Kertas");
		toko.setHargaBarang(10_000);
		toko.setJmlBeli(1);
		toko.setTotalHarga();
		toko.pembelian();
		
	}

}
