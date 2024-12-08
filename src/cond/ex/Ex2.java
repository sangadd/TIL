package cond.ex;

public class Ex2 {
    public static void main(String[] args) {
        double rating = 8.3;

        if (rating <= 9){
            System.out.println("어바웃타임을 추천합니다");
        }
        if (rating <= 8){
            System.out.println("토이 스토리를 추천합니다");
        }
        if (rating <= 7){
            System.out.println("고질라를 추천합니다");
        }

        String grade = "A";
        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다!");
            case "B" -> System.out.println("좋은 성과입니다!");
            case "C" -> System.out.println("준수한 성과입니다!");
            case "D" -> System.out.println("향상이 필요합니다!");
            case "F" -> System.out.println("불합격입니다!");
            default -> System.out.println("잘못된 학점입니다!");
        }

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다");

        int x = 5;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + result);

    }
}
