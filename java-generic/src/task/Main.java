package task;

import java.util.*;


public class Main {
	// Generic Method and Wildcard
		public static <T> int count(List<?> data) {
			return data.size();
		}
		
	public static void main(String[] args) {
		// implementasi generic class
		GenericClass<String> namaMhs = new GenericClass<>("Athirah Naurah Firdaus");
		GenericClass<Integer> semester = new GenericClass<>(3);
		
		// implementasi generic bounded type parameter
		GenericBounded<Integer> tingkat = new GenericBounded<>(2);
		
		Double nilai[] = {80.1, 87.5, 70.5, 82.0, 90.2, 82.5, 77.5 };
		//implementasi generic interface
		GenericInterface<Double> nilaiMaxMin= new GenericInterface<>(nilai);
		
		List<String> matkul = new ArrayList<String>();
		
		matkul.add("Pemrograman Berorientasi Objek");
		matkul.add("Proyek Perangkat Lunak 3");
		matkul.add("Pengantar RPL");
		matkul.add("Pancasila");
		matkul.add("Basis Data");
		matkul.add("Aljabar Linier");
		matkul.add("Kewirausahaan");
		
		
		System.out.println("Nama            : " + namaMhs.getData());
		System.out.println("Semester        : " + semester.getData());
		System.out.println("Tingkat         : " + tingkat.getDataNumber());
		System.out.println("------------------------------");
		System.out.println("Mata kuliah yang diambil:");
		for (String i : matkul) {
			System.out.print("- ");
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		//implementasi generic method
		System.out.println("Jumlah Matkul  : " + count(matkul));
		System.out.println("Nilai Tertinggi: " + nilaiMaxMin.max());
		System.out.println("Nilai Terendah : " + nilaiMaxMin.min());	
	}
}
