package array;

public class Array3 {
    public static void main(String[] args) {
        /*
        * 기본형 VS 참조형
        * 자바의 변수 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류
        * 사용하는 값을 직접 넣을 수 있는 기본형
        * 방금 본 배열 변수와 같이 메모리의 참조값을 넣을 수 있는 참조형으로 분류 가능
        *
        * 기본형 (Primitive Type) : 지금까지 봤던 int, long, double, boolean처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입
        * 참조형 (Reference Type) : int[] students와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형이라고 함
        *
        * 곧 배울 객체나 클래스를 담을 수 있는 변수들도 모두 참조형!
        *
        * 근데 배열은 왜 복잡하게 참조형을 사용할까?? 변수처럼 그냥 단순히 그 안에 값을 넣고 사용하면 되는 것 아닐까??
        * -> 기본형은 모두 사이즈가 명확하게 정해져있음
        * int i; // 4byte
        * long l; // 8byte
        * double d; // 8byte
        *
        * 그런데 배열은 동적으로 사이즈를 변경할 수 있음
        * int size = 10000000; // 사용자가 입력한 값을 넣었다고 가정함
        * new int[size] // 이 코드가 실행되는 시점에 배열의 크기가 정해짐!!!
        *
        * 즉 정리해보자면
        * 기본형은 선언과 동시에 크기가 정해짐 따라서 크기를 동적으로 바꿀 수 없음
        * 반면에 배열과 같은 참조형은 크기를 동적으로 할당할 수 있음
        * 예를 들어서 Scanner를 사용해서 사용자 입력에 따라서 size 변수의 값이 변하고 생성되는 배열의 크기도 달라질 수 있음
        * 이런 것을 동적 메모리 할당이라고 함
        * 기본형은 선언과 동시에 사이즈가 정적으로 정해지지만 참조형은 동적으로 크기가 변해서 유연성을 제공해줌
        *
        * 기본형은 사용할 값을 직접 저장함 반면에 참조형은 메모리에 저장된 배열이나 객체의 참조를 저장함
        * 이로 인해 참조형은 더 복잡한 데이터 구조를 만들고 관리 가능 반면 기본형은 더 빠르고 메모리를 효율적으로 처리
        */
    }
}
