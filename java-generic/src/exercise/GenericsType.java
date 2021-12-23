package exercise;


public class GenericsType<T>{
	
	private T t;
	
	
	public T get() {
		return t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String[] args) {
		GenericsType<String> type = new GenericsType<>();
		type.set("Java");
		
		GenericsType type1 = new GenericsType<>(); // A raw type is a name for a generic interface or class without its type argument
		type1.set("Java");
		type1.set(10); 
		
		String s = type.get();
		System.out.println(s);
		 
	}

}
