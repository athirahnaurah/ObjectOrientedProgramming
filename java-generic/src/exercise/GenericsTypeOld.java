package exercise;

public class GenericsTypeOld {
	
	private Object t;
	
	public Object get() {
		return t;
	}
	
	public void set(Object t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		GenericsTypeOld type = new GenericsTypeOld();
		type.set("Java");
		String str = (String)type.get();
		
		// saat melakukan casting dengan tipe data yang tidak sesuai
		// errornya pada saat run time
		// int str = (int) type.get();
		
		System.out.println(str);
		
	}

}
