package lec02.iflecture;

public class If01 {

    public static void main(String[] args) {

        int fruitCase = 10;
        String caseOne = "구매합니다";
        String caseTwo = "구매하지 않습니다";

        if(fruitCase > 9){
            System.out.println(caseTwo);
        } else{
            System.out.println(caseOne);
        }

    }

}
