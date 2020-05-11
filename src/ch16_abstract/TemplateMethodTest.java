package ch16_abstract;

abstract class Subject{
	public abstract void addSubject();// 수강신청
	
	public abstract void showSubjectInfo();// 수강 정보 조회
	
	public void courseOrder() { 
		addSubject();
		showSubjectInfo();
	}
}

public class TemplateMethodTest {

}
