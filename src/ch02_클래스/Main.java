package ch02_클래스;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int a,b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a의 수를 입력하시오");
		a= scan.nextInt();
		
		System.out.println("b의 수를 입력하시오");
		b= scan.nextInt();
		
		System.out.println("a+b 의 합은"+(a+b));
		
	}

}
