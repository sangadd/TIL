package array;

public class EnhancedFor {
    public static void main(String[] args) {
        /*
        * 향상된 for문
        * 향상된 for문을 이해하려면 배열을 먼저 알아야함
        * 각각의 요소를 탐색한다는 의미로 for-each문이라고 많이 부름
        * 향상된 for문은 배열을 사용할 때 기존 for문 보다 더 편리하게 사용 가능 !!
        *
        * 향상된 for문 정의
        * for (변수 : 배열 또는 컬렉션) {
        *  // 배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
        * }
        */

        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i<numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문 --> 실무에서 가장 많이 씀!!!
        for (int number : numbers){ // numbers의 배열을 하나씩 순회함
            System.out.println(number);
        }

        /* 향상된 for문은 배열의 인덱스를 사용하지 않고 종료 조건을 주지 않아도 됨
        * 단순히 해당 배열을 처음부터 끝까지 탐색함
        * :의 오른쪽에 numbers와 같이 탐색할 배열을 선택하고 :의 왼쪽에 int number와 같이 반복할 떄 마다 찾은 값을 저장할 변수를 선언함
        * 그러면 배열의 값을 하나씩 꺼내서 왼쪽에 있는 number에 담고 for문 수행
        * for문의 끝으로 가면 다음 값을 꺼내서 number에 담고 for문을 반복 수행함
        *
        * 향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 떄문에 코드가 간결하고 가독성이 좋다
        */

        // iter이라고 치면 자동완성됨 

        // for-each 문을 사용할 수 없는 경우 => 증가하는 index 값 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는 : " + numbers[i]);
        }
        // 향상된 for문에는 증가하는 인덱스 값이 감추어져 있음 그래서 int i와 같은 증가하는 인덱스 값을 직접 사용해야 하는 경우엔 사용 X
    }
}
