package JAVA;

import java.util.Arrays;

class ConcatenationofArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}