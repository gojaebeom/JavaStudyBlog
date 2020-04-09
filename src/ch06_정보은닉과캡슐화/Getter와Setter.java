package ch06_정보은닉과캡슐화;

public class Getter와Setter {
	
	/**
	 * 이전에서 만든 클래스를 '정보 은닉'의 조건을 충족하게 다시 만들어보자. 
	 */

	public static void main(String[] args) {
		Circle02 c = new Circle02(3);
		System.out.println("반지름: " + c.getRadius());
		System.out.println("넓 이:" + c.getArea());
		
		c.setRadius(3.5);
		System.out.println("반지름: " + c.getRadius());
		System.out.println("넓 이:" + c.getArea());
		
	}
}

class Circle02{
	
	private double radius = 0;
	private final double PI = 3.14;
	
	public Circle02(double r) {
		setRadius(r);
	}
	
	public void setRadius(double r) {
		if(r<0) {
			radius = 0;
			return;
		}
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return (radius*radius)*PI;
	}
	
	/**
	 * 이전과 다른점들을 살펴보자.
	 * 일단 23, 24 번줄의 인스턴스 변수의 선언 앞에 private라는 접근 수준 지시자(접근제한자가 붙어있다.)
	 * 그리고 이것이 의미하는 바는 다음과 같다.
	 * 
	 * -클래스 내부에서만 접근을 허용하겠다.
	 * 
	 * 따라서 클래스 외부에서 prviate으로 선언된 변수에 접근할 경우 컴파일 오류가 발생한다. 
	 * 그렇다면 저 변수를 어떻게 사용해야 할까?
	 * 
	 * 자바에서는 상태는 외부로부터 숨기고 오직 동작(메소드)를 통해서만 상태를 제어할 수 있는 방식을 권장하고 있다.
	 * 
	 * 따라서 위의 두 유형의 메소드를 통해 값을 설정하고, 전달하는 일을 할 수있다.
	 * 
	 * 상단의 setRadius는 값의 설정을 위한 메소드이고, 메소드 getRadius는 값의 참조를 위한 메소드이다.
	 * 이렇듯 값의 설정과 참조를 위한 메소드를 가리켜 각각 다음과 같이 부른다. 
	 * 
	 * getter
	 *	-인스턴스 변수의 값을 참조하는 용도로 정의된 메소드
	 *  -변수의 이름이 name일 때, 메소드의 이름은 getName으로 짓는 것이 관계
	 * 
	 * setter
	 *  -인스턴스 변수의 값을 설정하는 용도로 정의된 메소드
	 *  -변수의 이름이 name일 때 , 메소드의 이름은 setName으로 짓는 것이 관례
	 *  
	 * * private으로 선언된 모든 인스턴스 변수를 대상으로 게터와세터를 반드시 정의해야 하는 것은 아니다.
	 * 필요에 따라 정의하면 된다. 그러나 당장 필요하지 않더라도 나중을 고려하여 게터와 세터를 정의하기도 한다.
	 */
}