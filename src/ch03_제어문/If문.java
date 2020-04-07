package ch03_제어문;

public class If문 {
	
	public static void main(String[] args) {
		
		/**
		 * @if와else
		 * 
		 * 특정 조건이 만족될 때에만 실행하고픈 문장이 있다면 키워드 if를 사용하면 된다.
		 * 그리고 두개의 문장 중 조건에 따라 하나만 실행하고 싶다면 거기에 else를 더 추가하면 된다.
		 * else는 if문의 코드블록의 조건이 참이 아니라면 실행되는 곳이다.
		 */
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			//조건 true 시 실행되는 영역
			System.out.println("참입니다");
		}else {
			//조건 false 시 실행되는 영역
			System.out.println("거짓입니다");
		}
		
		/**
		 * @if와_else_if문
		 * if ~ else if 문은 2개 이상의 조건을 주고싶을 때 사용할 수 있는 방법이다.
		 * 밑의 예제를 보자
		 */
		
		if(num1 < num2) {
			System.out.println("num1보다 num2가 큽니다.");
		}else if(num1 > num2) {
			System.out.println("num2보다 num1이 큽니다.");
		}else if(num1 == num2) {
			System.out.println("num1과 num2는 같습니다.");
		}else {
			System.out.println("셋다 해당되지 않습니다.");
		}
		
		/**
		 * @조건연산자
		 * 조건 연산자는 피연산자가 세 개인 연산자이다. (자바스크립트의 삼항연산자와 비슷하다.)
		 * 이러한 조건 연산자는 간단한 if~else문을 대체하는 용도로 주로 사용된다.
		 * 밑의 예제를 보자
		 */
		
		int num3 = 10;
		int num4 = 20;
		int num5 = (false) ? num3 : num4;
		
		System.out.println("결과 : "+ num5);
		
		/**
		 * 변수 num5 는 선언과 동시에 조건연산자에 의한 값을 할당한다.
		 * ()안의 조건이 참이면 num3이 저장될 것이고 , 거짓이라면 num4가 저장될 것 이다.
		 * 하지만 임의적으로 false라는 값을 줌으로써 변수 num5에는 num4의 값, 즉 20이 저장되는것을 알 수 있다.
		 */
		
		
	}

}
