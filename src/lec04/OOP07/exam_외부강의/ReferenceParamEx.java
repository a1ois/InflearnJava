package lec04.OOP07.exam_외부강의;

// Call by Reference
public class ReferenceParamEx {

    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        // 주소를 넘겨줌
        change(d);
        // heap 메모리의 d 값이 변경되었고, 주소는 그대로인 상태
        System.out.println("Arter change(d) : x = " + d.x);

    }

    public static void change(Data d){ // 주소값 d 의 데이터 타입은 Data 임
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
        // heap 메모리의 d 값을 변경한 후 스택에서 사라짐
    }

}
