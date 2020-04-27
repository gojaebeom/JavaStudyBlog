package ch11_상속;

//Override 어노테이션 예제

class ParentAdder{
	public int add(int a, int b) {
		
		return a + b;
	}
}

class ChildAdder extends ParentAdder{
	
	// 상위 클래스의 add를 오버라이딩 하려고 합니다.
	public double add(double a, double b) {
		return a + b;
	}
}

public class OverrideMistake {
	public static void main(String[] args) {
		ParentAdder adder = new ChildAdder();
		System.out.println(adder.add(3, 4));
	}
}
