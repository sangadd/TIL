package method;

public class Method6 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전" + num1); // 5
        changeNumber(num1);
        System.out.println("changeNumber 호출 후" + num1); // 5
    }

    public static void changeNumber(int num2) {
        System.out.println("changeNumber 변경 전" + num2); // 5
        num2 = num2 * 2;
        System.out.println("changeNumber 변경 후" + num2); // 10
    }
}