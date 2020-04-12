package ch10_배열;

public class 배열_생성하는방법 {

	/**
	 * 배열은 자료형이 같은 둘 이상의 값을 저장할 수 있는 메모리 공간을 의미한다.
	 * 그리고 배열은 그 구조에 따라서 1차원 배열과 2차원 이상의 다차원 배열로 나뉜다.
	 * 
	 * @1차원_배열
	 * 1차원 배열은 다음과 같이 정의할 수 있다.
	 * 
	 * - 타입이 같은 둘 이상의 데이터를ㄹ 저장할 수 있는 1차원 구조의 메모리 공간
	 * 
	 * 그런데 자바는 배열도 인스턴스로 처리한다.
	 * 즉 자바에서는 배열도 인스턴스 이다. 
	 * 다음 예제를 보자.
	 */
	
	public static void main(String[] args) {
		
		int[] ref = new int[5];//길이가 5인 int형 1차원 배열의 생성문
		
		/**
		 * 위 문장에서 등호를 기준으로 왼편, 오른편에 위치한 것은 각각
		 * 참조변수의 선언과 배열의 생성이다.
		 * 
		 * 물론 다음과 같이 참조변수의 선언과 배열 인스턴스의 생성을 구분할 수도 있다.
		 */
		
		int[] ref2;
		ref2 = new int[5];
		
		/**
		 * 물론 int형 말고도 다양한 자료형으로 배열을 생성할 수 있다.
		 */
		
		double[] db = new double[5];
		float[] f = new float[3];
		String[] str = new String[10];
		
		//각 배열에 대한 길이 
		System.out.println(db.length);
		System.out.println(f.length);
		System.out.println(str.length);
		
		/**
		 * 위의 문장을 보면 각 배열의 인스턴스 변수 length에 접근하여 배열의 길이 정보를 출력하였다.
		 * 이렇듯 인스턴스 변수에 접근이 가능하다는 것은 배열이 인스턴스임을 보인는 결과이기도 하다.
		 */
	}
}
