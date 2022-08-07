package lec04.OOP06_동적파라미터;

import java.util.Arrays;

public class DynamicArray { // 동적 메서드는 가장 마지막에 위치해야하며, 두 개 이상 사용할 수 없다.

    public void dynamicMethod(String... msgParameter){ // String...
        String[] strArray = msgParameter;
        System.out.println(Arrays.toString(strArray));
    }

}
