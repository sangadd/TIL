package method;

public class Method4 {

    public static void main(String[] args) {
        checkAge(24);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살 미성년자 출입 불가능");
            return;     // return 문을 만나면 그 즉시 메서드를 빠져나감
        }
        System.out.println(age + "살 입장 가능");
    }
}