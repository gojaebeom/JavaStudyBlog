package ch08_메소드_오버로딩;

public class this를_이용한_생성자호출 {
	
	/**
	 *밑의 예제를 보면 this 키워드를 이용하여 다른 생성자를 호출하고있다. 
	 *정수를 하나 받는 인스턴트를 새로 호출하자. 
	 * 생성자2, 생성자3 이 콘솔에 출력된다. 
	 *
	 *생성자 3이 사용이 되었는데 
	 *생성자 3에서는 this(3, 4) 라는 키워드가 먼저 작성되어있다.
	 *여기서 this는 오버로딩된 다른 생성자를 의미한다.
	 *거기에 정수를 두개 받는 생성자를 찾기때문에 생성자 2가 먼저 호출이 되고 
	 *그다음 출력문을 만나 생성자 3이 콘솔에 찍히게 된다.
	 *
	 */
	
	public static void main(String[] args) {
		
		new Person02(0);
	}
	
}

class Person02{
	
	Person02(){
		System.out.println("생성자 1");
	}
	
	Person02(int num1, int num2){
		System.out.println("생성자 2");
	}
	
	Person02(int num){
		this(3, 4);
		System.out.println("생성자 3");
	}
	
	
}
