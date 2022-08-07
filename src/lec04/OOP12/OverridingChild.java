package lec04.OOP12;

public class OverridingChild extends OverridingParent{

    /*
    @Override
    public String showCompany() {
        return super.showCompany(); // 부모클래스의 showCompany 를 불러온다는
        // super 는 자식클래스에서 상속받은 부모클래스를 가리킨다. >> 부모 클래스를 가리킨다.
    }
     */

    @Override
    public String showCompany() {
        String parentString = super.showCompany();
        parentString = "삼성" + parentString;
        return parentString;
    }
}
