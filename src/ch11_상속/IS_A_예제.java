package ch11_상속;

/**
 * @IS_A_관계_예제
 * 스마트폰은 모바일폰이 갖는 기능을 모두 갖는다. 
 * 그리고 실제로 스마트폰은 모바일폰의 일종이다.
 * 따라서 모바일폰은 상위 클래스로, 스마트폰은 이를 상속하는 하위 클래스로 설계하는 것은
 * 이치에 맞는 일이다.
 */

//상위클래스 모바일폰
class MobilePhone{
	protected String number;// 전화번호
	
	public MobilePhone(String number) {
		this.number  = number;
	}
	
	public void answers() {
		System.out.println("Hi ~ from " + number);
	}
}

//모바일폰을 상속받는 하위클래스 스마트폰
class SmartPhone extends MobilePhone{
	
	private String androidVer;// 안드로이드 운영체제 네임(버전)

	public SmartPhone(String number, String ver) {
		super(number);
		this.androidVer = ver;
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class IS_A_예제 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		
		phone.answers();
		phone.playApp();
	}
}
