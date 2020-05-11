package ch10_배열;

import java.util.ArrayList;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		studentLee.addSubject("수학", 80);
		studentLee.addSubject("영어", 70);
		studentLee.showStudentInfo();
		
		System.out.println("-----------------------------------------");
		
		Student studentGo = new Student("Go");
		studentGo.addSubject("수학", 50);
		studentGo.addSubject("영어", 90);
		studentGo.addSubject("과학", 90);
		studentGo.showStudentInfo();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		
		for(String str : list) {
			System.out.println(str);
		}
	}
}

class Student{
	
	private static int serialNum = 0;
	private int id;//학생 번호
	private String name;//학생 이름
	
	private ArrayList<Subject> subjectList;
	
	public Student(String name) {
		this.name = name;
		this.id = ++serialNum;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();

		subject.setName(name);
		subject.setScore(score);
	
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		System.out.println("학생 번호: "+ id);
		System.out.println("학생 이름: "+ name);

		if(subjectList.size() == 0) {
			System.out.println("수강중인 과목이 없습니다.");
		}else {
			int total = 0;
			for(Subject subject : subjectList) {
				total += subject.getScore();
			
				System.out.println("수강 과목 "+subject.getName() + ": "+ subject.getScore());
			}
			System.out.println("과목 총합점수는 " + total +" 이고 평균은 " + total/subjectList.size() + " 입니다." );
		}
	}
	
	
}

class Subject{
	
	private String name; //과목 이름
	private int score;//과목 점수
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
