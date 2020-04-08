package ch05_클래스와인스턴스;

/**
 @클래스의 정의
지금까지 작성된 프로그램의 코드를 관찰해보면 종류에 상관없이 
모든 프로그램은 다음 두가지로 이뤄진다는 사실을 알 수 있다.
 
- 데이터 : 프로그램상에서 유지하고 관리해야 할 데이터
- 기능 : 데이터를 처리하고 조작하는 기능
 
이중에서 데이터는 '변수의 선언' 을 통해 유지 및 관리가 되고, 또 변수에 저장된 데이터는 '메소드의 호출'을
통해 처리가 된다. 이와 관련해서 BankAccountPO.java 의 예제를 살펴보자
 */

public class BankAccountPO {
    
    static int balance = 0; // 예금 잔액

    public static void main(String[] args){
        deposit(10000); //입금 진행
        checkMyBalance();
        withdraw(3000);
        checkMyBalance();
    }

    public static int deposit(int amount){//입금을 담당하는 메소드
        balance += amount;
        return balance;
    }

    public static int withdraw(int amount){//출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }

    public static void checkMyBalance(){//예금 조회를 담당하는 메소드
        System.out.println("잔액: " +balance);
    }
}

/**
 위의 클래스 BankAcountPO 를 보면
 맴버변수 balance 와 메소드 deposit, withdraw, checkMyBalance 는 긴밀히 연관되어 있다.

 긴밀히 연관되어있다는 것은 다음 내용을 뜻한다.

 메소드 deposit, withdraw, checkMyBalance는 맴버변수 balance를 위한 메소드이다.

 이렇듯 연관 잇는 변수와 메소드를 묶기 위해 '클래스'라는 것이 존재한다. 클래스를 이용하면
 다음과 같이 변수 balance 그리고 이와 연관 있는 모든 메소드를 하나로 묶을 수 있다.

 위의 코드를 가르켜 '클래스 정의'라 한다. 즉 이는 BankAccount 클래스의 정의이다. 
 */