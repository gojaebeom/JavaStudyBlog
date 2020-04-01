package ch01_변수;

public class example01 {
	/**
	byte (숫자, 1 바이트)
	short (숫자, 2 바이트)
	int (숫자, 4 바이트)
	long (숫자, 8 바이트)
	float (부동 수, 4 바이트)
	double (부동 수, 8 바이트)
	char (문자, 2 바이트)
	boolean (참 또는 거짓, 1 바이트)
	 * 
	 */
	
	public static void main(String[] args) {
		//Java는 객체 지향이지만 모든 유형이 객체 인 것은 아니다. 기본 요소라고하는 기본 변수 유형 위에 구축된다.
		
		//변수는 타입 + 변수명으로 선언가능
		int num1;
		//System.out.println(num1); 이과같이 선언이후 값을 할당하지 않으면 컴파일 하기 이전에 툴에서 경고를 띄운다.
		
		
		//값을 할당한 이후 println객체에 값으로 넣으면 경고없이 컴파일 이후에도 5라는 숫자가 잘 나오는 것을 확인 할 수 있다.
		num1 = 5;
		System.out.println(num1);
		
		
		//변수 선언과 동시에 값을 할당 할 수 도 있다. 이것을 선언 및 초기화 한다고 한다.
		int num2 = 10;
		
		
		//타입이 같은 변수 여러개를 한번에 선언하는 방법도 있다.
		int num3, num4;
		num3 = 0;
		num4 = 0;
		
		//당연히 여러개를 선언하며 초기화 해줄 수 도 있다.
		int num5, num6 = 0;
		
		//선언된 변수명으로 다시 선언하는건 불가능 하다.
		//int num6; 위에 변수 num6을 이미 선언하였기때문에 똑같은 변수명으로 선언하자 툴에서 에러처리를 한다.

	}

}
