package lec04.OOP06_동적파라미터;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray dArray = new DynamicArray();
        dArray.dynamicMethod("Grape", "WaterMelon", "Apple", "Orange");

        dArray.dynamicMethod(new String[]{"Samsung", "SK", "Hyundai", "LG"});

    }

}
