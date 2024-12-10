package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자열 입력 : " );
            String str = scanner.nextLine();
            if (str.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
