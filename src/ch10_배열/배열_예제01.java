package ch10_배열;

class Box{
	
	/**
	 * 인스턴스를 저장하고 참조하는 배열 생성예제
	 */
	
	private String conts;
	
	Box(String conts){
		this.conts = conts;
	}
	
	public String toString() {
		return conts;
	}
}

public class 배열_예제01 {
	
	public static void main(String[] args) {
		
		//객체형 배열
		Box[] arr = new Box[3]; 
		
		//배열에 인스턴스 저장
		arr[0] = new Box("First");
		arr[1] = new Box("Second");
		arr[2] = new Box("Third");
		
		//저장이 된 인스턴스 참조
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		/**
		 * 위의 결과를 출력했을 때 각 값은 어떻게 출력이 될까?
		 * 예제대로 따라 치면 First, Second, Third가 출력이된다.
		 * 
		 * 하지만 예제에선 toString이라는 메소드를 정의해놓고 사용하지 않았다.
		 * 그래서 따로 개인적으로 
		 */
		
		System.out.println(arr[0].toString());
		
		/**
		 * 으로 출력해보았는데 결과적으로는 동일하다.
		 * 이번엔 Box클래스에 있는 toString이라는 메소드를 지우고 출력을 해보았다.
		 * 
		 * 출력값이 상당히 달라졌다.
		 * 
		 * ch10_배열.Box@79698539
		 * ch10_배열.Box@73f792cf
		 * ch10_배열.Box@2ed94a8b
		 * 
		 * Box클래스의 주소값이 출력된것 같다.
		 * 
		 * 그렇다면 드는 의문이 Box클래스의 toString 메소드는 따로 사용되지 않았는데
		 * 정의 해논것 만으로 생성자에서 받아온 문자열 값이 반환이되는가 이다.
		 * 
		 * 책에서 따로 언급이 없기 때문에 조금 찜찜하지만 일단은 넘어가도록 하겠다. 
		 * 
		 * 
		 *  *구글링했으면 바로 알아볼 수 있었던 것을.. 
		 *  찾아본 결과 toString 메소드는 Object 클래스에 있는 것인데 
		 *  자식클래스에서 이것을 재정의(오버라이딩)하면
		 	toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출하면
        	자동으로 toString이 호출되도록 약속되어 있다.*
		 */
		
	}
}
