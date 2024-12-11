package array;

public class Array2 {
    public static void main(String[] args) {
        /* 배열이 뭐냐 
        * 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것 */

        int[] students; // int형 타입의 배열 변수 선언
        students = new int[5]; // 5개 배열 새로 생성 (5개의 int 공간이 생성, 0으로 자동 초기화)
        System.out.println(students);

        // 숫자는 0, boolean은 false, String은 null(없다는 뜻)로 초기화됨 (자바는 배열을 생성할 때 그 내부값을 자동으로 초기화함)
        // 근데 배열을 생성하는 new int[5] 자체는 아무런 이름이 없음!
        // 그냥 int형 변수를 연속 5개 만드는 것임
        /*
        * 따라서 생성한 배열에 접근이 필요한데 배열을 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 함
        * 그게 앞에서 int[] students 변수에 참조값을 보관해두는 것이고 이 변수를 통해 이 배열에 접근할 수 있는 것임
        * students = new int[5]; 이걸 찍어보면 students에는 [I@10f87f48 라고 나오는데
        * [I 이건 int 형 배열을 뜻하고 @ 뒷부분이 메모리의 참조값임 (이해만 하기)
        */

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
    }
}
