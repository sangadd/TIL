package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동작");
        printFooter();
    }

    // 매개변수가 없는 경우
    public static void printHeader() {
        System.out.println("프로그램 시작");
        return;
    }

    // 반환 타입이 없는 경우
    public static void printFooter() {
        System.out.println("프로그램 종료");
    }

    /*
    * void와 return 생략
    * 모든 메서드는 항상 return을 호출해야함
    * 근데 반환 타입 void 경우는 예외로 printFooter() 와 같이 생략해도 됨
    * 자바 컴파일러가 반환 타입이 없는 경우에는 return을 마지막줄에 넣어줌
    */
}