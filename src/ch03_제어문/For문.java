package ch03_제어문;

public class For문 {
	
	/**
	 * @for문
	 * 이전에 다루었던 while문에서 했던 예제들은 거의 반복하는 값이 정해져있었다.
	 * 이처럼 '반복의 횟수가 정해져 있는 상황' 에서는 for문을 이용해서 다음과 같이 작성하는 것이 더
	 * 간결하고 뜻도 더 잘 통한다.
	 * 밑의 예제를 보자.
	 */
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("I Love Java");
		}
		
		/**
		 * 위 예제에서 실행 흐름을 보자면 
		 * 1. 변수의 선언및 초기화
		 * 2. 반복 조건이 true인지 확인
		 * 3. 반복 영역을 실행 (반복 조건이 true이면)
		 * 4. 변수의 값 증가
		 * 
		 * 그리고 그 이후 두번째 반복부터는 첫번째 조건인 
		 * 변수의 선언및 초기화 부분은 지나치게 된다. 
		 */
		
		/**
		 * @for문의 활용
		 * 
		 * 문제 1. 1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성해보자
		 */
		System.out.println("----------------경계선--------------------");
		int result = 1;
		for(int i =1; i<=10; i++) {
			
			result *=i;
		}
		System.out.println("1번문제 정답 : "+result);
		
		/**
		 * 문제 2. 구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 작성해보자.
		 */
		System.out.println("----------------경계선--------------------");
		int num = 5;
		for(int i=1; i<10; i++) {
			System.out.println("5의 배수: "+num*i);
		}
	}
}
