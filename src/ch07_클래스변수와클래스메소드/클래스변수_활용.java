package ch07_클래스변수와클래스메소드;

public class 클래스변수_활용 {

	/**
	 * 앞서 제시했던 예제들을 통해서도 클래스 변수가 유용하게 활용되는 상황 한 가지를 짐작할 수 있다.
	 * 
	 * - 인스턴스 간에 데이터 공유가 필요한 상황에서 클래스 변수를 선언한다.
	 * 
	 * 다음 예제를 관찰해보자
	 */
	
	public static void main(String[] args) {
		Circle c = new Circle(1.2);
		c.showPerimeter();
		c.showArea();
	}
}

class Circle{
	static final double PI = 3.1415; //변하지 않는 , 참조가 목적인 값
	private double radius;
	
	Circle(double rad){
		radius = rad;
	}
	
	void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레: "+peri);
	}
	
	void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("넓이: "+area);
	}
}

/**
 * 위 예제에서 PI가 상수로 선언이 되었다. PI가 지닌 값은 '원주율'로 결코 변하지 않는 값이기 때문이다.
 * 그런데 인스턴스 변수가 아닌 '클래스 변수'로 선언되었다. 이는 모든 Circle 인스턴스가 참조해야 하는 값이지만,
 * 인스턴스가 각각 지녀야 하는 값은 아니기 때문이다.
 * 
 * - 참조를 목적으로만 존재하는 값은 final 선언이된 클래스 변수에 담는다.
 * 
 * 게다가 이 값은 외부에서 참조한다고 해서 문제가 되는 값이 아니다. 그래스 private으로 선언하지 않았다.
 * 필요하다면 public 으로 선언해도 괜찮은 값이다.
 */
