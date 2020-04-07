package ch03_제어문;

public class Switch문 {
	
	/**
	 * @switch문이란
	 * 
	 * 조건에 따라 실행할 문장을 구분한다는 측면에서 if문과 유사하다.
	 * else if가 많이 들어가는 상황에서는 switch문이 더 좋은 선택이 될 수 있다. 
	 * 
	 * 밑의 예제를 보자
	 */
	
	public static void main(String[] args) {
		
		int num1 = 10;
		String animal = "고양이";
		
		switch(animal) {
		case "강아지":
			System.out.println("강아지가 맞습니다");
		case "고양이":
			System.out.println("고양이가 맞습니다.");
		case "고라니":
			System.out.println("고라니가 맞습니다.");
		default :
			System.out.println("해당하는 동물이 없습니다.");
		}
		
		/**
		 * @레이블(Label)
		 * 위의 switch 내부에 존재하는 키워드 case와 default를 가리켜 레이블이라고 한다.
		 * 레이블 case와 default는 코드상에서 위치를 표시하기 위해 사용된다. 
		 * 
		 * @case는 
		 * switch 의 조건과 같은 타입을 가져야하고 같은 결과 값일 경우 그 case 이후의 값들이 출력이된다. 
		 * 이것은 이후에 나오는 break문으로 제어할 수 있다.
		 * 
		 * @default는
		 * case에서 switch와 같은 조건의 값이 없다면 실행되는 구문이다.
		 * 
		 * 그리고 case와 default를 보면 들여쓰기가 되어있지 않다. 
		 * 이는 책에 위치를 표시하는 레이블과 그 성격이 같다. 그리고 레이블은 책을 펼치기 전에 보여야 한다. 이와 마찬가지로
		 * case와 default도 조금이라도 잘 보이도록 들여쓰기 대상에서 제외하는 것이 일반적이다.
		 * 
		 * 일단 위의 결과를 보게되면 switch의 참거짓을 판단하는 매개변수로 animal이라는 변수를 주었다.
		 * 이 변수에 할당된 값은 '고양이' 이다. 당연히 콘솔에 고양이가 맞습니다. 라고 찍힐 것이라고 예상할 수 있지만
		 * 결과는 고양이가 맞습니다. 이후에 나오는 모든 조건의 결과
		 * 고양이가 맞습니다.
		 * 고라니가 맞습니다.
		 * 해당하는 동물이 없습니다.
		 * 가 찍힌다.
		 * 
		 * 이는 break 라는 키워드로 case의 실행구문이 끝난 이후 사용해 주어야 하위 case들이 실행 되는 것을 
		 * 막을 수 있다.
		 * 
		 * 밑의 예제를 보자
		 */
		
		switch(animal) {
		case "고양이":
			System.out.println("고양이가 맞습니다.");
			break;
		case "강아지":
			System.out.println("강아지가 맞습니다.");
			break;
		case "고라니":
			System.out.println("고라니가 맞습니다.");
			break;
		default :
			System.out.println("해당하는 동물이 없습니다.");
		}
		
		/**
		 * 위의 switch문과는 다르게 각 case가 끝나는 부분에 break가 추가 되었다.
		 * 그리고 결과로는 고양이가 맞습니다. 이후의 출력은 사라졌다. 
		 * 즉 if, else처럼 해당하는 조건에 맞는 결과값만이 출력이 되는 것을 확인 할 수 있다.
		 * 이는 switch문의 일반적인 사용 모델이다.
		 */
		
		/**
		 * @스위치문_활용문제
		 * 
		 * 밑의 if문을 switch문으로 바꿔서 작성하기
		 */
		int n = 20;
		
		if(n >= 0 && n<10) {
			System.out.println("0이상 10미만의 수");
		}else if(n >= 10 && n <20) {
			System.out.println("10이상 20미만의 수");
		}else if(n >= 20 && n <30) {
			System.out.println("20이상 30미만의 수");
		}else {
			System.out.println("음수 혹은 30 이상의 수");
		}
		
		
		/**
		 * 풀이
		 * 생각보다 난이도가 있는 문제였다.
		 * switch문에서 case에 if문의 내부의 조건을 작성할 수 있는 게 아니라서
		 * if문처럼 생각하면 안되는 문제이다.
		 * 
		 * 일단 매개변수의 값이 어떻던 , 그값을 10으로 나누게 된다. 
		 * 앞의 (int)는 상황에따라 소숫점까지 나오게되는데 그렇게되면 0, 1, 2에 해당하는 값과 매칭이 안되어
		 * default 구문으로 넘어가게 될 것이다. 그것을 방지하기 위해 정수형으로 바꾸어 소숫점은 생략한다.
		 * 
		 * 예를 들어 n의 값이 25라고 한다면 25/10은 2.5가 된다. 그렇다면 명시적 형변환으로 뒤의 소숫점을 제거한
		 * 2가 되는데, case문의 2번재와 동일하기때문에 20이상 30미만의 수가 찍히게 된다.
		 */
		switch((int)n/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2: 
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30 이상의 수");
		}
		
		
		
	}

}
