package ch05_클래스와인스턴스;

/**
 @클래스의 구성과 인스턴스화
 이전 BankAccountPO 에서 다루었던 예제와 비슷해보이지만 살짝 다르다.
 이것은 이전엔 사용했던 static의 유무인데, static은 나중에 다루도록하자.
 
 상단에 선언된 변수 balance는 '인스턴트 변수' 라고 한다. 
 (또는 멤버변수, 필드 라고 불리기도 한다.)

 인스턴트 변수 balance를 위해 존재하는 하위 메소드들은 '인스턴트 메소드'라고 한다.

 인스턴트 변수는 앞서 변수의 스코프에서 다루었던 지역변수가 아니다.
 인스턴트 변수가 선언된 위치는 메소드 내부가 아니므로 이 둘은 성격이 다르다.
 이러한 인스턴스 변수의 중요한 특징 중 하나는 다음과 같다.

 - 인스턴스 변수는 같은 클래스 내에 위치한 메소드 내에서 접근이 가능하다.
 */
public class 인스턴스만들기 {
    
    public static void main(String[] args){

        new BankAccountPO02();
        /**
         * @인스턴스
         * 위의 문장을 실행하면 밑에 만들어둔 BankEx 에 정의된 변수와 메소드를 담고 있는 '인스턴스'라는 것이 
         * 만들어진다. 만들어져서 실제 메모리 공간에 존재하게 된다.
         * (인스턴스는 다른말로 객체라고도 한다. 인스턴스의 생성과 객체의 생성은 그 의미가 완전히 동일하다.)
         * 
         * 물론 다음과 같이 둘, 혹은 그 이상도 만들 수 있다.
         */
        new BankAccountPO02();
        new BankAccountPO02();

        /**
         * 이렇게 메모리상에 인스턴스를 만들기만 해서는 사용할 수가 없다. 
         * 만들어진 인스턴스를 참조할 수 있는 무언가가 필요하다. 
         * 그리고 이 무엇인가를 가리켜 '참조변수(Reference Variable)'이라고 한다.
         */
        BankAccountPO02 june; //참조변수 myAcnt1의 선언
        BankAccountPO02 james; //참조변수 myAcnt2의 선언
        
        /**
         * 즉 다음과 같이 참조변수를 선언하고 이를 통해서 새로 생성되는 인스턴스(객체)를 가리키세 할 수 있다.
         */

        june = new BankAccountPO02();//참조변수 june 이 새로 생성되는 인스턴스를 가리킴
        james = new BankAccountPO02();//참조변수 james 가 새로 생성되는 인스턴스를 가리킴

         /**
          * @new
          * 키워드 new 를 통해서 인스턴스를 생성하면 생성된 인스턴스의 주솟값이 반환된다.
            즉 참조변수에는 생성된 인스턴스의 주솟값이 저장되는 셈이다. 
            하지만 다음과 같이 표현하고 인식하자. 이것보다 일반적인 표현이다.
            (주솟값은 참조변수에 저장된 값이기에 본서에서는 이 값을 '참조 값' 이라고 한다.)

            - 참조변수는 인스턴스를 참조한다.
            - 참조변수는 인스턴스를 가리킨다.

            그리고 참조변수를 통해서 해당 인스턴스의 메소드를 호출하는것은 다음과 같다.
          */

          //각 인스턴스를 대상으로 예금을 진행
          june.deposit(10000);
          james.deposit(5000);

          //각 인스턴스를 대상으로 잔액을 조회
          System.out.println("myAcnt1의 잔액 :");
          june.checkMyBalance();

          System.out.println("myAcnt2의 잔액 :");
          james.checkMyBalance();

          /**
           * 코드와 실행 결과를 보면, 참조변수 준과 제임스가 가리키는 인스턴스가 
           * 서로 다른 인스턴스인 것을 알 수 있다.
           */

           /**
            * @참조변수에 null 대입
              때로는 참조변소가 참조하는 인스턴스와의 관계를 끊고 아무런 인스턴스도 참조하지 않도록
              할 필요가 있다. 그리고 이때에는 다음과 같이 참조변수에 null을 대입하면 된다.
            */

            james = null;
            june = null;
    }
}

class BankAccountPO02{

    int balance = 0;

    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public void checkMyBalance(){
        System.out.println("잔액: " +balance);
    }
}