package ch01_변수와자료형;

public class _변수의이해와활용 {

	//데이터의 저장과 참조를 위해 '할당된 메모리 공간'에 붙인 이름을 '변수'라고 한다.
	
	public static void main(String[] args) {
		
		int num1; //변수 num1 의 선언
		num1 = 10; //변수 num1에 10을 저장
		
		int num2 = 10; //변수 num2 선언과 동시에 20으로 초기화
		
		int num3 = num1 + num2; // 두 변수 값을 대상으로 덧셈한 값을 num3에 저장
		
		System.out.println(num1 + "+" + num2 + "=" + num3);
		
		//자바에서는 값의 대입의 의미로 = 기호가 사용된다. 
		//기호 = 을 가리켜 '대입 연산자'라 한다.
		
		//앞서 int 라는 키워드를 사용하여 변수를 만들었는데, 이러한 키워드를 가리켜 '자료형'이라고 한다.
		//그리고 자바에서는 다양한 자료형을 제공한다
		
		//자료형       |  데이터  |   크기  |  표현 가능 범위
		//------------------------------------------------------
		boolean bool; // 참과 거짓| 1바이트 | true, false
		//------------------------------------------------------
		char _char;   // 문자     | 2바이트 | 유니코드 문자
		//------------------------------------------------------
		byte _byte;   // 정수     | 1바이트 | -128~127
		short _short; // ...      | 2바이트 | -32,768~32,767
		int num;      // ...      | 4바이트 | -2,147,483,648 ~ 2,147,483,647
		long _long;   // ...      | 8바이트 | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807(뭐가 이렇게 길어;;)
		//------------------------------------------------------
		float _float; // 실수     | 4바이트 | 소숫점 자리 표현가능이라고 해두겠다
		double db;    // ...      | 8바이트 | ... 
		
		
		
		//실수의 덧셈 예제
		
		//다수의 변수 한번에 선언하기
		double num4, num5;
		double result;
		num4 = 1.0000001;
		num5 = 2.0000001;
		result = num4 + num5;
		System.out.println(result);
		//출력을 하게되면 예상했던 숫자 3.0000002 가 아닌 3.0000001999999997 같은 수가 나온다
		//이유는 기본적으로 컴퓨터의 실수 표현에는 오차가 존재한다. 따라서 위와 같이 실수 1.000001을 저장 할 경우
		//변수에 저장되는 값은 이에 가까운 값일 뿐 정확히 1.000001은 아니기때문이다.
		
		
	}
}
