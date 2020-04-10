package ch07_클래스변수와클래스메소드;

public class 클래스메소드_활용 {

	/**
	 * 다음 예제를 다루어보면서
	 * 클래스 메소드로 정의하는 것이 더 나은 경우를 알아보자.
	 */
	public static void main(String[] args) {
		//클래스 메서드를 사용하지 않는 예
		SimpleCalculator sc = new SimpleCalculator();
		System.out.println("3 + 4 = " + sc.add(3, 4));
		System.out.println("반지름 2.2, 원의 넓이:"+sc.calCircleArea(2.2));
		
		System.out.println("15 - 7 = " + sc.min(15, 7));
		System.out.println("반지름 2.2, 원의 둘레:"+sc.calCirclePeri(5.0));
		
		
		//클래스 메소드를 사용한 예
		System.out.println("3 + 4 = " +SC.add(3, 4));
		System.out.println("반지름 2.2, 원의 넓이: " + SC.calCircleArea(2.2));
		
		System.out.println("15 - 7 = " + SC.min(15, 7));
		System.out.println("반지름 2.2, 원의 둘레:"+SC.calCirclePeri(5.0));
	}
}

class SimpleCalculator{
	/**
	 * 클래스 SimpleCalculator 에 정의된 메소드가 갖는 특징 두가지는 다음과 같다.
	 * - 모두 외부에 기능을 제공하기 위한 메소드들이다.
	 * - 모두 인스턴스 변수의 값을 참조하거나 수정하지 않는다.
	 * 
	 * 즉 SimpleCalculator에 정의된 메소드들은 인스턴스에 속할 이유가 없다. 따라서 
	 * 클래스 SimpleCalculator를 조금 다르게 새로 만들어보겠다.
	 */
	static final double PI = 3.1415;
	
	double add(double n1, double n2) {//더하기
		
		return n1 + n2 ;
	}
	double min(double n1, double n2) {//빼기
		
		return n1 - n2;
	}
	double calCircleArea(double r) {//원의 넓이
		return PI * r * r;
	}
	double calCirclePeri(double r) {//원의 둘레
		return PI * (r * 2);
	}
}

class SC{
	/**
	 * 메소드에 static 선언을 추가함으로 인해 불필요한 인스턴스의 생성 과정을 생략할 수 있게 되었다.
	 * 실제로 클래스 메소드로 구성된, 인스턴스의 생성을 목적으로 설계되지 않은 클래스들도 존재하고, 
	 * 프로그래머가 이러한 유형의 클래스를 직접 설계하는 경우도 종종 있다.
	 */
	static final double PI = 3.1415;
	
	static double add(double n1, double n2) {//더하기
		
		return n1 + n2 ;
	}
	static double min(double n1, double n2) {//빼기
		
		return n1 - n2;
	}
	static double calCircleArea(double r) {//원의 넓이
		return PI * r * r;
	}
	static double calCirclePeri(double r) {//원의 둘레
		return PI * (r * 2);
	}
}
