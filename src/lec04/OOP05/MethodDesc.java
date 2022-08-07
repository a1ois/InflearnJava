package lec04.OOP05;

public class MethodDesc {

    void printInfo(){ // 선언부
        System.out.println("Hello, world."); // 구현부
    }

    void printInfo(String goodsName){

    }

    int calculateSum(int quantity, int price){
        int totalPrice = quantity + price;
        return totalPrice;
    }

    int addMaterial(int newInput){
        int remainValue = 0; // 지역변수
        remainValue = remainValue + newInput;
        // remainValue 는 지역변수이기에 메서드가 끝나면 더 이상 사용 불가능, 메서드 내부에서만 사용 가능
        return remainValue;
    }

}
