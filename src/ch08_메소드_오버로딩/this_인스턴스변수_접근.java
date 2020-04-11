package ch08_메소드_오버로딩;

public class this_인스턴스변수_접근 {
/**
 * 앞서 키워드 this를 이용한 생성자의 호출에 대해 설명했는데, this는 다른 의미로도 사용이 된다.
 * 이와 관련하여 다음 예제를 보자.
 */
}

class Animal{
	private String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName(){
		
		return this.name;
	}
}

/*
*위와 같이 매개변수의 이름이 인스턴스 변수의 이름과 동일하게 선언된 경우, 선언된 지역 내에서의 
*해당 이름은 매개변수를 의미하게 된다.
*하지만 키워드 this를 이용하면 이 영역 안에서도 인스턴스 변수에 접근할 수 있다.
*
*즉 this.name에서 this가 의미하는 것은 '이 문장이 속한 인스턴스' 이다.
*따라서 this.name은 인스턴스 변수 name을 의미하는 것이 된다. 
*/