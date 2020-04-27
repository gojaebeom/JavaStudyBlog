package ch11_상속;
//오버라이딩 예제

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {// Cake의 Yummy 메소드를 오버라이딩 함
		System.out.println("Yummy Cheese Cake");
	}
}

public class YummyCakeOverriding {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();
	}
}
