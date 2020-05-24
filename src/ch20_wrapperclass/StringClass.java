package wrapperclass;

public class StringClass {
	public static void main(String[] args) {
		String str1 = new String("hello");//인스턴스로 생성
		String str2 = new String("hello");
		System.out.println(str1 == str2);
		
		String str3 = "world";//상수풀에 있는 문자열을 가리킴
		String str4 = "world";
		System.out.println(str3 == str4);
		
		String str5 = "hello";
		String str6 = "world";
		System.out.println(System.identityHashCode(str5));
		//스트링은 immutable(불변)
		//한번 선언된 문자열은 변경할 수 없다.
		
		//스트링 클래스의 concat() 메소드 혹은 + 를 이용하여 String을 연결하는 경우
		//문자열은 새로 생성됨
		
		str5 = str5.concat(str6);
		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));
		
		StringBuffer buff = new StringBuffer("hello");
		buff.append(" world");
		System.out.println(buff);
		
		//StringBuffer는 멀티 쓰레드프로그래밍에서 동기화가 보장
		//단일 쓰레드 프로그래밍에서는 StringBuilder를 사용하는것이 더 좋음
	}
}
