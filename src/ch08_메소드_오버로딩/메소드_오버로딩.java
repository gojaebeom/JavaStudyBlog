package ch08_메소드_오버로딩;

public class 메소드_오버로딩 {
	/**
	 * @메소드_오버로딩(Method Overloading)
	 * 한 클래스 내에 동일한 이름의 메소드를 둘 이상 정의한느 것은 허용되지 않는다.
	 * 그러나 매개변수의 선언이 다르면 가능하다. 그리고 이것을 메소드 오버로딩이라 한다.
	 * 
	 * 메소드 오버로딩의 조건
	 * - 메소드의 이름
	 * - 메소드의 매개변수 정보
	 */
	
	void exMethod() {
		
	}
	void exMethod(int num1) {
		
	}
	void exMethod(int num1, int num2) {
		
	}
	void exMethod(String str) {
		
	}
	
	/**
	 * 위의 예제를 보면 알 수 있듯이 메소드의 이름이 같지만 
	 * 오류를 일으키지 않고 선언이 가능하다.
	 * 
	 * 첫번째 메소드는 매개변수가 없다.
	 * 두번째 메소드는 매개변수를 한개 받는다
	 * 세번째 메소드는 매개변수를 두개 받는다.(물론 그 이상도 가능하다.)
	 * 네번째 메소드는 두 번째와 같이 매개변수를 하나 받지만 매개변수의 형이 String으로 2번째인 int형과 다르기 때문에 가능하다.
	 * 즉 매소드의 매개변수가 타입과, 받는 개수가 다르다면 오버로딩이 성립한다.
	 * 
	 * 하지만 다음과 같은 애매한 상황이 있다. 
	 * 예제를 보자.
	 */
	void simple(int p1, int p2) {
		System.out.println("메소드 1");
	}
	void simple(int p1, double p2) {
		System.out.println("메소드 2");
	}
	
	public static void main(String[] args) {
		메소드_오버로딩 mo = new 메소드_오버로딩();
		mo.simple(1, 'K');
		
		new Person();//생성자 1
		new Person(1,2);//생성자 2
	}
	
	/**
	 * 위의 메소드 호출은 애매하다. 이유는 메소드의 인자 전달 과정에서 발생하는 형 변환 때문이다. 
	 * 사실 위의 메소드_오버로딩 클래스에는 정수와 '문자'를 인자로 전달받는 simple 메소드가 정의되어 있지 않다.
	 * 때문에 자동 형 변환 규칙을 적용하여 호출할 메소드를 찾게 된다. 
	 * 그런데 문제는 클래스에 정의된 두 simple 메소드 모두 형 변환 규칙을 적용했을 때 호출이 가능하다는데 있다.
	 * 그래서 위의 메소드 호출문은 애매하다고 하는 것이 좋다.
	 * 결론을 말하자면 이러한 상황에서는 자동 형 변환 규칙을 적용하되 가장 가까운 위치에 놓여있는 자료형으로의 형 변환을 우선 시도한다.
	 * 때문에 위의 메소드 호출문에 의해 int형 정수 두개를 받는 simple 메소드가 실행된다.
	 */
}

class Person{
	/**
	 * 생성자도 매개변수의 선언이 다르면 둘 이상 정의가 가능하다. 
	 * 즉 생성자도 오버로딩의 대상이 된다.
	 */
	
	private int regiNum;//주민등록 번호
	private int passNum;//여권 번호
	
	public Person() {
		System.out.println("생성자1");
	}
	public Person(int rnum, int pnum) {
		System.out.println("생성자2");
		regiNum = rnum;
		passNum = pnum;
	}
}
