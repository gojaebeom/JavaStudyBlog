package ch10_배열;

public class 배열_예제02 {

	/**
	 * String형 배열에 문자열을 저장하고 참조하는 예제
	 */
	
	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		strArr[0] = new String("Java");
		strArr[1] = new String("System");
		strArr[2] = new String("Compiler");
		
		int countNum = 0;
		
		for(int i=0; i<strArr.length; i++) {
			countNum += strArr[i].length();//문자열 길이를 정수형으로 반환하는 메소드
		}
		
		System.out.println(countNum);
		
		/**
		 * 이번 예제에서 관심 있게 볼 부분은 반복문이다. 
		 * 18번줄의 for문에서 변수 i를 이용하여 모든 배열 요소에 접근하였다.
		 * 
		 * 이렇듯 반복문을 이용하면 배열의 순차적 접근을 진행하는 문장을 구성할 수 있다. 
		 * 그리고 이것이 배열이 갖는 대표적인 장점 중 하나이다.
		 * 참조변수 일곱 개를 선언하여 일곱 개의 문자열을 저장할 수는 있다.
		 * 그러나 단 두줄의 코드만을 이용해서 모든 문자열에 접근하는것은 배열이 아니면 불가능하다.
		 */
	}
}
