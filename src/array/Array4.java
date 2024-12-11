package array;

public class Array4 {
    public static void main(String[] args) {
 /*     int[] students;
        students = new int[5];

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;*/

        // 위에 코드를 아래 코드로 변경 가능
        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화

        // 변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i + 1) + "점수: "+ students[i]);
        }
    }
}

