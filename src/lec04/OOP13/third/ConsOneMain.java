package lec04.OOP13.third;


public class ConsOneMain {

    public static void main(String[] args) {

        ConsOne sample = new ConsOne();
        sample.cpuName = "amd";
        sample.gpuName = "radeon";

        System.out.println(sample.cpuName);
        System.out.println(sample.gpuName);

        ConsOne consOne = new ConsOne("intel", "nvd");
        System.out.println(consOne.cpuName);
        System.out.println(consOne.gpuName);

        System.out.println("=====================");
        // 생성자를 이용한 객체 복사 결과
        ConsOne consTwo = new ConsOne(consOne);
        System.out.println(consTwo.cpuName);
        System.out.println(consTwo.gpuName);

        System.out.println("=====================");
        consTwo.cpuName = "amd";
        consTwo.gpuName = "radeon";
        System.out.println(consTwo.cpuName);
        System.out.println(consTwo.gpuName);
        System.out.println("=====================");
        System.out.println(consOne.cpuName);
        System.out.println(consOne.gpuName);

    }

}
