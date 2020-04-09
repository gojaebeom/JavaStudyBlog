package ch06_정보은닉과캡슐화;

public class 정보은닉 {

	/**
	 * 자바에서 말하는 정보는 클래스의 인스턴스 변수를 의미한다.
	 * 따라서 정보를 은닉한다는 것은 인스턴스 변수를 숨긴다는 뜻이다.
	 * 
	 * 다음 예제를 다루어보면서 정보은닉이 필요한 이유에 대해서 알아보자.
	 */
	
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		
		c.radius = 5;//옳지 않은 접근 방법, 그리고 문제가 되는 부분
		System.out.println(c.getArea());
	}
}

//원의 너비를 구하는 클래스
class Circle{
	double radius = 0;//원의 반지름
	final double PI = 3.14;//원주율
	
	public Circle(double r) {
		setRad(r);
	}
	
	public void setRad(double r) {
		if(r<0) {//반지름은 0보다 작을 수 없으므로
			radius = 0;
			return;//아무것도 반환하지 않고 메소드에서 빠저나간다.
		}
		radius = r;
	}
	
	public double getArea() {
		
		return (radius * radius) * PI;//원의 너비 반환
	}
	/**
	 * 위 예제 26, 27번째 줄에서 보이듯이 인스턴스 변수는 선언과 동시에 초기화를 할 수 있다. 
	 * 특히 PI의 경우 그 값이 상수이므로 생성자를 통한 초기화보다 위의 방식의 초기화가 더 어울린다.
	 * 
	 * 그렇다면 33번째 줄의 setRad 메소드를 보자. 
	 * 위 메소드 정의를 통해서 Circle 클래스를 정의한 이의 다음 의도를 읽을 수 있다.
	 * 
	 * - 반지름의 길이 radius에 0 보다 작은 값이 저장되는 일이 발생하지 않도록 하겠다.
	 * 
	 * 때문에 이러한 의도를 따르기 위해서라도 반지름의 길이를 변경할 때에는 반드시 위의 메소드 호출을
	 * 통해서만 변경을 진행해야 한다. 
	 * 이렇듯 인스턴스 변수에 저장되는 값의 종류와 범위는 해당 클래스를 정의한 사람이 가장 정확히 안다.
	 * 따라서 클래스 사용자가 잘못된 값을 인스턴스 변수에 저장하지 않도록 위와 같은 유형의 메소드를 제공해야한다.
	 * 그런데 위의 예제에서는 프로그램 사용자의 실수로 다음과 같은 잘못된 접근이 발생하였다.
	 * 
	 * 19번째 줄의 c.radius = 5;
	 * 
	 * 이렇듯 인스턴스 변수의 직접적인 접근을 허용하면, 컴파일 과정에서 드러나지 않는 중대한 실수가 발생할 수 있다.
	 * 이러한 오류는 실행 결과에서도 드러나지 않아 더 큰 문제가 된다. 
	 * 때문에 위와 같은 접근을 허용하지 않도록 클래스를 설계할 필요가 있다. 
	 * 그리고 이러한 클래스의 설계를 가리켜 '정보 은닉' 이라 한다.
	 */
}
