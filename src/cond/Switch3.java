package cond;
public class Switch3 {

    /*
    * 자바 14 새로운 switch문
    * switch문은 if문 보다 조금 덜 복잡할 것 같지만 그래도 코드가 기대보다 깔끔하게 나오지 않는다.
    * 이런 문제를 해결하고자 자바 14부터는 새로운 switch문 정식 도입
    */
    public static void main(String[] args) {
        int grade =3;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->  500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);

        /*
        * 기존 switch문과 차이
        * -> 를 사용
        * 선택된 데이터를 반환할 수 있음
        */
    }
}
