

public class FindMin {
    public static void main(String[] args) {
        int[] num = {100, 12, 43, 224, 125, 60, 17, 81, 932, 1120};

        System.out.println(findMin(num));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
