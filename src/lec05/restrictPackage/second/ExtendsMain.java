package lec05.restrictPackage.second;

import lec05.restrictPackage.first.GoodsVO;

public class ExtendsMain extends GoodsVO { // public, protected 접근 가능

    public static void main(String[] args) {

        ExtendsMain extendsMain = new ExtendsMain();
        extendsMain.showMethod();

    }

    public void showMethod(){ // 메인 메서드는 static 이기 때문에 super. 을 바로 사용할 수 없다 => 메서드로 따로 빼줌
        String goodsName = super.goodsName;
        int goodsCount = super.goodsCount;

        System.out.println("상품 이름 : " + goodsName);
        System.out.println("상품 가격 : " + goodsCount);
    }

}
