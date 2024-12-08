package cond.ex;

public class Ex1 {
    public static void main(String[] args) {
        int score = 90;

        if (score <= 90) {
            System.out.println("학점은 A입니다");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다");
        } else {
            System.out.println("학점은 F입니다");
        }

        int distance = 120;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요");
        } else {
            System.out.println("비행기를 이용하세요");
        }

        int dollar = 100;
        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원 입니다");
        }
    }
}
