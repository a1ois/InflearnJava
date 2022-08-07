package lec04.OOP11;

public class MainMethod {

    public static void main(String[] args) {

        OverloadingExam overloadingExam = new OverloadingExam();

        int calculate = overloadingExam.calculate();
        int over1 = overloadingExam.calculate(1, 2);
        long over2 = overloadingExam.calculate(1, 3L);
        long over3 = overloadingExam.calculate(1L, 3);
        long over4 = overloadingExam.calculate(1L, 3L);

    }

}
