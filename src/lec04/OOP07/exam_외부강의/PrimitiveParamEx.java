package lec04.OOP07.exam_외부강의;

// C 에서의 Call By Value 를 의미함.
public class PrimitiveParamEx {

    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d.x);
        System.out.println("After change(d.x) : x = " + d.x); // call by value

    }

    public static void change(int x){ // 한 번 실행되고 스택에서 지워짐 -> x 값은 다시 10으로 돌아감 - 인스턴스에 영향 못끼침
        x = 1000;
        System.out.println("change() : x = " + x);
    }


}
