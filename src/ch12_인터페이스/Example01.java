package ch12_인터페이스;

interface Monster{
	
	public void name();//이름
	
	public void characteristic();//특성
}

interface BossMonster extends Monster{
	
	void BossSkill();
	
	void BossItem();
}

class Minotaur implements BossMonster{

	@Override
	public void name() {
		System.out.println("미노타우르스");
	}

	@Override
	public void characteristic() {
		System.out.println("소 머리에 인간의 몸을 한 거대한 몬스터");
	}

	@Override
	public void BossSkill() {
		System.out.println("보스 몬스터 한정 기술");
	}

	@Override
	public void BossItem() {
		System.out.println("보스 몬스터 한정 아이템");
	}
	
}



class Slime implements Monster{

	@Override
	public void name() {
		System.out.println("슬라임");
	}

	@Override
	public void characteristic() {
		System.out.println("몸이 액체로 되어있음");
		
	}

	
}

class Skeleton implements Monster{

	@Override
	public void name() {
		System.out.println("스켈레톤");
	}

	@Override
	public void characteristic() {
		System.out.println("뼈만 앙상한 언데드 몬스터");
	}

}

public class Example01 {
	
	public static void main(String[] args) {
		Monster slime = new Slime();
		slime.name();
		slime.characteristic();
		
		System.out.println();
		
		Monster skeleton = new Skeleton();
		skeleton.name();
		skeleton.characteristic();
	}
}
