package ch05_클래스와인스턴스;

public class String클래스 {

	/**
	 * @String 클래스의 소개
	 * 다음 진도를 위해 문자열 처리에 대한 기술 몇가지를 알아가보자.
	 * 문자열은 큰따옴표로 묶어서 표현함을 이미 알고 있다.
	 * 그런데 이러한 문자열은 다음과 같이 참조변수를 선언해서 참조할 수도 있다.
	 */
	
	String myName = "Go Jae Beom"; //String형 참조변수의 문자열 참조
	
	/**
	 * 위의 상황은 참조변수 myName이 문자열 "Go Jae Beom"을 가리키는 상황이다. 
	 * 
	 * 사실 String은 자바에서 제공하는 클래스의 이름인데 이러한 내용은 이후에 별도로 설명을 한다. 
	 * 따라서 문자열의 활용 측면에서만 위의 문장을 이해해보자.
	 * 그럼 이와 관련하여 다음 예제를 보자.
	 */
	
	public static void main(String[] args) {
		//문자열 선언과 동시에 참조변수로 선언한다.
		String str1 = "Happy";
		String str2 = "BirthDay";
		System.out.println(str1 + " " + str2);
		
		//메소드에 문자열을 전달하는 다양한 방법을 보여준다.
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("Hello World! \n");
	}
	
	public static void printString(String str) {
		System.out.print(str);
	}
	
	/**
	 * 위의 예제를 통해 알 수 있는 그리고 알아야 할 사실 두 가지는 다음과 같다.
	 * - 문자열을 메소드의 인자로 전달할 수 있다.
	 * - 매개변수로 String형 참조변수를 선선하여 문자열을 인자로 전달받을 수 있다.
	 * 
	 * 앞으로 이 정도의 이해 수준에서 문자열을 활용하자.
	 */
	
}