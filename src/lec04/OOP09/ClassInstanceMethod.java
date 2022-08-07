package lec04.OOP09;

public class ClassInstanceMethod {

    static int staticSum(int paramOne, int paramTwo){ // 정적 메서드는 객체 생성 없이 바로 사용 가능
        return paramOne + paramTwo;
    }

    static int staticAverage(int paramOne, int paramTwo){
        return (paramOne + paramTwo) / 2;
    }

    int entitySum(int paramOne, int paramTwo){
        return paramOne + paramTwo;
    }

    int entityAverage(int paramOne, int paramTwo){
        return (paramOne + paramTwo) / 2;
    }

}
