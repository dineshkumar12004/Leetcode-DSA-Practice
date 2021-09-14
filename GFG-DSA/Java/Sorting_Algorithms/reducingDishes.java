import java.util.Arrays;

// reducing dishes
// Leetcode -> https://leetcode.com/problems/reducing-dishes/
public class reducingDishes {
        public static int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++){
            int count = 1;
            int sum = 0;
            for(int j=i;j<s.length;j++){
                sum += (s[j]*count);
                count++;
            }
            if(sum > max)max = sum;
        }
        
        if(max >=0 )return max;
        return 0;
    
        }

        public static void main(String[] args)
        {
            int[] s = {-1,-8,0,5,-9};
            System.out.println(maxSatisfaction(s));
        }

   
}
