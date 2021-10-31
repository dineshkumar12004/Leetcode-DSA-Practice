class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 3 };
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        int pos = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (pos != -1) {
                    return false;
                }
                pos = i;
            }
        }

        return pos == -1 || pos == 0 || pos == nums.length - 2 || nums[pos - 1] <= nums[pos + 1]
                || nums[pos] <= nums[pos + 2];
    }
}