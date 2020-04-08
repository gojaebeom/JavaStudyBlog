package ch04_매소드와변수의스코프;

public class Method연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carc(10,4);
		absoluteValue(10, 13);
	}
	
	/**
	 * - 문제 1. 정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 
	 * 출력하는 메소드와 이 메소드를 호출하는 main 메서드를 정의해 보자.
	 * 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	 */
	
	public static void carc(int x, int y) {
		System.out.println("---------------문제 1-----------------");
		System.out.println("더하기 : " + (x+y));
		System.out.println("빼기 : " + (x-y));
		System.out.println("곱하기 : " + (x*y));
		System.out.println("나누기 : " + (x/y) + ", 나머지 : " + (x%y));
	}
	
	/**
	 * - 문제 2. 정수 둘을 인자로 전달받아서, 두 수의 '차의 절대값' 을 계산하여 출력하는 메소드와 이 메소드를 
	 * 호출하는 main메소드를 정의해 보자. 단 메소드 호출 시 전달되는 값을 순서에 상관없이 절대값이 계산되고 출력되어야 한다.
	 */
	
	public static void absoluteValue(int x, int y) {
		System.out.println("두 수의 차의 절대값은 : " + Math.abs(x-y));//Math.abs는 자바에서 제공되는 절대값 구하는 함수이다. 음수일경우 자동으로 -를 제거해준다.
	}

}
