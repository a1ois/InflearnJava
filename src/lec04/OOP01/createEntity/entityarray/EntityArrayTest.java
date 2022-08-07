package lec04.OOP01.createEntity.entityarray;

import lec04.OOP01.createEntity.House;

import java.util.ArrayList;

public class EntityArrayTest {

    public static void main(String[] args) {

        House[] houseArray = new House[3];  // 객체 배열보다는 List를 많이 사용해서, 객체 배열은 잘 사용되지 않는다
        houseArray[0] = new House();
        houseArray[1] = new House();
        houseArray[2] = new House();

        houseArray[0].airconOn();
        houseArray[1].airconOff();

        System.out.println(houseArray[0].airconStat);
        System.out.println(houseArray[1].airconStat);

        House[] houses = new House[] {new House(), new House(), new House()}; // 선호되지 않음
        houses[0].airconOff();
        houses[1].airconOn();

        System.out.println(houses[0].airconStat);
        System.out.println(houses[1].airconStat);


    }

}
