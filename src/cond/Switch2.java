package cond;

public class Switch2 {
    public static void main(String[] args) {
        // switch문은 if문을 조금 더 편리하게 사용할 수 있는 기능
        // if문은 비교 연산자를 사용할 수 있지만 switch문은 단순히 값이 같은지만 비교할 수 있음

        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰" + coupon);
        // break가 없으면 주단하지 않고 다음 case로 넘어가기 때문에  break 필요!

        /*
        * if문 VS switch문
        * switch문의 조건식을 넣는 부분을 잘 보면 x > 10과 같은 참 거짓의 결과가 나오는 조건이 아니라 단순히 값만 넣을 수 있음
        * switch문은 조건식이 특정 case와 같은지만 체크할 수 있음
        * 즉 값이 같은지 확인하는 연산만 가능 (문자도 가능)
        * 반면 if문은 참 거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있음
        */
    }
}
