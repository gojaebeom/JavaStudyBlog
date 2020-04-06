package ch01_변수와자료형;

public class 기본자료형_논리 {
	
	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int num1 = 10;
		int num2 = 20; 
		
		System.out.println(num1 < num2);
		System.out.println(num1 < num2 && b1); 
		System.out.println(num1 < num2 && b2);
	}

}
