package ch12_인터페이스;

//인터페이스간 상속이 필요함을 보여주는 예제
interface Printable02 {
	void print(String doc);
}

class APrinter02 implements Printable02{

	@Override
	public void print(String doc) {
		System.out.println("A 사 프린터");
		System.out.println(doc);
	}
}

class BPrinter02 implements Printable02{

	@Override
	public void print(String doc) {
		System.out.println("B 사 프린터");
		System.out.println(doc);
	}
}

public class PrinterDriver02{
	
	public static void main(String[] args) {
		String myDoc = "프린터 양식";
		
		//A 사 프린터로 출력
		Printable02 aPrint = new APrinter02();
		
		//B 사 프린터로 출력
		Printable02 bPrint = new BPrinter02();
		
		aPrint.print(myDoc);
		
		System.out.println();//공백을 위함
		
		bPrint.print(myDoc);
	}
}
