// First Unique Character in a String
class FirstUniqChar{
  public static void main(String[] args){
    int result = firstUniqCharin("leetcode");
    System.out.println(result);
  }
  public static int firstUniqCharin(String s) {
          int[] count = new int[26];
          int n = s.length();
          // build char count bucket : <charIndex, count>
          for (int i = 0; i < n; i++) {            
              int index = s.charAt(i) - 'a';
              count[index]++;
          }

          // find the index
          for (int i = 0; i < n; i++) {
              int index = s.charAt(i) - 'a';
              if (count[index] == 1) {
                  return i;
              }

          }
          return -1;
      }
}
