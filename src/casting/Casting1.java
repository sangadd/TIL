package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println(longValue); // 10

        doubleValue = intValue;
        System.out.println(doubleValue); // 10.0

        doubleValue = 20L;
        System.out.println(doubleValue); // 20.0

        // 자동 형변환(= 묵시적 형변한)
        doubleValue = (double) intValue;
    }
}
