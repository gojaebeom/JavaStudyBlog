package ch01_변수와자료형;

public class 기본자료형_정수 {

	public static void main(String[] args) {
		
		
		//밑의 예제를 보면 11, 22 의 정수는 2바이트 정수로 표현할 수 있으므로 short형 변수를 사용하는것이 옳다고 생각된다.

		short num1 = 11;
		short num2 = 22;
		
		//short result = num1 + num2;
		//short로 선언한 변수들의 합을 담을 변수를 당연히 short로 선언하지만 컴파일 하기이전에 이클립스에서 빨간밑줄을 그어버린다.
		//논리적으로 보면 문제가 없지만 자바의 관점에서 보면 문제가 있는 코드이다. 이유는
		
		//자바는 정수형 연산을 int형으로 진행한다.
		//따라서 byte나 short형 변수에 저장된 값을 대상으로 덧셈과 같은 연산을 진행하면 이를 먼저 int형 값으로 변경해 버린다.
		
		//즉 위의 예제는 덧셈 연산 이전에 다음 과정을 거치게 된다.
		
		// - 변수 num1 과 num2에 저장된 값을 int 형으로 변환한다.
		// 그렇기 때문에 위의 short result 변수에 두 변수의 합을 할당하려하니 에러가 난 것이다. 
		int result = num1 + num2;// 이처럼 int형으로 받으니 문제없이 받는 것을 볼 수 있다.
		
		System.out.println(result);
	}
}
