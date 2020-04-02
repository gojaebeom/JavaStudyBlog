package ch02_클래스;

//클래스의 정보은닉
public class Example02 {
	
	public static void main(String[] args) {
		
		/**
		 * Example01 클래스와 다른점은 
		 * person클래스의 맴버변수 name에 private 접근제한자를 걸어 해당 클래스 외에는 상태에 접근을 못하게 하였다.
		 * 대신 매서드를 통해 값을 할당하고 사용하는 방식으로 클래스를 구현 한 것을 알 수 있다.
		 */
		
		Person2 person = new Person2();
		person.setName("홍길동");
		String name = person.getName();
		System.out.println("이름: "+ name);
		
	}

}

class Person2{
	
	private String name;
	
	//매개변수를 통해들어온 값을 맴버변수 name에 값을 할당
	public void setName(String name) {
		this.name = name;
	}
	
	//맴버변수 name의 값을 반환하여 호출한 곳에서 값을 사용할 수 있다.
	public String getName() {
		return this.name;
	}
	
}
