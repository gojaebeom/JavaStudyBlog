package ch09_String클래스;

public class String클래스의_메소드 {
	/**
	 * String 클래스에는 문자열 처리에 부족함이 없을 정도로 많은 메소드가 정의되어 있다.
	 * 그리고 대부분의 메소드들이 사용하는데 어려움이 없다.
	 * 
	 * 모든 String 클래스의 메서드를 예제로 다룰 수 는 없지만 
	 * 그중 자주 사용되는 것들을 알아보겠다.
	 */
	
	
	public static void main(String[] args) {
		
		/**
		 * @문자열연결시키기:Concat
		 */
		String str1 = "hello ";
		String str2 = "world";
		System.out.println("문자열 연결시키기>>");
		System.out.println(str1.concat(str2));
		
		/**
		 * @문자열의_일부를_추출하기:Substring
		 */
		String str3 = "hello world";
		System.out.println("문자열의 일부만 추출하기>>");
		System.out.println(str3.substring(5));//인자로 전달된 값(5)번째 이후의 문자열만 반환
		
		/**
		 * @문자열의_내용_비교:equals
		 * 반환값 : true or false
		 */
		String str4 = "hello world";
		boolean bool = str4.equals(str3) ? true : false;
		
		System.out.println("두 문자열의 비교");
		if(bool)
			System.out.println("두 문자열은 같습니다!");
		else
			System.out.println("두 문자열은 다릅니다!");

		/**
		 * @기본_자료형의_값을_문자열로_바꾸기
		 */
		double e = 2.51;
		String se = String.valueOf(e);
		System.out.println(se);
		/**
		 * 위처럼 double 뿐만아니라 int, flat, boolean, char 등등 기본 자료형들이 나타 내는 값을
		 * 그대로 문자열로 나타낼 수 있다.
		 */
		
		/**
		 * @문자열을 대상으로 하는 + 연산과 += 연산
		 */
		System.out.println("hello"+" world");//문자열 + 문자열
		/*
		 * 이렇듯 문자열 대상의 + 연산이 가능한 이유는 컴파일러에 의해서 + 연산이 이전에 보았던 
		 * concat 메소드의 호출로 바뀌기 때문이다.
		 * 
		 * System.out.println("hello".concat(" world"));
		 */
	}
}
