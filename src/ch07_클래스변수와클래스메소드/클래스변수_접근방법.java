package ch07_클래스변수와클래스메소드;

public class 클래스변수_접근방법 {
	/**
	 * 클래스 변수도 '접근 수준 지시자' 의 규칙을 그대로 적용받기 때문에 public으로 선언되면 
	 * 어디서든 접근이 가능하다. 물론 접근 방법에 있어서는 차이를 보이는데 이와 관련된 내용은 이어서 설명하겠다.
	 * 
	 * @클래스변수의 접근 방법
	 * 
	 * 클래스 변수에 접근하는 방법은 접근 영역을 기준으로 다음과 같이 크게 두 가지로 나뉜다.
	 * - 클래스 내부 접근 : 변수의 이름을 통해 직접 접근
	 * - 클래스 외부 접근 : 클래스 또는 인스턴스의 이름을 통해 접근
	 * 
	 * 다음예제를 보면서 클래스 변수의 접근 방법을 알아보자.
	 */
	
	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		way.num++; //외부에서 인스턴스의 이름을 통한 접근
		AccessWay.num++; //외부에서 클래스의 이름을 통한 접근
		System.out.println("num = " + AccessWay.num);// 총 3이 찍힌다.
		
		AccessWay way2 = new AccessWay();//way2라는 새로운 AccessWay의 인스턴스를 생성하였다.
		System.out.println(way2.num);//그리고 way2의 클래스변수 num을 조회 하였는데 값은 4가 찍힌다.
		
		/**
		 * 인스턴스의 이름을 통한 접근 방법을 보면서, 클래스 변수를 인스턴스 내부에 위치한 것으로 오해하면 안된다.
		 * 그리고 클래스 변수 num은 default로 선언되었다. 따라서 클래스 내부는 물론 클래스 외부이더라도
		 * 동일 패키지로 묶여 있으면 접근이 가능하다.
		 */
	}
	
}

class AccessWay{
	static int num = 0;
	
	AccessWay(){
		incrCnt();
	}
	
	void incrCnt() {
		num++; //클래스 내부에서 이름을 통한 접근
	}
}
