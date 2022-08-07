package lec04.OOP13.third;

public class ConsOne {

    public String cpuName;
    public String gpuName;

    ConsOne(){
        this("amd", "radeon");
    }

    ConsOne(String cpuName){
        this(cpuName, "nvd");
        cpuName = "intel";
    }

    ConsOne(ConsOne consOne){ // 생성자를 이용한 객체 복사
        this.cpuName = consOne.cpuName;
        this.gpuName = consOne.gpuName;
    }

    ConsOne(String cpuName, String gpuName){
        this.cpuName = cpuName;
        this.gpuName = gpuName;
    }



}
