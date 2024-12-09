package loop;

public class DoWhile1 {
    /*
    * do-while문
    * do {
    * 코드
    * } while (조건식)
    *
    * 조건에 상관없이 무조건 한 번은 코드를 실행함
    */

    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println("while문" + i);
            i++;
        }

        int j = 10;
        do {
            System.out.println("do-while문 " + i);
            j++;
        } while (j < 3);
    }
}
