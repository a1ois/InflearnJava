package lec04.OOP13.first;

public class ConsOneMain {

    public static void main(String[] args) {

        ConsSampleOne consSampleOne = new ConsSampleOne(); // 생성자가 없어도 자동으로 생성해줌
        consSampleOne.cpuName = "intel";
        consSampleOne.gpuName = "nvd";

        System.out.println(consSampleOne.cpuName);

    }

}
