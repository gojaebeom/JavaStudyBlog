package ch05_클래스와인스턴스;

public class 인스턴스만들기02 {
	/**
	 * @인스턴스를 구분할 수 있는 유일한 정보를 갖게 하자.
	 * 앞서 정의한 BankAccount클래스를 다시 관찰해보자. 은행에서는 고객이 계좌를 개설할 때마다
	 * 이 클래스의 인스턴스를 생성해야 한다.
	 * 
	 * 그런데 문제는 인스턴스를 구분할 수 있는 정보가 빠졌다는 것이다. 즉 이전 예제에 최소한 
	 * 다음 두가지 정도는 추가가 되어야 한다 . 그래야 누구의 계좌인지 구분할 수 있다.
	 * 
	 * - 계좌번호 
	 * - 주민번호
	 * 
	 * 그리고 이것을 반영하여 새로운 클래스를 만들어보자
	 */
	
	public static void main(String[] args) {
		BankAccount jaebeom = new BankAccount();
		
		jaebeom.initAccount("123-456-789", "950621", 10000);
		jaebeom.deposit(5000);
		jaebeom.checkMyBalance();
		
		BankAccount jongwon = new BankAccount();
		
		jongwon.initAccount("321-654-987", "960113", 10000);
		jongwon.withdraw(3000);
		jongwon.checkMyBalance();
	}

}

class BankAccount{
	String accNumber;//계좌번호
	String ssNumber;//주민번호
	int balance = 0;//예금 잔액
	
	//초기화를 위한 메소드
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal; //계좌 개설 시 예금액으로 초기화
	}
	
	public int deposit(int amount) {
		balance +=amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -=amount;
		return balance;
	}
	
	public void checkMyBalance() {
		System.out.println("계좌번호:"+accNumber);
		System.out.println("주민번호:"+ssNumber);
		System.out.println("잔액:"+balance+"\n");
	}
	
	/**
	 * 이번 예제에서는 새로운 메소드 initAccount가 추가되었다.
	 * 이 메소드는 다음과 같은 부분에서 다른 메소드들과 성격상 구분이 된다. 
	 * -인스턴스의 초기화를 위한 메소드이다.
	 * -때문에 인스턴스 생성 시 반드시 한번 호출해서 초기화를 진행해야한다.
	 * 
	 * 그러나 위와 같이 메소드를 정의하지 않고 '생성자(Constructor)'라는 것을 정의해서 인스턴스의 초기화를
	 * 진행할 수도 있다. 생성자는 인스턴스 생성 과정에서 초기화를 위해 자동으로 호출되는 일종의 메소드이다.
	 * 생성자는 다음 예제에서 다루겠다. 
	 */
}
