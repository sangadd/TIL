package array;

public class Array6 {
    public static void main(String[] args) {

        /*
        2차원 배열
        지금까지 배운 배열은 단순히 순서대로 나열되어 있는데 1차원 배열이라고 함
        2차원 배열은 행과 열로 구성됨

        2차원 배열은 int[][] arr = new int [2][3]와 같이 선언하고 생성함 그리고 arr[1][2]와 같이 사용하는데
        먼저 행 번호를 찾고 그 다음 열 번호를 찾으면 됨
        행은 로우 열은 컬럼이라고 함 (자주 사용하는 단어!)

        arr [행][열] , arr[row][column]
        */

        // 2x3 2차원 배열을 만들기
        int[][] arr = new int[2][3]; // 행은 2 열은 3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.print(arr[0][0]);
        System.out.print(arr[0][1]);
        System.out.print(arr[0][2]);
        System.out.println();

        System.out.print(arr[1][0]);
        System.out.print(arr[1][1]);
        System.out.print(arr[1][2]);

    }
}

