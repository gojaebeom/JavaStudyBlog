package Test;

/**
 * @문제_3
 */
public class Question03 {
	String name;
	
	//덧셈
	public static int add(int x, int y) {
		return x + y;
	}
	
	//뺄셈
	public static int sub(int x, int y) {
		return x - y;
	}
	
	//곱셈
	public static int mul(int x, int y) {
		return x * y;
	}
	
	//나눗셈
	public static int div(int x, int y) {
		return x / y;
	}
	
	/**
	 * @문제_4
	 */
	public static void main(String[] args) {
		
		/**
		 * @문제_3번의 메소드들을 static으로 만들라고 한 이유
		 * 
		 * 1. 자바 컴파일러에 의해 Question03.java 가 -> Question03.class 파일로 컴파일됨, 
		 * 	  이후 자바가상머신(JVM)이 컴파일된 파일을 읽을 수 있게됨.
		 * 
		 * 2. JVM이 Question03.class 파일을 읽을 때  static 선언이 되어있는 변수나 메소드들은 먼저 메모리영역에 생성됨
		 *    (가상머신이 특정 클래스 정보를 읽는 행위를 가리켜 클래스 로딩 이라 한다)
		 *    
		 * 3. static이 선언되지 않는 변수나 메소드는 클래스 로딩 단계에서 생성되지 않음. 
		 *    이후에 Question03 클래스의 객체가 생성이 되면 힙 메모리에 인스턴스가 생성이됨. 이때 일반 변수와 메소드는 생성이 된다.
		 * 
		 * 4. 정리하면, 일반 변수와 메소드는 객체생성 이전엔 만들어지지 않았기때문에 main 메소드 내부에서 정의할 수 없다.
		 *    하지만 add, sub, mul, div는 static 메소드(클래스 메소드라고도 부름)이기 때문에 파일이 가상머신에서 읽어지는 단계에 
		 *    메모리영역에 생성이 되기때문에 main 메소드에서 객체 생성없이 사용될 수 있다.
		 *    
		 */

		System.out.println("덧셈: 5 + 3: " + add(5, 3));
		System.out.println("뺄셈: 9 + 7: " + sub(9, 7));
		System.out.println("곱셈: 8 + 4: " + mul(8, 4));
		System.out.println("나눗셈: 12 + 6: " + div(12, 6));
	}

}
