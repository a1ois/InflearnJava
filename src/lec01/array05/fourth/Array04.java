package lec01.array05.fourth;

import java.util.Arrays;

public class Array04 {

    public static void main(String[] args) {

        int[] arr1 = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(arr1));

        arr1[0] = arr1[1] + arr1[2];
        System.out.println("arr1[0] : " + arr1[0]);

        int intVar1 = arr1[1];
        int intVar2 = arr1[2];
        arr1[0] = intVar1 + intVar2;
        System.out.println("arr1[0] : " + arr1[0]);

    }

}
