package ch10_배열;

import java.util.Arrays;

public class 배열_초기화와_배열의_복사 {

	/**
	 * 배열이 생성되면 모든 요소는 0또는 null로 초기화된다. 
	 * 다음 예제를 보자
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[5]; //0으로 초기화
		String[] strArr = new String[3]; //null로 초기화
		
		/**
		 * 그런데 int형 배열과 같은 기본 자료형 배열을 0 이외의 값으로 초기화해야 할 때가 있다. 
		 * 이러한 경우에는 반복문을 이용해서 원하는 값을 배열에 저장할 수도 있지만 
		 * 다음 메소드 호출을 통해서 원하는 값을 배열에 저장할 수도 있다.
		 * 
		 * @fill_메소드
		 * public static void fill(int[] a, int val)
		 * -> 두 번째 인자로 전달된 값으로 배열 초기화
		 * 
		 * public static void fill(int[] a, int fromIndex, int toIndex, int val)
		 * -> 인덱스 fromIndex ~ (toIndex-1)의 범위까지 val의 값으로 배열 초기화
		 * 
		 * 위의 두 메소드는 java.util.Arrays 클래스에 정의되어 있으며 각 기본 자료형 별로 메소드가 오버로딩 되어 있다.
		 * 
		 * 그리고 배열을 복사해야 하는 상황도 종종 발생하는데, 이 경우에도 반복문을 구성해서 
		 * 복사를 진행할 수 있지만 java.lang.System 클래스의 다음 메소드를 통해서 복사를 할 수도 있다.
		 * 
		 * @arraycopy_메소드
		 * public static void arraycopy(Ojbect src, int srcPos, Object dest, int destPos, int length)
		 * ->복사 원본의 위치: 배열 src의 인덱스 srcPos
		 * ->복사 대상의 위치 : 배열 dest의 인덱스 destPos
		 * ->복사할 요소의 수 : length
		 * 
		 * 소개한 두 메서드를 사용해보자.
		 */
		
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		Arrays.fill(ar1, 3);// 참조변수 ar의 10개의 공간의 값을 모두 3으로 초기화
		/**
		 * 매개변수로 전달된 배열의 값을 그냥 바꾸어 버리기 때문에 반환값이 없다.
		 */

		for(int i=0; i<ar1.length; i++) {
			System.out.println(ar1[i]);
			//출력해보면 모든 인덱스가 3으로 초기화 되어있는 것을 볼 수 있다.
		}
		System.out.println();//단순한 개 행
		
		
		System.arraycopy(ar1, 0, ar2, 3, 4);//배열 ar1를 ar2로 부분 복사
		
		for(int i=0; i<ar2.length; i++) {
			System.out.println(ar2[i]);
			//출력해보면 배열2의 3(4)번째 인덱스부터 4size만큼 3으로 값이 복사 되어 있는 것을 알 수 있다.
			//0,0,0,3,3,3,3,0,0,0
		}
	}
}
