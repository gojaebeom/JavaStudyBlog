package ch06_정보은닉과캡슐화;

public class 캡슐화03 {

	/**
	 * 캡슐화는 절대로 클래스를 크게 만들라는 뜻이 아니다.
	 * 캡슐화에서 말하고자 하는 것은 크기가 아닌 내용이다. 
	 * 해당 클래스와 관련 있는 내용을 하나의 클래스에 모두 담되 부족하게 담아서도
	 * 넘치게 담아서도 안된다는 뜻이다.
	 * 
	 * @캡슐화가 잘 이뤄진 또 다른 예제 : 포함 관계로 캡슐화 완성하기
	 * 한 클래스가 다른 클래스의 인스턴스를 맴버로 가질 수 있는데, 이러한 관계를 가리켜 
	 * '포함 관계' 라 한다.
	 * 그리고 이러한 포함 관계는 캡슐화를 완성하는 과정에서도 사용이 된다. 
	 * 
	 * 다음 예제를 보자.
	 */
	
	public static void main(String[] args) {
		Cook cook = new Cook();
		cook.makeBurger(new Hamburger());
	}
	
	/**
	 * 이건 책에 나와있는 약복용법을 내가 이해한대로 조금 응용해서
	 * 햄버거 조리법으로 바꾸어 보았다.
	 * 
	 * 재료를 담당하는 햄버거 빵, 고기, 치즈 클래스가 있고 이것을 요리하는 주방직원 클래스가 있다.
	 * 실제로 이것도 프로그램이라고 하기엔 많이 부족한 부분이 있지만 
	 * 포함관계에대해서 잘 다루어 지고있는 예제이다.
	 */

}

class Bread{//빵 클래스
	void put() {
		System.out.println("햄버거 빵을 놓는다. ");
	}
	
	void putOn() {
		System.out.println("햄버거 빵을 덮는다.");
	}
}

class Patty{//햄버거용 고기 클래스
	void putOn() {
		System.out.println("고기를 얹는다.");
	}
}

class Cheeze{//햄버거용 치즈 클래스
	void putOn() {
		System.out.println("치즈를 얹는다.");
	}
}

class Hamburger{//햄버거를 만드는 클래스
	Bread bread = new Bread();
	Patty patty = new Patty();
	Cheeze cheeze = new Cheeze();
	
	void recipe() {
		//제조 과정이 단순히 빵을 놓고 , 고기를 놓고, 치즈를 놓고 빵을 덮는일 이라고 할때
		//그것을 수행하는 메소드
		
		bread.put();//빵 바닥에 깔기
		patty.putOn();// 고기 얹기 
		cheeze.putOn();// 치즈 얹기
		bread.putOn();// 빵 다시 덮기
		
	}
}

class Cook{//주방 직원 클래스
	
	void makeBurger(Hamburger burger) {
		burger.recipe();
	}
	
}


