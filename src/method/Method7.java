package method;

public class Method7 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전" + num1); // 5
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후" + num1); // 10
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }

    // 자바는 항상 변수의 값을 복사해서 대입한다 (뒤에서 참조형도 알아봄)
}