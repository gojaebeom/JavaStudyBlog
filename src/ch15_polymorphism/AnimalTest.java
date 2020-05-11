package ch15_polymorphism;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Dog extends Animal{
	
	public void move() {
		System.out.println("개가 네발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

//public class AnimalTest {
//
//	public static void main(String[] args) {
//		Animal human = new Human();
//		Animal dog = new Dog();
//		Animal eagle = new Eagle();
//	
//		ArrayList<Animal> animalList = new ArrayList<Animal>();
//		animalList.add(human);
//		animalList.add(dog);
//		animalList.add(eagle);
//		
//		for(Animal animal : animalList) {
//			animal.move();
//		}
//	}
//	
//}

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Dog dog = new Dog();
		Eagle eagle = new Eagle();
		
		human.move();
		dog.move();
		eagle.move();
	}
}
