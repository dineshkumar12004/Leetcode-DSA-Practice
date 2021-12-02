
import java.util.ArrayList;
import java.util.List;

class SelfDividingNo {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> res = selfDividingNumbers(left, right);
        System.out.println(res);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        // iterate from left to right
        for (int i = left; i <= right; i++) {
            // if all the digits divide the number then add to the list
            if (isDivisible(i))
                result.add(i);
        }
        return result;
    }

    public static boolean isDivisible(int i) {
        int original = i; // save the value
        // regular digit extraction logic
        while (i > 0) {
            int temp = i % 10;
            // condition for the rule mentioned
            if (temp == 0 || original % temp != 0)
                return false;
            i /= 10;
        }
        return true;
    }
}