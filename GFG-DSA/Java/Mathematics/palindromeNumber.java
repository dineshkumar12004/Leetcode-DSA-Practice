import java.util.Scanner;

// palindrome number 
public class palindromeNumber {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPalindrome(num));

        scan.close();
    }

    public static boolean isPalindrome(int num) {
        
        int temp = num; 
        int rev = 0; //321
        while (temp > 0) {
            rev = rev * 10 + temp % 10; //1
            temp /= 10;
        }
        if (num == rev) {
            return true;
        } else {
            return false;
        }

    }
}
