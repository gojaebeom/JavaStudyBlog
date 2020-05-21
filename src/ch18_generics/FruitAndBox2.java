package ch18_generics;

class Box{
	private Object ob;
	
	public void set(Object ob) {
		this.ob = ob;
	}
	public Object get() {
		return ob;
	}
}

public class FruitAndBox2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = (Apple)aBox.get();//다운캐스팅
		Orange or = (Orange)oBox.get();
		
		System.out.println(ap);
		System.out.println(or);
	}
}
