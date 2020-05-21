package ch18_generics;

class Box2<T>{
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return ob;
	}
}

class Box3<K,V>{
	
}

public class FruitAndBox4 {
	public static void main(String args) {
		Box2<Apple> aBox = new Box2<Apple>();
		Box2<Orange> oBox = new Box2<Orange>();
		
		Box3<Apple,Orange> box;
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a = aBox.get();
		Orange o = oBox.get();
		
		System.out.println(a);
		System.out.println(o);
		System.out.println("hello");
	}

	
	
}
