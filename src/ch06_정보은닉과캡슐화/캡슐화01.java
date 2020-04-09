package ch06_정보은닉과캡슐화;

public class 캡슐화01 {

	/**
	 * 캡슐화는 정보 은닉과 더불어 객체지향 기반의 클래스 설계에 있어 가장 기본이면서 중요한 원칙 중 하나이다.
	 * 캡슐화는 문법적인 내용은 아니다. 클래스 안에 '무엇을 넣을까' 에 대한 이론을 제시한는 내용이다.
	 * 
	 * 캡슐화를 다음과 같이 정의할 수 있다. 
	 * 
	 * - 하나의 목적을 이루기 위해 관련 있는 모든 것을 하나의 캡슐에 담아 두는 것
	 * 
	 * 물론 객체지향 관점에서 위의 캡슐은 클래스에 해당한다. 즉 위의 문장은 다음과 같이 다시 쓸 수 있다.
	 * 
	 * - 하나의 목적을 이루기 위해 관련 있는 모든 것을 하나의 클래스에 담아 두는 것
	 * 
	 * 무조건 많이 담는다고 해서 캡슐화가 아니다. 부족해도 안되고 넘쳐도 문제가 된다. 그리고 상황 및 목적에
	 * 따라서 동일한 이름의 클래스에도 담기는 내용이 달라진다. 
	 * 
	 * 직접 만들어보면서 알아가보자. 
	 * 일단 캡슐화가 이뤄지지 않은 예제이다.
	 */
	
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		
		//콧물 캡슐 구매 후 복용
		suf.takeSinivelCap(new SinivelCap());
		
		//재채기 캡슐 구매 후 복용
		suf.takeSneezeCap(new SneezeCap());
		
		//코막힘 캡슐 구매 후 복용
		suf.takeSunffleCap(new SnuffleCap());
	}
	
}

class SinivelCap {// 콧물 처치용 캡슐
	void take() {
		System.out.println("콧물이 싹~ 납니다.");
	}
}

class SneezeCap{// 재채기 처치용 캡슐
	void take() {
		System.out.println("재채기가 멎습니다.");
	}
}

class SnuffleCap{
	void take() {
		System.out.println("코가 뻥 뚫립니다.");
	}
}

class ColdPatient{
	void takeSinivelCap(SinivelCap cap){
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap){
		cap.take();
	}
	void takeSunffleCap(SnuffleCap cap) {
		cap.take();
	}
	
	/**
	 * 위와 같은 클래스 구성에서는 프로그래머가 다음 사실을 인지하고 있어야 한다.
	 * 
	 * -코감기 증상 완화를 위해 SinivelCap , SneezeCap , SnuffleCap 인스턴스를 생성해야 한다.
	 * 
	 * 더불어 어디까지나 가정이지만, 약 복용에 있어서 다음 사항도 지켜야 한다고 가정해보자.
	 * 약은 SinivelCap, SneezeCap, SnuffleCap의 순으로 복용해야 한다.
	 * 
	 * 지금 언급한 것이 캡슐화가 정상적으로 이뤄지지 않았을 때의 문제점이다. 
	 * 코감기 약 복용이라는 한 가지 목적의 달성을 위해 프로그래머가 알아야 할 것도 많고 코드상에서의 약 복용 과정 또한 복잡하다.
	 * 그렇다면 캡슐화가 잘 이뤄졌다면 상황은 어떻게 달라질 수 있을까?
	 * 캡슐화02에서 캡슐화가 잘 이뤄진 예제를 보자.
	 */
}
