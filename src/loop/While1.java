package loop;

public class While1 {
    public static void main(String[] args) {
        /*
        while (조건식) {
            코드
        }
        조건식을 확인 -> 참이면 코드 블럭을 실행하고 거짓이면 while문을 벗어남
        조건식이 참이면 코드 블러을 실행한 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가 조건식을 검사함 (무한반복)
        */

        int count = 0;
        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는 : " + count);
        }



    }
}
