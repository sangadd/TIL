package array.ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수 : ");
        int number = scanner.nextInt();

        int[] numbers = new int[number];
        int minNumber, maxNumber;

        System.out.println(number + "개 정수 입력");
        for (int i = 0; i < number; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = numbers[0];
        maxNumber = numbers[0];

        for (int i = 0; i < number; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println(minNumber + maxNumber);
    }
}
