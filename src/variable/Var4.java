package variable;

public class Var4 {
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 블리언 , 참과 거짓 판단
        char d = 'A'; // 문자 하나
        String e = "문자열"; // 문자열

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // int 타입, int 형식, int 형 이라고 부름

        /*
         * 리터럴 (literal)
         * 코드에서 개발자가 직접 적은 100, 10.5, true 등과 같은 고정된 값을 프로그래밍 용어로 리터럴이라고 함
         * 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이므로 리터럴 자체는 변하지 않음
         */

        //정수
        byte bb = 127; //-128 ~ 127
        short ss = 32767; // -32,768 ~ 32,767
        int ii = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long ll = 9223372036854775807L;

        //실수
        float ff = 10.0f;
        double dd = 10.0;

        /*
        실무에서 자주 사용하는 타입
        정수 - int, long  : 자바는 정수에 기본으로 int를 사용한다. 만약 20억이 넘을 것 같으면 long을 사용
        파일을 다룰 때는 byte를 사용
        실수 - double : 실수는 고민하지 말고 double을 쓰면 됨
        불린형 - boolean : true, false 참 거짓을 표현. 이후 조건문에서 자주 사용됨
        문자열 - String : 문자를 다룰 때는 문자 하나든 문자열이든 모두 String을 사용하는 것이 편리함
        */
    }
}
