package ch11_상속;

public class Overriding_Exam01 {

	public static void main(String[] args) {
		SmartPhone01 ph1 = new SmartPhone01("010-111-222", "Andro01");
		MobilePhone01 ph2 = new SmartPhone01("010-444-333", "Andro02");
		
		ph1.answers();
		ph1.playApp();
		
		ph2.answers();
		//ph2.playApp();
	}
}

class MobilePhone01{
	protected String number;// 전화번호
	
	public MobilePhone01(String number) {
		this.number  = number;
	}
	
	public void answers() {
		System.out.println("Hi ~ from " + number);
	}
}

//모바일폰을 상속받는 하위클래스 스마트폰
class SmartPhone01 extends MobilePhone01{
	
	private String androidVer;// 안드로이드 운영체제 네임(버전)

	public SmartPhone01(String number, String ver) {
		super(number);
		this.androidVer = ver;
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
