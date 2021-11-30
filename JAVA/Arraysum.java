package JAVA;

class Arraysum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        System.out.println(arr[arr.length - 1]);
    }
}