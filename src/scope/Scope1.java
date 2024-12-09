package scope;

public class Scope1 {
    public static void main(String[] args) {
        /*
         * 스코프1 - 지역 변수와 스코프
         * 변수는 선언한 위치에 따라 지역변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류됨
         * 지역 변수는 이름 그대로 특정 지역에서만 사용할 수 있는 변수
         * 그 특정 지역을 벗어나면 사용할 수 없음 여기서 말하는 변수가 선언된 코드 블록({}) 이다
         * 지역 변수는 자신이 선언된 코드 블록 안에서만 생존하고 자신이 선언된 코드 블록을 벗어나면 제거됨
         */

        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
        //System.out.println("main x = " + x); // 오류남 !!
        System.out.println("main m = " + m);
    } //m 생존 종료
}
