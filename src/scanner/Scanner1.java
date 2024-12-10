package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine(); // 입력을 String으로 가져옴
        System.out.println("입력한 문자열 : " + str);

        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);
    }
}
