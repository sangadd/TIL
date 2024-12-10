package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        // 호환되지 않은 유형 : double -> int로의 가능한 손실 변환

        // 개발자가 직접 감수하고도 값을 대입하고 싶다면 데이터 타입을 강제로 변경 가능
        intValue = (int) doubleValue; // 형변환(캐스팅), 개발자가 직접 형변환 코드를 입력한다고 해서 명시적 형변환이라고 함
        System.out.println(intValue); // 1 출력

        /*
        * 참고로!!
        * 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안에 있는 값이 변경되는 것은 아님
        * doubleValue에서 읽은 값을 형변환 하는 것임
        * double 안에 들어있는 값은 1.5로 그대로 유지됨 참고로 변수의 값은 대입연산자(=)를 사용해서 직접 대입할 때만 변경됨
        *
        * 오버플로우가 발생하면 대입하는 변수의 타입을 int -> long으로 변경해서 사이즈를 늘리면 오버플로우 문제 해결됨
        */
    }
}
