package lec04.OOP04;

public class MethodCallTest {

    public static void main(String[] args) {

        int sumRtn = sumLogic(1, 2);
        System.out.println("sumRtn : " + sumRtn);

        AnotherClassUseInMethodCallTest.sayHello();  // 정적 메소드 호출 방식

        AnotherClassUseInMethodCallTest anotherClassUseInMethodCallTest = new AnotherClassUseInMethodCallTest();
        anotherClassUseInMethodCallTest.sayRoger();

    }

    public static int sumLogic(int one, int two){
        int sum = one + two;
        return sum;
    }

}
