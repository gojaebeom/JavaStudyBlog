package ch15_polymorphism;

import java.util.Scanner;

abstract class LolChampions{
	
	public abstract void champName();
	
	public abstract void qSkill();
	
	public abstract void wSkill();
	
	public abstract void eSkill();
	
	public abstract void rSkill();
	
	public final void champInfo() {
		System.out.println("챔피언 정보");
		champName();
		qSkill();
		wSkill();
		eSkill();
		rSkill();
	}
}

class Heimerdinger extends LolChampions{

	@Override
	public void champName() {
		System.out.println("하이머딩거");
	}
	@Override
	public void qSkill() {
		System.out.println("Q스킬 : H-28G 진화형 포탑");
	}
	@Override
	public void wSkill() {
		System.out.println("W스킬 : 마법공학 초소형 로켓");
	}
	@Override
	public void eSkill() {
		System.out.println("E스킬 : CH-2 전자폭풍 수류탄");
	}
	@Override
	public void rSkill() {
		System.out.println("궁극기 : 업그레이드!!!");
	}
}

class Lux extends LolChampions{

	@Override
	public void champName() {
		System.out.println("럭스");
	}
	@Override
	public void qSkill() {
		System.out.println("Q스킬 : 빛의 속박");
	}
	@Override
	public void wSkill() {
		System.out.println("W스킬 : 프리즘 보호막");
	}
	@Override
	public void eSkill() {
		System.out.println("E스킬 : 광휘의 특이점");
	}
	@Override
	public void rSkill() {
		System.out.println("궁극기 : 최후의 섬광");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		LolChampions lolChamp = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("챔피언을 고르시오.");
		System.out.println("1. 하이머딩거 / 2. 럭스");
		
		switch(sc.nextInt()) {
		case 1:
			lolChamp = new Heimerdinger();
			break;
		case 2:
			lolChamp = new Lux();
			break;
		default:
			System.out.println("잘못된 입력입니다!");
		}
		
		if(lolChamp != null) {
			lolChamp.champInfo();
		}
	}
}
