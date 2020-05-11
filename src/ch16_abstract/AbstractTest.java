package ch16_abstract;

abstract class Animal{
	
	public int age;
	
	public abstract void move();
	
	public void info() {
		System.out.println("동물 입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 걷습니다.");
	}
}

interface Example{
	public final int name = 0;
	
	public abstract void move();
	
	public default void info() {
		System.out.println("hello");
	}
}

class ExampleClass implements Example{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractTest {
	public static void main(String[] args) {
		Animal a = new Human();
		a.move();
		
		ExampleClass ex = new ExampleClass();
		ex.info();
	}
}
