package JAVA;

import java.util.*;

class DIStringMatch {
  public static void main(String[] args) {
    int[] result = diStringMatch("IDID");
    System.out.println(Arrays.toString(result));
  }

  public static int[] diStringMatch(String S) {
    int N = S.length();
    int lo = 0, hi = N;
    int[] ans = new int[N + 1];
    for (int i = 0; i < N; ++i) {
      if (S.charAt(i) == 'I')
        ans[i] = lo++;
      else
        ans[i] = hi--;
    }

    ans[N] = lo;
    return ans;
  }
}
