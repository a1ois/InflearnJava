package lec04.OOP06_배열파라미터;

public class ParamArrayTest {

    public static void main(String[] args) {
        // 보통 배열이나 동적 파라미터보단 컬렉션 (맵, 리스트)를 많이 사용함

        ParamArray pa = new ParamArray();
        String[] pStrArray = new String[]{"Ko", "Ru", "Ch", "Jp", "USA"};
        pa.printInfoParamArray(pStrArray);

    }

}
