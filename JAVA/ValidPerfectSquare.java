class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));

    }

    public static boolean isPerfectSquare(int x) {

        /*
         * Brute force approach : Let us consider x as 16, now to find the square root
         * we will take 16 nos. in the array [1,2,3,4,5,6,7,8,9, ... 16] and will check
         * if 11 == 16
         * 22 == 16
         * 33 == 16
         * 44 == 16 -> found our answer
         */

        int len = x;

        // Applying binary search in the array we formed

        int start = 0;
        int end = len;

        while (start <= end) {
            long mid = start + (end - start) / 2; // long datatype, as the range of x is very high

            if (x < mid * mid) {
                end = (int) mid - 1;
            } else if (x > mid * mid) {
                start = (int) mid + 1;
            } else {
                return true;
            }
        }

        return false;

    }
}