package praktikum.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		try {
			// Following file does not exist
			File f = new File("E://file.txt");
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}
}
