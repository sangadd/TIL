package cond;

public class If2 {
    public static void main(String[] args) {
        // else if문은  앞선 if문이 참이라면 else if를 실행하지 않음
        int age = 21;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }


        /*
        1. if-else 사용 : 서로 연관된 조건이어서 하나로 묶을 때 사용
        if(condition1) {
            작업 1 수행
        } else if (condition2) {
            작업 2 수행
        }

        2. if 각각 사용 : 독립 조건일 때
        if(condition1) {
            작업 1 수행
        }
        if(condition2) {
            작업 2 수행
        }

         1번은 작업 1과 2중 하나만 수행되지만 2번은 조건이 맞다면 둘 다 수행될 수 있음

         if문에 여러 조건이 있다고 항상 if-else문으로 묶어서 사용할 수 있는건 아님
         조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우에는 else if문을 사용하면 안되고 여러 if문을 분리해서 사용해야함
        */

        int price = 10000;
        int age1 = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매하면 1000원 할인");
        }

        if (age1 <= 10){
            discount = discount + 1000;
            System.out.println("어린이면 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");

        // 독립 조건인데 if와 else-if를 사용한 경우
        System.out.println("========== 잘못된 예시 ==========");
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매하면 1000원 할인");
        } else if (age1 <= 10){
            discount = discount + 1000;
            System.out.println("어린이면 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액 : " + discount + "원");

        /*
        * 정리
        * if문을 각각 사용할지, if와 else if를 함께 묶어서 사용할지는 요구사항에 따라 다르기 때문에
        * 둘의 차이 이해하고 적절하게 사용해야함
        *
        * if문에서 중괄호 생략하는 것보다 사용하는 것을 권장
        */
    }
}