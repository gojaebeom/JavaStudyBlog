package ch14_객체지향;

public class Test03 {
	
	public static void main(String[] args) {
		A a = new A();
		a.hello();
		A b = new B();
		b.hello();
	}

}

class A{
	
	public void hello() {
		System.out.println("hello A");
	}
}

class B extends A{
	
	public void hello() {
		System.out.println("hello B");
	}
	
	public void hello(String str) {
		
	}
	
	public void hello(int i) {
		
	}
}
