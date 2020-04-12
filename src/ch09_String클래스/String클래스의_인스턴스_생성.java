package ch09_String클래스;

public class String클래스의_인스턴스_생성 {
	/**
	 * 자바에서는 String이라는 이름의 클래스를 정의하여 제공하고 있다. 
	 * 그리고 이 클래스의 목적은 문자열 표현에 있다.
	 * 지금까지 인식하지 못했지만 앞서 보아온 모든 예제에서 String 클래스의 
	 * 인스턴스를 생성해왔다.
	 * 
	 * 문자열 표현을 위한 String 인스턴스 생성 방법은 다음과 같다.
	 * 일반적인 인스턴스의 생성 방법과 차이가 없다.
	 */
	
	public static void main(String[] args) {
		String str = new String("Simple String");
		
		/**
		 * 이렇게 인스턴스가 생성되면 str이 참조하는 String 인스턴스의 내부에는 문자열 Simple String 이
		 * 담기게 되고, 이는 다음과 같이 출력하여 그 내용을 확인 할 수 있다. 
		 */
		
		System.out.println(str);
		
		/**
		 * 지금까지 많이 호출해왔던 System.out.println 메소드는 다음과 같이 정의되어 있기 때문에 
		 * String 인스턴스의 참조 값이 인자로 전달 가능하다 
		 * 
		 * public void println(String s){...}
		 * 
		 * 그리고 다음과 같은 방법으로도 String 인스턴스를 생성할 수 있으며, 이것이 new 를 이용한 
		 * 방법보다 보편적인 String 인스턴스의 생성 방법이다.
		 */
		String str2 = "Simple String";
		
		/**
		 * 이렇듯 큰따옴표를 이용하여 문자열을 표현하면,  이는 String 인스턴스의 생성으로 이어진다.
		 * 이와 관련하여 다음 String클래스_예제01 를 보자
		 */
	}
}
