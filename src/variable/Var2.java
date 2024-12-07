package variable;

public class Var2 {
    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println(a);
        a = 50; // 변수 값 변경 a (10 -> 50)
        System.out.println(a); // 기존 값은 삭제됨
    }
}
