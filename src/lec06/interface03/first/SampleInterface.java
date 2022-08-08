package lec06.interface03.first;

public interface SampleInterface {

    public void interfaceMethod(); // 구현체가 없는 일반 메서드 사용, => 구현체가 없는 메서드

    public abstract void abstractMethod(); // ==> 추상 메서드

    public String OS_NAME = "window10";
    public final static String DOWNLOAD_PATh = "C:/";

    public class sampleFirst    {
        public int sampleCount = 3;
    }

    public static class sampleStaticClass{
        public static int staticSampleCount = 1;
    }

    public interface innerInterface {
        public void showMsg();
    }

    public enum D {CREATE, READ, UPDATE, DELETE}

    public default void defaultMethod(){
        System.out.println("기본 메소드입니다. 자바 1.8 이후부터 사용 가능합니다.");
    }

    public static void   staticVoidMethod(){
        System.out.println("static 메서드도 사용 가능합니다. 이 역시 1.8부터 사용이 가능합니다.");
    }

}
