package operator;

public class Logical1 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20;  // (a > 10) && (a < 20)
        boolean result1 = 10 < a && a < 20;  // 범위가 지정이 된 느낌이라 읽기가 편함 (위 코드랑 같음)

        System.out.println(result);
        System.out.println(result1);
    }
}
