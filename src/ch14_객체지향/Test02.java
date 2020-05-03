package ch14_객체지향;

public class Test02 {
	
	public static void main(String[] args) {
		
		Phone myPhone = new Phone(11222, "코비폰");
		
		SmartPhone yourPhone = new SmartPhone(123456, "스마트폰", true);
		yourPhone.webSearch();
		
	}

}

class Phone{
	
	private int pId;
	private String pName;
	
	public Phone(int pId, String pName) {
		this.pId = pId;
		this.pName = pName;
	}
	
	public void call(){
	    //전화
	}

	  public void messege(){
	    //메세지
	}
}

class SmartPhone extends Phone{
	
	private boolean wi_fi;

	public SmartPhone(int pId, String pName, boolean wi_fi) {
		super(pId, pName);
		
		this.wi_fi = wi_fi;	
	}
	
	public void webSearch() {
		System.out.println("웹 검색");
	}
	
	public void clickWiFi() {
		System.out.println("와이파이를 끄거나 키기");
	}
	
}
