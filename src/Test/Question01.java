package Test;

/**
 *@문제_1
 */
public class Question01 {
	

	//데이터 (맴버변수)
	private double radius; //반지름 : 소숫점을 포함할 수 있으니 double 타입으로 선언
	

	//객체 생성시 반지름을 받는 생성자
	public Question01(double radius) {
		this.radius = radius; //데이터 radius에 매개변수로 받은 값을 할당
	}
	
	
	//원의 넓이를 구하는 메소드
	public double getRadius(){
		return radius * radius * 3.14; //원의 넓이 구하는 공식 반지름 * 반지름 * 원주율(3.14)
	}
	
	
	/**
	 *@문제_2
	 */
	public static void main(String[] args) {
		
		//참조변수 question 선언 및 반지름 5인 Question02 객체 참조
		Question01 question = new Question01(5);
		
		//원의 넓이를 반환하는 메소드자체를 출력하거나
		System.out.println(question.getRadius()); //78.5
		
		//변수에 담아서 출력할 수 있음. 두 방법 모두 결과는 동일
		double radius = question.getRadius();
		System.out.println(radius);
	}

}
