package lec06.interface03.first;

public class SampleClass implements SampleInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("SampleClass에서 구체화되었습니다.");
    }

    @Override
    public void abstractMethod() {
        System.out.println("SampleClass에서 구체화되었습니다.");
    }

    @Override
    public void defaultMethod() {
        System.out.println("default 메서드입니다. sampleClass에서 구현되었습니다.");
    }
}
