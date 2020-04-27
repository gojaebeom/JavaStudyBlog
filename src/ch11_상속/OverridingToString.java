package ch11_상속;
//toString 메소드 오버라이딩 예제

class Bread{
	
	//오브젝트 클래스의 toString 메소드를 오버라이딩
	public String toString() {
		System.out.println(super.toString());
		return "My Bread";
	}
}

class CreamBread extends Bread{
	
	//Bread 클래스의 toString 메소드를 오버라이딩
	public String toString() {
		
		return "my CreamBread";
	}
}

public class OverridingToString {
	public static void main(String[] args) {
		Bread b1 = new Bread();
		Bread b2 = new CreamBread();
		
		//b1이 참조하는 인스턴스의 toString 메소드 호출로 이어짐
		System.out.println(b1);
		
		//b2가 참조하는 인스턴스의 toString 메소드 호출로 이어짐
		System.out.println(b2);
	}
}
