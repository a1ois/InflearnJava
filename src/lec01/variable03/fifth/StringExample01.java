package lec01.variable03.fifth;

public class StringExample01 {

    public static void main(String[] args) {

        String companyName = "한국";
        System.out.println("companyName : " + companyName);

        String cctCompanyName = companyName + "전력";
        System.out.println(cctCompanyName);

        String country1 = "한국";
        String country2 = "한국";
        boolean boolean1 = country1 == country2;
        System.out.println(boolean1); // true

        String strCountry1 = new String("한국");
        String strCountry2 = new String("한국");
        boolean boolean2 = strCountry1 == strCountry2;
        System.out.println("boolean2 : " + boolean2); // false

        boolean boolEquals1 = strCountry1.equals(strCountry2);
        System.out.println("boolEquals1 : " + boolEquals1); // true

        StringBuilder sbVar = new StringBuilder("한국");
        sbVar.append("전력");
        System.out.println("sbVar.toString : " + sbVar.toString());

        StringBuffer strBuffer = new StringBuffer("수자원");
        strBuffer.append("공사");
        System.out.println("strBuffer.toString : " + strBuffer.toString());

    }

}
