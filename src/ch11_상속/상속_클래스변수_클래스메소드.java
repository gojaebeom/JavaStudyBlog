package ch11_상속;

public class 상속_클래스변수_클래스메소드 {

	/**
	 * static 선언이 붙는 클래스 변수와 클래스 메소드도 상속의 대상에 포하밍 되겠는가?
	 * static 선언이 갖는 의미를 떠올리고 논리적으로 접근을 하면 이 질문에 스스로 답을 할 수 있다.
	 * 
	 * @static 선언이 붙는 클래스 변수와 클래스 메소드의 상속
	 * 
	 * 앞서 공부한 클래스 변수와 클래스 메소드의 특징을 정리하면 다음과 같다. 
	 * -인스턴스의 생성과 상관없이 접근이 가능하다.
	 * -클래스 내부와 외부에서 접근이 가능하다.
	 * -클래스 변수와 클래스 메소드가 위치한 클래스 내에서는 직접 접근이 가능하다.
	 * 
	 * 즉 클래스 변수와 클래스 메소드는 인스턴스에 속하지 않는, 딱 하나만 존재하는 변수와 메소드이다.
	 * 따라서 상속의 대상이 아니다.
	 * 
	 * 그렇다면 다음 내용에 대해서는 생각을 해볼 필요가 있다. 
	 * 
	 * - 상위 클래스에 위치한 클래스 변수와 메소드에 하위 클래스에서 어떻게 접근하는가?
	 * 
	 * 결론을 말하자면 변수의 이름만으로 접근이 가능하다. 
	 * 단 접근 수준 지시자가 접근을 허용해야 접근이 가능하다. 
	 * 다음 예제를 통해 알아보자. 
	 */
	
	public static void main(String[] args) {
		SuperClass sc1 = new SuperClass(); // 값 1 증가
		SuperClass sc2 = new SuperClass(); // 값 1 증가
		
		SubClass sub1 = new SubClass();//인스턴스 생성 과정에서 부모생성자가 호출 되므로 count 값 1 증가
		sub1.showCount();
	}
}

class SuperClass{
	
	protected static int count = 0; //protected는 하위 클래스 접근을 허용
	
	public SuperClass() {
		count++;
	}
}

class SubClass extends SuperClass{
	
	public void showCount() {
		System.out.println(count);
	}

}

/**
 * 위의 예제에서 변수 count의 접근 수준 지시자를 private으로 선언하면 이로 인해 컴파일 오류가 발생하는 것도 확인하기 바란다.
 */
