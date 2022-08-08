package lec06.polymorphism02.first;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMethod {

    public static void main(String[] args) {

        Company cmpElecs = new Electronics(); // 다형성의 일종 (부모클래스 참조변수, 객체생성은 자식클래스)
        // 특징 : new 연산자를 통해 생성한 객체의 모든 기능을 사용할 수 없다.
        Company cmpShips = new Ships();

        Map<String, Object> hashMap = new HashMap<String, Object>();
        Map<String, Object> treeMap = new TreeMap<String, Object>();

        cmpElecs.builtCompany(); // 부모 클래스의 메서드 밖에 불러오지 못한다

        Electronics electronics = new Electronics();
        electronics.systemDevice(); // 자식클래스 참조 변수로 자식클래스 객체 생성 시 모든 자식 메서드 불러오기 가능

        boolean boolCompany = cmpElecs instanceof Company; // 형이 같은지 찾아보는 것 - instanceof
        System.out.println("같은가? : " + boolCompany);
        boolean boolelectronics = electronics instanceof Company;
        System.out.println("같은가? : " + boolelectronics);

        Ships ships = new Ships();
        boolean boolShips = ships instanceof Ships;
        System.out.println("같은가? : " + boolShips);

        if (ships instanceof Ships) {
            System.out.println("조선회사가 맞습니다.");
        }

    }

}
