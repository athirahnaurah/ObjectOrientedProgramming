package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class WildCard {
	public static void printCollection(Collection<?> c) {
		for (Object e : c) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("ArrayList Collection");
		printCollection(collection);
		
		Collection<String> collection2 = new LinkedList<>();
		collection2.add("LinkedList Collection");
		printCollection(collection2);
		
		Collection<Integer> collection3 = new HashSet<>();
		collection3.add(1234);
		printCollection(collection3);
	}

}
