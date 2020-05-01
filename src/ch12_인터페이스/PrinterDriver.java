package ch12_인터페이스;

interface Printable {
	public void print(String doc);
}

class APrinter implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("A 사 프린터");
		System.out.println(doc);
	}
}

class BPrinter implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("B 사 프린터");
		System.out.println(doc);
	}
}

public class PrinterDriver{
	
	public static void main(String[] args) {
		String myDoc = "프린터 양식";
		
		//A 사 프린터로 출력
		Printable aPrint = new APrinter();
		
		//B 사 프린터로 출력
		Printable bPrint = new BPrinter();
		
		aPrint.print(myDoc);
		
		System.out.println();//공백을 위함
		
		bPrint.print(myDoc);
	}
}
