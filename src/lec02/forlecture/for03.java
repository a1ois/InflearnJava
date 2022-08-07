package lec02.forlecture;

public class for03 {

    public static void main(String[] args) {

        int[] arrIntData1 = new int[5];
        arrIntData1[0] = 10;
        arrIntData1[1] = 5;
        arrIntData1[2] = 3;
        arrIntData1[3] = 1;
        arrIntData1[4] = 7;

        for(int i = 0; i < arrIntData1.length; i++){
            int getData = arrIntData1[i];
            System.out.println("i : " + i + ", getData : " + getData);

            if(i==3){
                break;
            }
        }

        int[] arrData1 = new int[]{1, 2, 3, 4, 5};
        for(int getData : arrData1){
            System.out.print("getData : " + getData + "\t\t");
        }

        System.out.println("\n\n");

        for(int i = 0; i < 5; i++){
            if(i%2 == 0){
                continue; // 로직을 수행하지 말고 (멈추고) 다시 위로 올라가라는 뜻
            }
            int getData = arrData1[i];
            System.out.print("i : " + i + ", getData : " + getData + "\t\t");
        }

    }

}
