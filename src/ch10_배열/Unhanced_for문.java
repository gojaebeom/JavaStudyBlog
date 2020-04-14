package ch10_배열;

public class Unhanced_for문 {

	/**
	 * 이번에 소개하는 enhanced for문은 자바 5에서 추가되었다. 그리고 지금은 많이 사용되는 반복문
	 * 중 하나가 되었다. 
	 * 
	 * @enhanced for문의 이해와 활용
	 * 프로그램을 작성하다 보면 다음과 같이 배열에 저장된 모든 요소를 대상으로 연산, 참조 또는 탐색을 
	 * 진행하는 경우를 흔히 접할 수 있다.
	 * 
	 * - 배열에 저장된 값 중에서 특정 조건에 해당하는 값을 찾아라. 
	 * - 배열에 저장된 모든 값에 대해 12%씩 그 값을 증가시켜라 
	 * 
	 * 그리고 이러한 상황에서의 문장 구성을 돕기 위해 등장한것이 enhanced for문이다.(for-each 문으로도 불린다)
	 * 
	 * 예를 들어서 배열에 저장된 모든 값을 출력하라 는 요구사항을 만족하는 for문은 다음과 같이 작성할 수 있다.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/**
		 * 그리고 위의 for문을 for-each문으로 구성하면 다음과 같다.
		 */
		
		for(int e: arr) {
			System.out.println(e);
		}
		
		/**
		 * 객관적으로 비교해 보았을 때 새로운 for문에는 다음 두 가지 장점이 있다.
		 * - 코드의 양이 절대적으로 줄어든다.
		 * - 반복문 구성 과정에서 배열의 길이 정보를 직접 확인하고 입력할 필요가 없다.
		 */
		
		
		/**
		 * @인스턴스 배열을 대상으로 하는 enhanced for 문
		 * 배열에 저장된 내용이 기본 자료형의 값이 아닌 인스턴스의 참조 값인 경우에도 enhanced for문의 
		 * 활용에 있어서 달라지는 것은 없다. 다음은 Box Class의 Box형 배열을 생성하고 이를 대상으로 새로운 for문을 
		 * 구성한 예이다. (Box 클래스는 밑에 만들었다.)
		 */
		
		Box1[] ar = new Box1[5];
		ar[0]= new Box1(101, "Coffee");
		ar[1]= new Box1(202, "Cake");
		ar[2]= new Box1(303, "Coke");
		ar[3]= new Box1(404, "Cook");
		ar[4]= new Box1(505, "Cream");
		
		//배열에서 번호가 505인 Box를 찾아 그 내용물을 출력하는 반복문
		for(Box1 e : ar) {
			if(e.getBoxNum() == 505) {
				System.out.println(e);
			}
		}
	}
}

class Box1{
	private String contents;
	private int boxNum;
	
	Box1(int boxNum, String contents){
		this.boxNum = boxNum;
		this.contents = contents;
	}
	
	public int getBoxNum() {
		return boxNum;
	}
	
	public String toString() {
		return contents;
	}
}
