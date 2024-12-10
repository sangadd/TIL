package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.println("입력한 모든 합 : " + sum);
    }
}
