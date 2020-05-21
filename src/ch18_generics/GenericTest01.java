package ch18_generics;

class Banana{
	public String toString() {
		return "banana";
	}
}
class Store<T>{
	private T object;
	
	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return object;
	}
}

public class GenericTest01 {
	
}
