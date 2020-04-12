package ch09_String클래스;

public class String클래스_예제02 {
	/**
	 * 이전 예제에서 문자열 정보를 담고 있는 String 인스턴스의 생성 방법에는 
	 * 다음과 같이 두 가지가 있음을 설명하였다.
	 * 
	 * String str1 = new String("Hello World");
	 * String str2 = "Hello World";
	 * 
	 * 그렇다면 이 두 방법으로 생성된 인스턴스 사이에는 어떠한 차이가 있을까?
	 * 약간의 차이가 있는데 다음 예제를 통해서 알아보자.
	 */
	
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		String str3 = new String("Hello World");
		String str4 = new String("Hello World");
		
		if(str1 == str2) {
			System.out.println("str1 과 str2는 동일 인스턴스 참조");
		}else {
			System.out.println("str1 과 str2는 다른 인스턴스 참조");
		}
		
		if(str3 == str4) {
			System.out.println("str3 과 str4는 동일 인스턴스 참조");
		}else {
			System.out.println("str3 과 str4는 다른 인스턴스 참조");
		}
	}
	
	/**
	 * 참조변수를 대상으로 한 == 연산은 참조변수의 참조 값에 대한 비교 연산을 진행한다.
	 * 예를 들어서 아래 코드를 실행할 경우 == 연산의 결과로 true가 출력된다.
	 * 
	 * AAA inst1 = new AAA();
	 * AAA inst2 = inst1; // 두 참조변수는 동일 인스턴스 참조
	 * System.out.println(inst1 == inst2);
	 * 
	 * 결과적으로 위의 예제에서 16,17번째 줄의 str1, str2가 참조하는 인스턴스는 같은 인스턴스이고,
	 * 19,20번째 줄의 str3, str4는 서로 다른 인스턴스를 참조한다.
	 * 
	 * 이러한 차이를 보이는 이유는 무엇일까? 
	 * 가장 핵심이 되는 이유는 다음과 같다.
	 * 
	 * - String 인스턴스는 Immutable 인스턴스 이다.
	 * 
	 * 사전적으로 Immutable은 변경할 수 없는 의 뜻을 지닌다. 그리고 String 인스턴스에서 변경할 수 없는
	 * 것은 인스턴스가 갖는 문자열 내용이다. 예를 들어서 다음과 같이 String 인스턴스를 생성하면,
	 * 
	 * String str = "Hello world";
	 * 
	 * 이때 생성된 인스턴스는 내부에 문자열 Hello world를 지니게 되고, 이 내용은 인스턴스가 소멸될 때까지
	 * 바꿀 수 없다. 때문에 다음과 같이 인스턴스를 생성하면,
	 * 
	 * String str1 = "Hello World";
	   String str2 = "Hello World";
	   
	   문자열 내용이 같기 때문에 다음과 같이 하나의 인스턴스를 생성해서 이를 공유하는 방식으로 코드를 처리한다.
	   (이로 인해 생성되는 인스턴스의 수는 줄고 성능은 향상된다.)
	   String str1 = "Hello World";
	   String str2 = str1;
	 */
}
