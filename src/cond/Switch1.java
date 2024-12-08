package cond;

public class Switch1 {
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
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰" + coupon);
    }
}
