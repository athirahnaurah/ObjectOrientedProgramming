package teori.implementasiClass;

public class TokoAlatTulis {
	private String namaBarang;
	private int hargaBarang;
	private String namaPembeli;
	private int jmlBeli;
	private int totalHarga;
	
	public String getNamaBarang() {
		return namaBarang;
	}
	
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	
	public int getHargaBarang() {
		return hargaBarang;
	}
	
	public void setHargaBarang(int hargaBarang) {
		this.hargaBarang = hargaBarang;
	}
	
	public String getNamaPembeli() {
		return namaPembeli;
	}
	
	public void setNamaPembeli(String namaPembeli) {
		this.namaPembeli = namaPembeli;
	}
	
	public int getJmlBeli() {
		return jmlBeli;
	}
	
	public void setJmlBeli(int jmlBeli) {
		this.jmlBeli = jmlBeli;
	}
	
	public int getTotalHarga() {
		return totalHarga;
	}
	
	public void setTotalHarga() {
		this.totalHarga = this.jmlBeli * this.hargaBarang;
	}
	
	public void pembelian() {
		System.out.println("Nama Pembeli :" + getNamaPembeli());
		System.out.println("Nama Barang  :" + getNamaBarang());
		System.out.println("Jumlah Beli  :" + getJmlBeli());
		System.out.println("Total Harga  :" + getTotalHarga());
		System.out.println("------------------------------------");
		
	}
	
}


