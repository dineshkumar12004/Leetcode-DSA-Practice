import java.util.Arrays;

class ShortestDistancetoCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(Arrays.toString(shortestToChar(s, 'e')));

    }

    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];

        for (int i = 0, j = 0; i < ans.length; i++) {
            if (i == 0)
                j = s.indexOf(c);
            if (i > j && s.indexOf(c, i) >= 0 && Math.abs(j - i) > Math.abs(s.indexOf(c, i) - i)) {
                j = s.indexOf(c, i);
            }
            ans[i] = Math.abs(j - i);
        }

        return ans;
    }
}