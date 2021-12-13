import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			FileReader fileJson = new FileReader("E:\\athirah\\POLBAN\\SEMESTER 3\\PBO\\PRAKTEK\\Tugas\\Soal\\Pertemuan 12\\barang.json");
			
			ArrayList<PengirimanBarang> barang = gson.fromJson(fileJson, new TypeToken<ArrayList<PengirimanBarang>>() {}.getType());
			
			for (int i = 0; i < barang.size(); i++) {
				System.out.println("Barang " + (i+1) + ": " + barang.get(i).toString());
			}
		} catch (FileNotFoundException e ) {
			System.out.println(e.getMessage());
		}
	}

}
