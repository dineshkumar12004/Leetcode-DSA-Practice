package JAVA;

class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length())
                min = strs[i].length();

        }
        String check = strs[0];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < min; i++) {

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i))
                    return ans.toString();

            }
            ans.append(strs[0].charAt(i));
        }

        return ans.toString();
    }
}