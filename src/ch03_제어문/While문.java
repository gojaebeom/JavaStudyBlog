package ch03_제어문;

public class While문 {

	public static void main(String[] args) {
		
		int num = 0;
		
		/**
		 * @While문
		 */
		while(num < 5) {
			System.out.println("I Like Java");
			num++;
		}
		
		/**
		 * 위의 결과는 I Like Java가 5번 출력되는 것을 알 수 있다.
		 * - while문의 소괄호에는 반복의 조건을 명시한다. 
		 * - true 또는 false가 와야 하므로 이를 반환하는 연산이 오게 된다. 
		 * - 그리고 그 조건이 true를 반환하는 동안에는 횟수에 상관없이 while문의 중괄호가 반복 실행되는데 , 
		 *  다음의 패턴으로 반복이 된다.
		 *   1. 먼저 조건검사
		 *   2. 그리고 결과가 true이면 중괄호 영역 실행
		 *   
		 *   반면에 밑에 예제에서 다루는 do ~ while문은 다음의 패턴으로 진행한다.
		 *   
		 *   1. 먼저 중괄호 영역 실행
		 *   2. 그리고 조건 검사 후 결과가 true이면 반복 결정
		 *   
		 *   밑의 예제를 확인해 보자.
		 */
		
		int num2 = 0;
		
		/**
		 * @do_while문
		 */
		do {
			System.out.println("I Like Java " + num2);
			num2++;
		}while(num2 < 5);
		
		/**
		 * 위 예제는 이전의 while문을 do~while로 바꾼것 뿐이다. 따라서 실행결과는 동일하다.
		 * 보는것처럼 while문으로 작성된 문장은 do~while로도 작성가능한 경우가 대부분다. 
		 * 따라서
		 * 	"조건에 따른 반복이 필요하다. 그런데 반드시 한 번은 실행을 해야 한다." 
		 * 라는 경우에는 do~while문을 사용하는 것이 괜찮다.
		 * 
		 * 이 이외의 경우에는 while문 또는 이어서 소개하는 for문을 사용하는 것이 바람직하다. 그래야 선택하는 
		 * 반복문에 더 많은 의미를 부여할 수 있다. 
		 * for 문은 따로 다른 클래스를 만들어서 예제를 다루어보자.
		 * 
		 */
		
		/**
		 * @While문과_Do_While문의_활용문제
		 * 
		 * - 문제1 : 1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 이용해서 작성해보자.
		 */
		System.out.println("---------------------경계선------------------------");
		int result = 0; // 1~100까지 더한 값이 저장되는 변수
		int updateNum = 1;// while문의 증가를 위한 변수
		
		while(updateNum<100) {//updateNum이 100보다 작거나 같을때까지 참이기 때문에 반복을하게 된다.
			
			result += updateNum;//값을 저장하는 변수 result에 증가되는 변수 updateNum을 더해준다.
			// 위의 문법은 result = result + updateNum 으로 바꾸어 쓸 수 있다.
			
			updateNum++;//updateNum을 while문이 끝나기 전에 1씩 증가시켜준다. 
		}
		System.out.println("문제 1 정답 : "+result);
		
		/**
		 * - 문제2 : 1부터 100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자.
		 *   가급적 while문과 do~while무능ㄹ 한번씩 사용해서 구현하기.
		 */
		System.out.println("---------------------경계선------------------------");
		updateNum = 1;//100까지 증가되어있는 updateNum을 1로 초기화.
		
		while(updateNum<=100) {//updateNum이 100과 작거나 클때까지 참이기때문에 while문을 반복시킨다.
			System.out.println(updateNum);//1씩 증가하는 updateNum을 출력 총 1부터 100까지 출력이 될 것 이다.
			
			if(updateNum==100) {
				//updateNum이 100과 같을때 break를 걸어 그대로 while문을 빠저나온다.
				//while문의 조건을 보면 updateNum이 100과 작거나 같을때까지 반복이라고 한다.
				//즉 100이된 이후에 updateNum(100)을 출력하고 while문이 끝나기 이전에 updateNum++로 밑에서 updateNum을 다시 1증가시켜
				//101이 된 이후에 빠저나가게 된다.
				//예제는 1~100까지 찍고 , 다시 거꾸로 100~1까지 찍는 것 이므로
				//updateNum이 100이 되었을 때 빠저 나가게 만드는 것 이다.
				break;
			}
			
			updateNum++;
		}do {
			System.out.println(updateNum);//updateNum을 출력한다. 처음 이 구문을 실행시킬 때는 100일 것 이다.
			updateNum--;// 그리고 updateNum을 감소시킨다. 
			//위의 문장이 끝난 이후에 updateNum은 감소가 된다.
		}while(updateNum>0);//updateNum이 0보다 크기때문에 0보다 작을때까지 참임으로 do의 코드블록을 반복실행하게 된다.
		
		/**
		 * - 문제 3: 100이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 
		 * 그 수들의 합을 구해서 출력하는 프로그램을 while문을 이용해서 작성해보자
		 */
		
		System.out.println("---------------------경계선------------------------");
		updateNum = 1; //updateNum을 1로 초기화
		int sum = 0;// 배수들의 합을 저장할 변수 
		
		while(updateNum<=100) {//updateNum이 100보다 작거나 같을때까지 참이기 때문에 반복
			
			if(updateNum%2 == 0 && updateNum%7 == 0) {//updateNum이 2의 배수 그리고 7의 배수인 두가지 조건이 모두 참일때 실행
				System.out.println("2와 7의 배수 : "+updateNum);//2와 7의 배수 출력
				sum += updateNum;//변수 sum과 update를 더해 다시 sum에게 저장
			}
			
			updateNum++;
		}
		System.out.println("문제 3의 정답 :" +sum);
		
	}
}
