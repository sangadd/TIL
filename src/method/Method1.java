package method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println(sum1);

        int sum2 = add(15, 20);
        System.out.println(sum2);
    }

    // 반환값이 있을 때 반환값을 안받아도됨 add(100, 200);
    public static int add(int a, int b) {
        System.out.println(a + b);
        int sum = a + b;
        return sum;
    } // 이 부분이 메서드 (단순히 무언가 정의해두고 필요할 때 불러서 사용한다는 개념으로 이해하기)

    /*
    * public static int add(int a, int b) { ==> 메서드 선언
    * 메서드 이름, 반환 타입, 매개변수 (파라미터) 목록을 포함함
    * public : 다른 클래스에서 호출할 수 있는 메서드, 접근 제어자
    * static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드
    *
    * int add(int a, int b)
    * int : 반환 타입 정의, 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정
    * add : 메서드에 이름을 부여함, 이 이름으로 메서드 호출 가능
    *
    * (int a, int b) : 메서드를 호출할 때 전달하는 입력 값을 정의함
    * 이 변수들은 해당 메서드 안에서만 사용됨 이렇게 메서드 선언에 사용되는 변수를 영어로 파라미터, 한글로 매개변수라고 함
    *
    *
    *  System.out.println(a + b);
        int sum = a + b;
        return sum;
    * 이 부분이 메서드 본문
    * 메서드가 수행해야 하는 코드 블록임
    * 메서드를 호출하면 메서드 본문이 순서대로 실행됨
    * 메서드의 실행 결과를 반환하려면 return문을 사용해야함
    *
    * 메서드 호출은 아래 부분
    * int sum1 = add(5, 10); // add라는 메서드를 숫자 5, 10을 전달하면서 호출한다
    * int sum2 = add(15, 20); // add(5, 10)이 실행되고 실행 결과는 반환 값은 15이다
    *
    * 호출이 끝나면 더 이상 해당 메서드가 사용한 메모리는 낭비할 이유가 없음
    * 메서드 호출이 끝나면 메서드 정의에 사용한 파라미터 변수인 int a, int b는 물론이고
    * 그 안에서 정의한 int sum도 모두 제거됨
    */



}
