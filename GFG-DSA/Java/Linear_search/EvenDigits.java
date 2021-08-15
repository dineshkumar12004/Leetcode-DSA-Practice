public class EvenDigits {
    public static void main(String[] args) {
        int[] array = {111,21311,22212,3331,313};
        int ans = findEvenDigits(array);
        System.out.println(ans);
    }

    public static boolean hasEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            n /= 10;
            sum++;
        }
        return sum % 2 == 0;
    }

    public static int findEvenDigits(int[] arr) {
        int count = 0;
        for (int nums : arr) {
            if (hasEvenDigits(nums)) {
                count++;
            }
        }
        return count;
    }
}
