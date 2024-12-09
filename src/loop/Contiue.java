package loop;

public class Contiue {
    public static void main(String[] args) {
        /*
         * while(조건식) {
         * 코드1;
         * continue;
         * 코드2;
         * }
         * continue를 만나면 코드2가 실행되지 않고 다시 조건식으로 이동함 조건식이 참이면 while문을 실행함
         */

        int i = 1;

        while (i <= 5) {
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
