package operator;

public class Oprtator3 {
    public static void main(String[] args) {
        int sum1 = 2 * 2 + 3 * 3; // 2 * 2) + (3 * 3) 와 같음
        int sum2 = (2 * 2) + (3 * 3);
        System.out.println(sum1);
        System.out.println(sum2);

        /*
        연산자 우선순위는 딱 2가지만 기억하기!!
        1. 상식선에서 우선순위를 사용하기
        2. 애매하면 괄호 사용하기

        개발에서 가장 중요한 것은 단순함과 명확함
        */

        int a = 0;

        a = a + 1;
        System.out.println(a); // 1
        a = a + 1;
        System.out.println(a); // 2

        // 증감연산자
        ++a;
        System.out.println(a); // 3
        ++a;
        System.out.println(a); // 4

        --a;
        System.out.println(a); // 3

        // 전위 증감 연산자 (변수 앞에 오는 경우)
        int aa = 1;
        int bb = 0;

        bb = ++aa; // aa의 값을 먼저 증가시키고 그 결과를 bb에 대입
        System.out.println("bb" + bb);
        System.out.println("aa" + aa);

        // 후위 증감 연산자 (변수 뒤에 오는 경우)
        aa = 1;
        bb = 0;

        bb = aa++; // a의 현재 값을 b에 먼저 대입하고 그 후에 a의 값 증가시킴
        System.out.println("bb" + bb);
        System.out.println("aa" + aa);
    }
}
