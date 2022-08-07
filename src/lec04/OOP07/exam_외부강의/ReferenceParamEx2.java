package lec04.OOP07.exam_외부강의;

// Call by Reference 2
public class ReferenceParamEx2 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2}; // arr 은 주소를 가지고 있다
        System.out.println(arr[1]);
        arr_change(arr); // 주소를 보내줌
        System.out.println(arr[1]);

    }

    static void arr_change(int[] arr){ // arr 의 근본은 int[] arr
        arr[1] = 10;
        System.out.println(arr[1]);
    }

}
