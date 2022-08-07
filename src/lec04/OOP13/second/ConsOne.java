package lec04.OOP13.second;

public class ConsOne {

    public String cpuName;
    public String gpuName;

    ConsOne(){ // 다른 생성자가 있는 경우, 컴파일러가 기본 생성자를 만들어주지 않기에 따로 만들어줘야함
        System.out.println("기본 생성자가 실행되었습니다");
    }

    ConsOne(String cpuName, String gpuName) {
        System.out.println("파라미터가 있는 생성자");
    }

}
