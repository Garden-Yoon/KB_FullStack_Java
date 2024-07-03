package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3};
        arr3 = arr2;

        // == 은 객체의 주소값을 비교
        // new를 할 때마다 새롭게 객체의 주소가 할당되기 때문에 arr1과 arr2의 주소값은 다르다.
        System.out.println(arr1 == arr2);
        // arr3에 arr2의 주소값을 할당했으므로, 둘의 주소 값은 같다
        System.out.println(arr2 == arr3);
    }
}
