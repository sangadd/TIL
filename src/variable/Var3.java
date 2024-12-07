package variable;

public class Var3 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화(선언한 변수에 처음으로 값을 저장하는 것) 각각 따로
        int a;
        a = 1;
        System.out.println(a);

        int b = 2; // 2.  변수 선언와 초기호를 한 번에
        System.out.println(b);

        int c = 3, d = 4; // 3. 여러 변수 선언와 초기화를 한 번에
        System.out.println(c);
        System.out.println(d);

        // 변수를 초기화를 꼭 해야한다.
        int e;
        /* System.out.println(e);  java: variable e might not have been initialized
        변수가 초기화되지 않았다는 오류
        왜 발생 ?
        컴퓨터에서 메모리는 여러 시스템이 함께 사용하는 공간이다. 그래서 어떠한 값들이 계속 저장된다.
        변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용하는데 그 공간에 기존에 어떤 값이 있었는지 모름
        따라서 초기화를 하지 않으면 이상한 값이 출력될 수 있어서 자바는 변수 초기화를 강제한다!

        지금 변수는 지역 변수인데 개발자가 직접 초기화를 해야함 나중에 배울건 클래스 변수와 인스턴스 변수인데 자바가 자동으로 초기화 진행해줌

        지금 발생하는 에러는 컴파일 에러인데 컴파일 에러는 자바 문법에 맞지 않았을 떄 발생하는 에러!
        */
    }
}
