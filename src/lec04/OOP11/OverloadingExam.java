package lec04.OOP11;

public class OverloadingExam { // 같은 메서드의 이름이지만 매개 변수 타입은 각각 다른것을 받아서 처리하는 메서드를 만들 수 있다

    public int calculate() {
        return 1 + 2;
    }

    public int calculate(int one, int two) {
        return one + two;
    }

    public long calculate(long one, long two) {
        return one + two;
    }

    public long calculate(int one, long two) {
        return one + two;
    }

    public long calculate(long one, int two) {
        return one + two;
    }


}
