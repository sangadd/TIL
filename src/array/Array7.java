package array;

public class Array7 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만들기
        int[][] arr = new int[2][3]; // 행은 2 열은 3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < 2; row++){
            System.out.print(arr[row][0]);
            System.out.print(arr[row][1]);
            System.out.print(arr[row][2]);
            System.out.println();
        }

        // for 문을 통해서 행을 반복해서 접근 가능
        // 각 행 안에서 열이 3개이므로 arr[row][0], arr[row][1] arr[row][2] 3번 출력함
    }
}

