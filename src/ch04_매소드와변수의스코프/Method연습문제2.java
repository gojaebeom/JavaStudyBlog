package ch04_매소드와변수의스코프;

public class Method연습문제2 {

	/**
	 * - 문제 1. 
	 * 인자로 원의 반지름 정보를 전달하면 , 원의 넓이를 계산해서 반환하는 메소드와 
	 * 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고 사용해보자
	 */
	
	public static double circle(double radius) {
		
		//원의 넓이 구하는 공식 반지름 * 반지름 * 원주율(3.14)
		return  (radius * radius) * 3.14;
	}
	
	/**
	 * - 문제 2. 
	 * 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 , 소수가 아닌 경우
	 * false를 반환하는 메소드를 정의하자.
	 * 
	 */
	
	public static boolean valueType(int result) {
		
		
		for(int i=2; i<result; i++) {
			
			if(result%i == 0) {
				//소수는 1과 자기 자신만 나누어 떨어지는 수이다.
				//2부터 입력각 이전까지 순차적으로 나눈 나머지가 0 과 같다면 
				//1과 자기 자신이외에 나누는 값이 있기때문에 소수가 아니다.
				// 즉 이 if가 한번이라도 참이면 소수가 아니기때문에 false를 반환한다.
				return false;
			}
		}
		
		return true;// 소수
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(circle(31));
		
		System.out.println(valueType(15));
	}
}
