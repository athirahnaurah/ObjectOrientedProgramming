package task;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

public class GenericInterface <T extends Comparable<T>> implements MinMax<T>  {
	T[] data;
	
	GenericInterface(T[] data) {
		this.data = data;
	}
	
	public T min() {
		T v = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i].compareTo(v) < 0) {
				v = data[i];
			}
		}

		return v;
	}

	public T max() {
		T v = data[0];

		for (int i = 1; i < data.length; i++) {
			if (data[i].compareTo(v) > 0) {
				v = data[i];
			}
		}

		return v;
	}
}

