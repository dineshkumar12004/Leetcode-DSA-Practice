class ThreeDivisors {
    public static void main(String[] args) {
        System.out.println(isThree(12));
    }

    public static boolean isThree(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return i == n / i;
        }
        return false;
    }
}