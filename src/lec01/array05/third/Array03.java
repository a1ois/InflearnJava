package lec01.array05.third;

import java.util.Arrays;

public class Array03 {

    public static void main(String[] args) {

        String[] strArr = new String[3];
        strArr[0] = "정부";
        strArr[1] = "종합";
        strArr[2] = "청사";

        System.out.println(Arrays.toString(strArr));

        String[] strArr1 = new String[] {"Hello", "World"};
        System.out.println(Arrays.toString(strArr1));

    }

}
