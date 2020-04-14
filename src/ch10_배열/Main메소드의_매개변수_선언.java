package ch10_배열;

public class Main메소드의_매개변수_선언 {

	/**
	 * 지금까지 배열에 대해서 알아보았다. 
	 * 그렇다면 main메소드의 매개변수 선언이 무엇을 의미하는지 알 수 있을 것이다.
	 * 
  	 * 매개변수로 String 배열의 참조변수가 선언되었다. 따라서 다음과 같이 
	 * main 메소드를 호출해야 한다. (main 메서드를 직접 호출한다는 가정하에 작성된 코드이다.)
	 * 
	 * String[] arr = new String []{"Coffee", "Milk", "Orange"};
	 * main(arr);
	 * 
	 * 물론 코드상에서 main메소드를 위와 같이 직접 호출하지는 않는다. 게다가 우리가 main 메소드에 전달할 
	 * String 배열을 만들지도 않는다. 그렇다면 어떻게 String 배열이 만들어지고 또 main 메소드의 인자로 전달되는 것일까?
	 * 
	 * String 배열을 구성하는 것도 main 메소드를 호출하는 것도 가상머신에 의해 이뤄지는 일이다. 다만 String 배열을
	 * 구성할 문자열은 프로그램 사용자가 전달해야 한다. 
	 * 
	 * 예를 들어서 Simple.class 에 위치한 main 메소드를 다음과 같이 호출한다고 가정해보자. 
	 * 
	 * C:\JavaStudy> java Simple
	 * 
	 * 그러면 String 배열이 다음과 같이 구성이 되어 main 메소드에 전달이 된다. 
	 * 
	 * String[] arr = new String[] {};
	 * 
	 * 즉 빈 String 배열이 생성되어 main 메소드의 호출이 이뤄진다.
	 * 반면 다음과 같이 실행을 하면, 
	 * C:/JavaStudy> java Simple Coffee Mile Orange
	 * 
	 * 즉 실행 명령문에 이어서 공백을 구분 기준으로 문자열을 입력하면, 이 내용을 대상으로 String 배열이 구성되고, 이 배열의 참조 값이 
	 * 전달되면서 main 메소드가 호출이 된다. 그럼 이러한 내용의 확인을 위해 다음 예제를 실행해보자.
	 */
	
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
