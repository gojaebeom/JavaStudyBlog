package ch07_클래스변수와클래스메소드;

public class Static변수_선언 {
	
	/**
	 *@클래스변수란?
	 * 인스턴스 변수는 인스턴스가 생성되었을 때, 생성된 인스턴스 안에 존재하는 변수이다.
	 * 그러나 클래스 변수는 인스턴스의 생성과 상관없이 존재하는 변수이다.
	 * 
	 * 클래스 내에 선언된 변수 앞에 static 키워드를 붙이면 이는 인스턴스 변수가 아닌 클래스 변수가 된다.
	 * 이러한 클래스 변수의 특성을 파악하기 위해서 다음 예제를 관찰하자.
	 */
	
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}
	
	/**
	 * 클래스 InstCount의 생성자에서 static으로 선언된 변수 instNum의 값을 하나 증가시킨  다음에 
	 * 그 결과를 출력하고 있다. 그런데 출력 결과를 보면 그 값이 인스턴스 생성 시마다 1씩 증가함을 알 수 있다.
	 * 그리고 이를 통해 다음 사실을 알 수 있다.
	 * 
	 * static으로 선언된 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수이다. 
	 * 
	 * 클래스 변수는 인스턴스 내에 존재하는 변수가 아니라 '어떠한 인스턴스에도 속하지 않는 상태로 메모리 공간에 딱 하나만 존재하는 변수' 이다.
	 * 다만 이 변수가 선언된 클래스의 인스턴스들은 이 변수에 바로 접근할 수 있는 권한이 있을 뿐 이다.
	 * 
	 */
	
}

class InstCnt{
	static int instNum = 0;// 클래스변수 (static 변수)
	
	InstCnt(){//생성자
		instNum++; //static으로 선언된 변수의 값 증가
		System.out.println("인스턴스 생성:"+instNum);
	}
}

