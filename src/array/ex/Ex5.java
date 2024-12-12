package array.ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수 : ");
        int count = scanner.nextInt();

        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.print(count + "개의 정수 입력 : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;
        System.out.println("입력한 정수의 합 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
