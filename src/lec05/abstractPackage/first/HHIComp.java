package lec05.abstractPackage.first;

public class HHIComp extends AbsComp{ // 추상 메서드 상속 -> 자동으로 미구현 메서드를 더해줌
    @Override
    public void showCompName() { // 추상 클래스에 선언된 추상 메서드들이 오버라이드 되면서 구현됨
        System.out.println("현대중공업");
    }

    @Override
    public void showLoc() {
        System.out.println("울산");
    }
}
