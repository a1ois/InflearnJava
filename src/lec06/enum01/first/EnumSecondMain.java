package lec06.enum01.first;

import java.util.Scanner;

public class EnumSecondMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("값을 입력하세요.   ");
            int scIN = scanner.nextInt();

            if (scIN == EnumCRUD.CREATE.getIntValue()){
                System.out.println("저장입니다.");
            } else if (scIN == EnumCRUD.READ.getIntValue()) {
                System.out.println("읽기입니다.");
            } else if (scIN == EnumCRUD.UPDATE.getIntValue()) {
                System.out.println("수정입니다.");
            } else if (scIN == EnumCRUD.DELETE.getIntValue()) {
                System.out.println("삭제입니다.");
            } else {
                break;
            }
        }

    }

}
