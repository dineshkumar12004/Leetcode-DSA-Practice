class SumofUniqueElements {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2, 3 };
        System.out.println(UniqueElements(nums));
        System.out.println("Happy new year 2022 dkpro");
    }

    public static int UniqueElements(int[] nums) {
        int[] unique = new int[101];
        int ans = 0;
        for (int num : nums) {
            unique[num - 1]++;
            if (unique[num - 1] == 1)
                ans += num;
            else if (unique[num - 1] == 2)
                ans -= num;
        }
        return ans;
    }

}
