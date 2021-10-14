package praktikum.fundamental4;

public class Restaurant {
	private Makanan[] menuRestaurant;
	public static byte id=0;
	
	//belum ada setter dan getter
	public Restaurant() {
		menuRestaurant = new Makanan[20];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menuRestaurant[id] = new Makanan(nama,harga,stok);
		}
	
	public void tampilMenuMakanan(){
		for(int i =0; i<=id;i++){
		if(!isOutOfStock(i)){
			System.out.println(menuRestaurant[i].getNama_makanan()+"["+menuRestaurant[i].getStok()+"]"+"\tRp. "+menuRestaurant[i].getHarga_makanan());
			}
		}
	}
	public boolean isOutOfStock(int id){
			if(menuRestaurant[id].getStok() == 0){
			return true;
			}else{
			return false;
			}
		}
	
	public static void nextId(){
			id++;
		}
	
	public void pemesanan(String nama, int stok) {
		for ( int i = 0; i <= id; i++) {
			if (nama.equals(menuRestaurant[i].getNama_makanan())){
				if (stok <= menuRestaurant[i].getStok()) {
					menuRestaurant[i].kurangiStok(stok);
					System.out.println(menuRestaurant[i].getNama_makanan()+" terjual sebanyak "+ stok);
				}else {
					System.out.println("Stok" + menuRestaurant[i].getNama_makanan()+" tidak mencukupi!");
				}
			}
		}
		
	}
}


