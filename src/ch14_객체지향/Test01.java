package ch14_객체지향;

public class Test01 {
	
	public static void main(String[] args) {
		Person jaebeom = new Person();
		
		jaebeom.name = "고재빰";
		System.out.println(jaebeom.name);
		
		jaebeom.weight = -10;
		System.out.println(jaebeom.getWeight());
		
	}
	

}

class Person{
	String name;
	double weight;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setWeight(double weight) {
		if(weight <= 0) {
			System.out.println("사람의 몸무게는 0보다 같거나 작을 수 없습니다. 다시 입력해주세요.");
			return;
		}
		this.weight = weight;
	}
	
	double getWeight() {
		return weight;
	}
}


