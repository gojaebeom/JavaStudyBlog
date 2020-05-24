package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		//기본 자료형에 대한 클래스
		//자바 1.5이전에는 서로 더할 수 없었다.
		
		int i = new Integer(5);
		Integer inte = i;
		System.out.println(inte);
	}
}
