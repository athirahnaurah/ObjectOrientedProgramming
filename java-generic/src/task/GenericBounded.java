package task;

public class GenericBounded <T extends Number>{
	private T dataNumber;
	
	public GenericBounded(T dataNumber) {
		this.dataNumber = dataNumber;
	}
	public T getDataNumber() {
		return dataNumber;
	}
}

