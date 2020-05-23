package Test;

import java.util.Scanner;

/**
 * @문제_7
 * for문을 이용하여 입력받은 단의 구구단을 출력하는 프로그램을 작성하시오.
 */
public class Question07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~9 사이의 숫자를 입력해주세요");
		int num = sc.nextInt();
		
		System.out.println(num+"단을 출력합니다.");
		for(int i = 1; i<=9; i++) {
			System.out.println(num+"X"+i+" : " + (num * i));
		}
	}
}
