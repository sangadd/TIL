package cond;

public class If1 {
    public static void main(String[] args) {
        int age1 = 15;

        if (age1 >= 18){
            System.out.println("성인");
        }

        if (age1 < 18){
            System.out.println("미성년자");
        }

        // else문은 if문에서 만족하는 조건이 없을 때 실행하는 코드를 제공함
        int age2= 20;

        if (age2 >= 18){
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }
    }
}
