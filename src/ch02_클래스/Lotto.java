package ch02_클래스;

public class Lotto {
	
	public static void main(String[] args) {
		
		MakeLotto lotto = new MakeLotto();
		lotto.makeLotto();
		
	}

}

class MakeLotto{
	
	public void makeLotto() {
		int[] random = new int[6];
		
		for(int i=0; i< random.length; i++) {
			random[i] = (int)(Math.random()*45)+1;
			
			if(overlap(i,random[i])) {
				
			}
		}
		
	}
	
	public boolean overlap(int i, int num) {
		for(int j=0; j<i; j++) {
			
			System.out.println(num);
		}
		return true;
	}
	
	
}
