package praktikum.fundamental4;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant menu = new Restaurant();
		System.out.println("MENU MAKANAN");
		System.out.println("---------------------------");
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		System.out.println("---------------------------");
		menu.pemesanan("Gehu", 5);
		System.out.println("---------------------------");
		menu.tampilMenuMakanan();
	}

}
