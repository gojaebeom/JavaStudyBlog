package ch09_String클래스;

public class String클래스_예제01 {
	
	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("Simple String");
		String str2 = "The Best String";
		
		System.out.println(str1);
		System.out.println(str1.length());//length의 반환 값을 인자로 전달
		System.out.println();// 단순 '개 행' 을 위한 sysout
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		
		showString("Funny String");	
	}
	/**
	 * 예제에서는 11, 12 번 줄에 보이듯 두 가지 인스턴스 생성 방법을 보였다.
	 * 그리고 String 클래스에 다음과 같이 정의된 length 메소드를 호출하여 문자열의 길이를 반환하고 이를 출력하였다.
	 * 
	 * public int length(){...}
	 * 
	 * 그런데 이 상황에서 다음과 같은 의문이 든다. 
	 * 위 예제에서 length의 반환 값을 println의 인자로 전달했기 때문이다.
	 * 
	 * 메소드 length의 반환 값이 어떻게 println 메소드의 인자가 될 수 있을까?
	 * 
	 * 메소드 println은 이전에 배웠던 오버로딩이 되어 있기 때문에 가능하다. 특히 인자를 전달하지 않고도
	 * 호출이 가능한데 이럴 경우 단순히 '개 행' 을 하게 된다
	 * 
	 * void println(){...}
	 * 
	 * void println(int x){...}
	 * 
	 * void println(String x){...}
	 * 
	 * 사실 println 메소드는 보다 다양한 인자를 전달받을 수 있도록 오버로딩 되어 있는데, 여기서는 예제에서
	 * 호출한 메소드를 대상으로만 오버로딩 관계를 소개하였다. 그리고 이어서 예제의 다음 문장을 관찰할 필요가 있다.
	 * 이는 마치 문자열을 통째로 전달하는 듯한 모습을 보인다.
	 * 그러나 메소드에는 문자열이 아닌 "Funny String"을 대상으로 만들어진 String 인스턴스의 참조 값이 전달이 된다.
	 * 
	 * showString("Funny String");
	 * 
	 * 위의 문장이 실행되면 일단 "funny String"을 대상으로 String 인스턴스가 만들어진다. 
	 * 그리고 이어서 이 인스턴스의 참조 값이 문자열 선언을 대신하게 된다. 예를 들어서 위의 문자열 선언을 통해 생성된
	 * 인스턴스의 참조 값이 Ox1234라고 하면 , 위의 문장은 메소드 호출 전 (String 인스턴스 생성 후) 다음과 같은 상황에 놓이게 된다.
	 * 
	 * showString("Funny String") -> showString(0x1234); // 0x1234는 인스턴스의 참조값이라고 가정
	 * 
	 * 그래서 다음과 같이 매개변수 선언이 String형 참조변수로 선언된 메소드는 문자열을 인자로 전달받을 수 있다.
	 * 
	 * public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
		}
	 */
}
