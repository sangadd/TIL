package casting;

public class Casting3 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // 1
        System.out.println(div1);

        double div2 = 3 / 2; // 1.0
        System.out.println(div2);

        double div3 = 3.0 / 2; // 1.5
        System.out.println(div3);

        double div4 = (double) 3 / 2; //1.5
        System.out.println(div4);

        /*
         * 자바에서 계산 2가지
         * 1. 같은 타입끼리의 계산은 같은 타입의 결과를 냄
         * int + int는 int, double + double은 double 결과가 나옴
         *
         * 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어남
         * int + long은 long + long으로 자동 형변환이 일어남
         * int + double은 double + double로 자동 형변환이 일어남
         */
    }
}
