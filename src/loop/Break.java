package loop;

public class Break {
    public static void main(String[] args) {
        /*
        * break는 반복문을 즉시 종료하고 나감
        * contiue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용
        * 참고로 while, do-while, for와 같은 모든 반복문에서 사용 가능
        */

        /*
        * while(조건식) {
        * 코드1;
        * break;
        * 코드2;
        * }
        * break를 만나면 코드2가 실행되지 않고 while문이 종료됨
        */

        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료" + i + sum);
                break;
            }
            i++;
        }
    }
}
