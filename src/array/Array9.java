package array;

public class Array9 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만들기
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6}
        }; // 행은 2 열은 3
        // new int[][] 생략 가능

        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column]);
            }
            System.out.println();
        }
    }
}

