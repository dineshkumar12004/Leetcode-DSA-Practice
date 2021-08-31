import java.util.Scanner;

public class ispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        boolean result = palindrome(x);
        if(result){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }

    public static boolean palindrome(int x){
        int rem = 0;
        int num = x;
        while(x>0){
            rem = rem*10 + x%10;
            x /= 10;
        }
        return rem == num;
    }
    
}
