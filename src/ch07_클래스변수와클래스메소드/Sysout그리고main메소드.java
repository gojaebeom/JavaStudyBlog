package ch07_클래스변수와클래스메소드;

public class Sysout그리고main메소드 {
	
	/**
	 * 지금까지 main 메소드를 정의할 때 그 앞에 static 선언을 붙여왔다.
	 * 그리고 인스턴스의 생성 없이 println 메소드를 호출해 왔다.
	 * 
	 *  * System.out.println()에서 out과 println의 정체는? 
	 *  static 선언의 의미를 알았으니 sysout의 구성을 이해할 수 있다. 
	 *  일단 System은 자바에서 제공하는 클래스로 java.lang 패키지에 묶여있다.
	 *  따라서 원칙적으로는 다음과 같이 호출해야 한다.
	 *  
	 *  java.lang.System.out.println(...);
	 *  
	 *  그러나 컴파일러가 다음 문장은 삽입 해주기때문에 패키지의 이름부분은 생략할 수 있다. 
	 *  
	 *  import java.lang.*;
	 *  
	 *  그리고 out은 System.out으로 접근을 하니, 이는 분명 static으로 선언된 클래스 변수가 분명하다.
	 *  클래스의 이름을 통해 접근하니 말이다. 
	 *  실제로 out은 System 클래스 내에 다음과 같이 선언된 클래스 변수이다.
	 *  
	 *  public final class System extends Object{
	 *  	public static final PrintStream out; //참조변수
	 *  }
	 *  
	 *  마지막으로 println은 PrintStream 클래스의 인스턴스 메소드이다. 따라서 다음 문장을 보면서,
	 *  
	 *  System.out.println(...);
	 *  
	 *  다음과 같이 이해 할 수 있어야 한다.
	 *  
	 *  - System에 위치한 클래스 변수 out이 참조하는 인스턴스의 println 메소드를 호출하는 문장
	 */
	
	/**
	 * 다음으로 main 메소드가 public 이고 static인 이유에 대해서 알아보자.
	 * 
	 * main 메소드는 반드시 다음의 모양새를 갖춰야 한다.
	 *
	 * public static void main(String[] args) {
		
		}

	 * 이렇듯 main 메소드는 public 으로 그리고 static으로 선언해야 한다. 
	 * 이는 일종의 약속이다. 
	 * 
	 * main메소드의 호출이 이뤄지는 영역은 클래스 외부이다. 따라서 public으로 선언하는 것이 타당함을 알 수 있다.
	 * 그리고 main메소드는 인스턴스가 생성되기 이전에 호출된다. 따라서 static 선언하는 것이 옳음을 알 수 있다.
	 * 
	 * 다음의 예제를 보자.
	 * Car클래스와 Boat 클래스를 정의 하였다. 
	 * 다음의 main 메소드가 호출이 되어 실제 실행이 되게 하려고 한다면 어떤 클래스에 두어야 할까?
	 */
	
	public static void main(String[] args) {
		Car c  = new Car();
		c.myCar();
		
		Boat t = new Boat();
		t.myBoat();
	}
}

class Car{
	void myCar() {
		System.out.println("밴츠");
	}
}

class Boat{
	void myBoat() {
		System.out.println("보트");
	}
}

/**
 * main 메소드는 static 메소드이기 때문에, 즉 특정 인스턴스의 맴버로 존재하는 메소드가 아니기 때문에 
 * 정답은 어디든 상관은 없다. (물론 실행방식에선 차이가 발생한다. Car클래스에 두었으면 java Car 를 호출, Boat면 java Boat 호출)
 * 
 * 그렇다면 Car클래스에 두었다고 가정해보자.
 * main 메소드를 Car 클래스 내에 위치시켰는데 그 안에서 Car 인스턴스를 생성하고 있다. 
 * 혹시 이부분이 조금 난해하게 느껴지는가? 그렇다면 다음과 같이 생각하자.
 * - Car클래스와 static으로 선언된 main메소드는 사실상 별개다.
 * - 다만 Car 클래스가 main 메소드에게 공간을 제공했을 뿐이다. 
 * 
 * 물론 Boat클래스에서도 위와 동일하다.
 * 
 * 사실 위의 상황에서 main 메소드를 담기 위한 별도의 클래스를 정의하는 것이 일반적이다.
 * 
 * 그리고 예제작성을 위하여 클래스이름이 'Sysout그리고main메소드' 인데 57번째 줄을 보면 
 * main 메서드가  'Sysout그리고main메소드' 클래스에 있다는 것을 알 수 있다. 
 * 
 */


