package ch07_클래스변수와클래스메소드;

import java.time.LocalDate;

public class 다른용도의static선언 {

	/**
	 * static 선언은 클래스 변수와 클래스 메소드의 선언 이외에 다른 용도로도 사용이 된다. 
	 * 사용 빈도가 높지는 않으나 상황에 따라 유용하게 사용할 수 있으니 알아 두는 것이 좋다.
	 */
	
	/**
	 * @static초기화블록
	 * 다음 클래스 정의를 보자 이 클래스에는 프로그램의 실행 날짜를 저장할 목적으로 변수가 하나 선언되었다.
	 * 그리고 이 변수는 변경의 대상이 아니고 참조만을 목적으로 하므로 클래스 변수로 선언을 하였다.
	 */

	static String date; //프로그램의 실행 날짜를 저장하기 위한 변수
	
	public static void main(String[] args) {
		System.out.println(date);
		
		/**
		 * 위에서 클래스 변수 date를 선언과 동시에 오늘 날짜 정보를 담고 있는 문자열로 초기화 하고싶다. 
		 * 그런데 오늘 날짤르 얻어오는 코드는 다음과 같다. 다음 두 문장이 실행되어야 변수 date에는 오늘 날짜 정보가 담긴다.
		 */
		
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
		
		/**
		 * 변수 date가 인스턴스 변수라면 위의 두문장을 생성자에 넣으면 된다. 그러나 이는 클래스 변수이므로
		 * 생성자는 적절치 않다. 이러한 상황을 고려하여 자바는 'static 초기화 블록' 이라는 것을 제공한다.
		 * 그리고 위의 두 문장을 static 초기화 블록으로 감싼 결과는 다음과 같다.
		 */
	}
	
	static {
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	/**
	 * static 초기화 블록은 클래스 변수와 마찬가지로 가상머신이 클래스의 정보를 읽어 들일 때 실행이된다.
	 * 따라서 다음과 같이 static 초기화 블록을 사용하면 클래스 변수를 선언과 동시에 초기화 할 수 있다.
	 * 
	 * class ex{
	 * 		static String date;
	 *  
	 *  	static{
	 *  		LocalDate nDate = nLocalDate.now();
	 *  		date = nDate.toString();
	 *  	}
	 *  
	 *  	public static void main(String[] args){
	 *  		System.out.println(date);
	 *  	}
	 *  }
	 */
}

	/**
	 *	@static import 선언
	 *
	 *	앞서 클래스 변수를 설명하면서 다음과 같이 원주율을 클래스 변수로 선언한 바 있다.
	 *		static final double PI = 3.1415;
	 *	그런데 이 값은 클래스 java.lang.Math에 실제로 클래스 변수로 선언되어 있다. 따라서 다음과 같이
	 *	값을 추출할 수 있다.
	 *
	 *		-Math.PI
	 *
	 *	만약 
	 *
	 *  	-import static java.lang.Math.PI; 
	 *  
	 *  이렇듯 PI에 대한 static import 선언을 하게 되면 
	 *  
	 *  	-PI 
	 *  
	 *  이렇게 바로 접근이 가능하다. 
	 *  
	 *  응용하자면 
	 *  
	 *  	-import static java.lang.Math.*;
	 *  
	 *  모든 클래스 변수와 메소드에 대한 import 선언을 하게되면 
	 *  Math클래스 선언을 생략하고 이하 자원을 바로 쓸 수 있다.
	 */
