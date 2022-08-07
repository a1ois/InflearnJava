package lec04.OOP10;

public class ClassEntityDiff {

    int normalValue = 10;
    static int staticValue = 20;

    int normalValue2 = staticValue; // 노말 변수에 스태틱 변수를 담을 수는 있지만, 스태틱 변수로써 사용할 순 없다.

//    static int staticValue2 = normalValue; 스태틱 전역 변수에 일반적인 전역 변수를 담을 수 없다.

    static void callStaticMethod(){ // 스태틱 메서드
        System.out.println(staticValue);
//        System.out.println(normalValue); 스태틱 메서드 내부에서는 스태틱 변수만 쓸 수 있고 노말 변수는 사용 불가
//        System.out.println(normalValue2);
    }

    void callNormalMethod(){ // 일반적인 메서드에서는 스태틱 전역 변수와 일반 전역 번수 둘 다 호출 가능
        System.out.println(staticValue); // 스태틱 전역 변수는 모든 곳에서 값을 공유한다
        System.out.println(normalValue);
        System.out.println(normalValue2);
    }

    static void sampleStaticMethod(){
        System.out.println("스태틱 메서드");
    }

    void sampleNormalMethod(){
        System.out.println("일반 메서드");
    }

    static void doStaticMethod(){
        sampleStaticMethod(); // 스태틱 메서드 내에서는 스태틱 메서드만 사용 가능, 일반 메서드는 불가
//        sampleNormalMethod();
    }

    void doNormalMethod(){
        sampleStaticMethod();
        sampleNormalMethod();
    }

}
