package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0){
                System.out.println("둘 다 0임");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 숫자 합 : " + sum);
        }
    }
}
