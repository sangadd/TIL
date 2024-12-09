package loop;

public class Nested {
    public static void main(String[] args) {
        // 중첩 반복문 : 반복문은 내부에 또 반복문 생성 가능, for와 while문 모두 가능

        for (int i =0; i <2; i++){
            System.out.println("외부" + i);
            for (int j =0; j <5; j++){
                System.out.println("내부" + j);
            }
            System.out.println("외부" + i);
            System.out.println();
        }
    }
}
