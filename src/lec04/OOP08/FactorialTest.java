package lec04.OOP08;

public class FactorialTest {

    public static int methodFactorial(int x){
        if (x == 0 || x == 1){
            return 1;
        }

        int returnValue = x * methodFactorial(x - 1);
        System.out.println(x + " * factorial(" + (x - 1) + ") = " + returnValue);
        return returnValue;
    }


    public static void main(String[] args) {

        int resultValue = methodFactorial(5);
        System.out.println("결과값 : " + resultValue);

    }

}

/*
retrunValue = 3 * MF2
returnValue = 2 * MF1

-> MF1 = 1
returnValue = 2 * MF1 = 2
returnValue = 3 * MF2 = 6
*/
