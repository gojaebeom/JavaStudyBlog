package ch07_클래스변수와클래스메소드;

public class 클래스메소드_정의 {

	/**
	 * 클래스 내에 정의된 메소드에 static 선언을 하면 '클래스 메소드'가 된다.
	 * 그리고 클래스 메소드는 그 성격이 클래스 변수와 유사하다.
	 * 접근 방법도 동일하며 인스턴스 생성 이전부터 호출이 가능한, 그리고 
	 * 어느 인스턴스에도 속하지 않는 메소드라는 점도 클래스 변수와 동일하다.
	 * 
	 * @클래스_메소드(static 메소드) 의 정의와 호출
	 * 앞서 공부한 클래스 변수의 특성 두 가지는 다음과 같다.
	 * - 인스턴스 생성 이전부터 접근이 가능하다.
	 * - 어느 인스턴스에도 속하지 않는다.
	 * 
	 * 이 두 가지는 클래스 메소드도 동일하게 갖는 특성이다. 따라서 이 사실을 다음 예제를 통해서 확인해보겠다.
	 */
	
	public static void main(String[] args) {
		NumberPrinter.showInt(50);// 클래스 이름을 통한 클래스 메소드 호출
		
		/**
		 * 사실 위의 20번째 줄의 문장만 보더라도 클래스 메소드가 어느 인스턴스에도 속하지 않는다는 사실을 알 수 있다.
		 * 인스턴스 생성 이전에 호출이 되었기 때문이다. 
		 * 그리고 예제의 주석에서 설명하고 있듯이 클래스의 내부와 외부에서 클래스 메소드를 호출하는 방법은
		 * 클래스 변수에 접근하는 방법과 차이가 없다.
		 */
		
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15); // 인스턴스 이름을 통한 클래스 메소드 호출
		
		np.setMyNumber(30);
		np.showMyNumber();
	}
}

class NumberPrinter{
	private int myNum = 0;
	
	static void showInt(int n) {//클래스 메소드
		System.out.println(n);
	}
	static void showDouble(double n) {//클래스 메소드
		System.out.println(n);
	}
	
	void setMyNumber(int n) {//인스턴스 메소드
		myNum = n;
	}
	void showMyNumber() {//인스턴스 메소드
		showInt(myNum);
	}
}
