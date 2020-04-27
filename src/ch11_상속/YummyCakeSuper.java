package ch11_상속;
//오버라이딩 된 메소드를 호출하는 방법 예제

class Cake02{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake02 extends Cake02{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy CheeseCake");
	}
}

public class YummyCakeSuper {
	public static void main(String[] args) {
		CheeseCake02 cake = new CheeseCake02();
		cake.yummy();
	}
}
