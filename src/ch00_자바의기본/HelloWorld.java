package ch00_자바의기본;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
	}
	
	/**
	 * 자바는 운영체제에 독립적이라고 한다. 
	 * 이것을 가능하게 하는것으로 자바의 플랫폼역할을 하는 JVM(java virtual machine)이 있다.
	 * 운영체제 -> JVM -> java
	 * 
	 * 지금 내가 만든 자바파일명은 HelloWorld이다.
	 * 이 파일을 javac라는 명령어를 통해 .class 파일로 추출해낸다.
	 * 
	 * .class 확장자 파일은 JVM이 읽을 수 있는 파일이다.
	 * 그리고 추출된 HelloWorld.class 파일을 
	 * java HelloWorld (여기선 확장자명은 생략한다) 로 실행할 수 있게 되는 것이다.
	 * 이클립스, vscode 등의 툴을 이용하면 이 과정을 툴이 알아서 해주기때문에 모르고 넘어갈 수 도 있는 부분이다.
	 * 기초를 잡는다는 생각으로 매모장을 만들어서 해보았다. 
	 * (물론 javac, java 명령어를 사용하기위해선 내 컴퓨터의 환경변수 설정을 해 두어야 한다.)
	 *
	 */

}
