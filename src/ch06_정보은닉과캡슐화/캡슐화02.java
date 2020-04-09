package ch06_정보은닉과캡슐화;

public class 캡슐화02 {
	/**
	 * @캡슐화가 잘 이뤄진 예제: 하나의 클래스로 캡슐화 완성하기
	 * 앞서 보인 예제와 내용은 같지만 코드의 구성에서 차이가 난다.
	 */
	
	public static void main(String[] args) {
		ColdPatient02 suf = new ColdPatient02();
		suf.takeSinus(new SinusCap());
	}
	
}

class SinusCap{
	void sniTake() {
		System.out.println("콧물이 싹~ 납니다");
	}
	void sneTake() {
		System.out.println("재채기가 멎습니다.");
	}
	void snuTake() {
		System.out.println("코가 뻥 뚫립니다.");
	}
	
	void take() { //약의 복용 방법 및 순서가 담긴 메소드
		sniTake();
		sneTake();
		snuTake();
	}
}

class ColdPatient02{
	void takeSinus(SinusCap cap) {
		cap.take();
	}
	
	/**
	 * 위 예제는 앞서 보인 예제와 결과면에서는 동일하다. 
	 * 그러나 SinusCap 클래스 안에 코감기에 관련된 모든 내용이 캡슐화 되었다.
	 * 그래서 이의 복용과 관련된 코드를 담고 있는 ColdPatient 클래스와 main 메소드가 이전 예제와 비교하여 매우 간단해졌다.
	 * 즉 감기약 복용을 위해 알아야 할 내용은 다음이 전부이다.
	 */
}
