public class SumofDigitsinBaseK {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;
        System.out.println(sumBase(n, k)); // 9
    }

    public static int sumBase(int n, int b) {
        int pow = 1;
        int ans = 0;
        while (n != 0) {
            int r = n % b;
            n /= b;
            ans += r;
        }
        return ans;
    }
}
