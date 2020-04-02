package ch02_클래스;

//클래스 만들어보기
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 이 예제는 person 객체의 필드변수에 바로 접근하여 값을 주는 방식이다.
		 * 이것은 좋은 예제는 아니다.
		 * 밑의 person클래스의 주석을 확인해보자
		 */
		Person person = new Person();
		
		String name = person.name = "홍길동";
		int age = person.age = 26;
		String gender = person.gender = "남";
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender);
		
	}

}

class Person {
	
/**
 * 클래스는 객체를 만드는 틀이다.
 * 
 * 사람이라는 클래스를 만들어 Main 클래스의 main 메서드에서 
 * Person 객체를 생성해보려고 한다.
 * 
 * 
 * 이번 person 클래스에서는 필드변수에 접근제한를 두지 않았다.
 * 이렇게 되면 같은 패키지 내의 다른 메인 메서드에서 이 객체의 맴버변수에 바로 접근할 수 있다.
 * 이것은 자바의 객체지향의 정보은닉에 어긋 난 것 이다.
 * 상태는 외부로부터 숨기고, 메서드를 통해 값을 받아 사용하는 Example02 클래스를 만들어보자.
 * 
 */
	
	String name;
	String gender;
	int age;
	
}
