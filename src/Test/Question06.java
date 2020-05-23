package Test;

/**
 *@문제_6
 *숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합(sum)을 더한 결과를 출력하는 코드를 완성하시오.
 *예를 들어 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15가 출력되어야 한다.
 */
public class Question06 {
	public static void main(String[] args) {
		
		/**
		 * @방법_1
		 * Integer.valueOf 활용
		 */
		
		//문자열 변수 str
		String str = "12345";
		
		//문자열 배열
		String[] arr = {};
		
		//더한 값을 담을 변수 sum
		int sum = 0;
		
		//str의 길이만큼 반복 : 0~5
		for(int i = 0; i< str.length(); i++) {
			
			//split은 문자열을  "," /  "빈칸"의 기준의로 나눈다. 쌍따움표를 붙여쓸시 0,1,2,3,4 로 나눔. 자세한설명은 구글에서
			//그리고 배열 arr에 담는다.
			arr = str.split("");
			
			//Integer.valueOf는 매개변수로 문자열을 받아 정수형으로 반환한다. 
			//동시에 정수형으로 바뀐 값을 sum에 더함
			sum += Integer.valueOf(arr[i]);
		}
		//결과 출력
		System.out.println(sum);
		
		//------------------------------------------------------------------------------
		//사실 위의 방법은 아래와 같이 줄여쓸 수 있다. 
		//담는 배열도 필요 없음
		sum = 0;
		for(int i =0; i<str.length(); i++) {
			sum += Integer.valueOf(str.split("")[i]);
		}
		System.out.println(sum);
		
		
		/**
		 *@방법_2
		 *charAt 활용
		 */
		sum = 0;
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			sum += (int)str.charAt(i)-48;
		}
		System.out.println(sum);
	}
}
