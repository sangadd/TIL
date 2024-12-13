package method;

public class Method3 {
    public static void main(String[] args) {
        boolean result = add(2);
        System.out.println(result);
    }

    // 매개변수가 없는 경우
    public static boolean add(int i) {
        if (i % 2 == 1){
            return true;
        } else {
            return false;
        }
    }
}