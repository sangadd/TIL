package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 숫자 더하기1
        String result1 = "a + b = " + 10;
        System.out.println(result1);

        /*
         *  자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더함
         */

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result2 = str + num;
        System.out.println(result2);

        /*
         * 변수에 담겨 있어도 숫자를 더하면 문자가 됨
         * 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경함
         * => 문자열에 더하는 것은 다 문자열이 됨
         */
    }
}
