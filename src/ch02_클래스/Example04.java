package ch02_클래스;

/**

추상클래스

1. 추상클래스는 실체클래스의 공통적인 부분(변수,메서드)를 추출해서 선언한 클래스이다.

2. 추상클래스는 객체를 생성할 수 없다. 아직은 실체성이 없고 구체적이지 않기 때문이다.

3. 추상클래스와 실체클래스는 상속관계


 */
public class Example04 {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.setName("고양이");
		cat.setCry("야옹");
		
		Dog dog = new Dog();
		dog.setName("강아지");
		dog.setCry("멍멍");
		
		System.out.println(cat.getName()+" 울음소리는 "+cat.getCry());
		System.out.println(dog.getName()+" 울음소리는 "+dog.getCry());
	}

}

//추상클래스 Animal
abstract class Animal{
	
	private String name;
	private String cry;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setCry(String cry){
		this.cry = cry;
	}
	public String getCry() {
		return this.cry;
	}
}

/**
 * Cat 클래스와 Dog 클래스는 내부의 구현된 맴버변수나 메서드가 없다.
 * 하지만 메인메서드에서 객체를 생성하고 이름과 울음소리등의 값을 할당하고
 * 불러올 수 있다. 
 * 
 * 이것은 Animal의 추상클래스를 상속받았기때문에 가능한 일 이다.
 * Animal 클래스에 구현되어있는 메서드를 그대로 상속하여 사용하는게 가능하다.
 * 
 *
 */
class Cat extends Animal{
	
}

class Dog extends Animal{
	
}
