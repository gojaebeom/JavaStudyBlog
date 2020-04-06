package ch02_상수와형변환;

public class 형변환_명시적형변환 {
	
	/**
	 *@명시적_형_변환
	 * 
	 *자동형변환의 특징을 봤을땐 
	 *
	 *byte -> short -> int -> long -> float -> double
	 * 		   char   
	 * 
	 * 의 특징을 가지고있었다.
	 * 그럼 거꾸로 실수에서 정수형으로 형변환을 하려고하는 예제를 보자
	 *
	 */
	
	public static void main(String[] args) {
		
		double pi = 3.1415;
		//int wholeNumber = pi; double형의 pi를 int형 wholeNumer에 할당하려 하자 에러가난다. 이것을 명시적으로 형변환하면 아래와 같다.
		int wholeNumer = (int)pi; 
		
		//이전 예제였던 short의 합 명시적 형변환으로 해결
		short num1 = 10;
		short num2 = 20;
		short num3 = (short) (num1+ num2);
		/**
		 * 위의 문장에서 소괄호가 두번 등장하였다. 하나는 num1과 num2의 덧셈연산을 묶을 목적으로,
		 * 또 하나는 형 변환을 목적으로 등장하였다. 이중에서 형 변환에서 사용된 소괄호는 다음 챕터에서 설명하는 연산자로 분류한다.
		 * 반면에 묶거나 구분하는 목적으로 사용이 되는 소괄호는 '구분자'라 하여 그 성격이 연산자와 다르다.
		 */
		
	}

}
