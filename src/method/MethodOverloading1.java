package method;

public class MethodOverloading1 {
    /*
    * 다음과 같이 메서드를 만들고 싶다고 가정
    * 1. 두 수를 더하는 메서드
    * 2. 세 수를 더하는 메서드
    *
    * 이 경우 둘 다 더하는 메서드이기 때문에 가급적 같은 이름은 add를 사용하고 싶음
    * 자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용 사용해서 메서드를 구문함
    *
    * [오버로딩 성공]
    * add(int a, int b)
    * add(int a, int b, int c)
    * add(double a, double b)
    *
    * => 이렇게 이름이 같고 매개변수가 다른 메서드를 여러 개 정의하는 것을 메서드 오버로딩이라고 함
    * => 오버로딩을 번역하면 과적인데 과하게 물건을 담았다는 뜻
    * => 따라서 같은 이름의 메서드를 여러 개 정의했다고 이해하면 됨
    *
    * [오버로딩 규칙]
    * 메서드 이름이 같아도 매개변수 타입 및 순서가 다르면 오버로딩 가능
    * 참고로 반환 타입은 인정 불가능
    *
    * [오버로딩 실패]
    * int add(int a, int b)
    * double add(int a, int b)
    *
    * 용어 : 메서드 시그니처
    * 메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
    *
    * 메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻함
    * 메서드 이름과 매개변수(순서 포함)으로 구성되어 있음
    * 쉽게 이야기해서 메서드를 구분할 수 있는 기준임
    * 자바 입장에서는 각각의 메서드를 고유하게 구분할 수 있어야 하는데 그래야 어떤 메서드를 호출 할 지 결정할 수 있기 때문
    *
    * 따라서 메서드 오버로딩에서 설명한 것처럼 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주함
    * 반환 타입은 시그니처에 포함되지 않음 (오버로딩 실패한 예시보기)
    */

    public static void main(String[] args) {
        System.out.println("1 : " +  add(1, 2));
        System.out.println("2 : " +  add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}