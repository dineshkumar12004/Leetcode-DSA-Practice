// count trailing zeroes in an integer

public class trailingZeros {
    
    public static void main(String[] args) {

        System.out.println(countZeros(10));
        
    }

    public static int countZeros(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i; //120
        }
        int count = 0;
        while(fact % 10 == 0) {
            count++;
            fact /= 10;
        }

        return count;
    }
}
