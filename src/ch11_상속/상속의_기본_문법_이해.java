package ch11_상속;

public class 상속의_기본_문법_이해 {
	/**
	 * 상속의 적절한 활용 방법은 한두 문자응로 가볍게 설명할 수 있는 내용이 아니다.
	 * 그리고 이에 대한 설명을 듣기에 앞서 상옥에 대한 문법적인 이해가 선행되어야 한다.
	 * 
	 * @상속이란
	 * 
	 * 상속의 이유와 목적을 물어보면 
	 * - 상속은 코드의 재활용를 위한 문법입니다.
	 * 
	 * 그러나 객체지향 기반의 개발 경험이 풍부한 개발자나 대학원에서 컴퓨터공학을 전공한 이들에게 질문을 하면 
	 * 
	 * -연관된 일련의 클래스들에 대해 공통적인 규약을 정의할 수 있다.
	 * 
	 * 위의 답변은 매우 모범적인 답변이긴 하지만 지금 이해할 수 있는 내용은 아니다.
	 * 
	 * @상속의 가장 기본적인 특성
	 * 상속을 단순하게 설명하면 , 기존에 정의된 클래스에 메소드와 변수를 추가하여 새로운 클래스를 정의하는 것이 
	 * 상속이다. 예를 들어서 다음의 클래스가 정의되어 있다고 가정해보자.
	 */
	
	public static void main(String[] args) { 
		Cat cat = new Cat("고양이", "야옹");
		
		cat.info();
	}
}

class Animal{
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public void name() {
		System.out.println("이 동물의 이름은 "+name+"입니다.");
	}
}

/**
 * 이때 위의 클래스를 상속하여 다음과 같이 새로운 클래스를 정의 할 수 있다.
 */

class Cat extends Animal{
	String cry;
	
	Cat(String name , String cry){
		super(name);//부모의 String타입의 매개변수를 받는 생성자 호출(super는 이후에 배우게 된다.)
		this.cry = cry;
	}
	
	public void info() {
		name();//Animal 클래스를 상속했기 때문에 호출 가능
		System.out.println("울음소리는 "+cry);
		
	}
}

/**
 * 위 예제를 보면 새로운 super 키워드가 등장한 것을 알 수 있다. 
 * 이건 나중에 더 자세히 배우겠지만 , 책에서는 super가 필요한 이유를 설명하기 위해 
 * 여러 예제를 다루고있지만 생략하겠다.
 */

