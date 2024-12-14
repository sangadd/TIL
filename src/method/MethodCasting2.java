package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    public static void printNumber(double n) {
        System.out.println("숫자" + n);
    }

    /*
    * 메서드를 호출할 떄 매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것임
    * 그래서 자동 형변환이 그대로 적용됨
    * double형 매개변수(파라미터)에 int형 인수를 전달하는데 문제없이 잘 동작됨
    *
    * [정리]
    * 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 함
    * 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출 가능
    */

}