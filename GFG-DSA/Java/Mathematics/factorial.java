import java.util.Scanner;
// Factorial of a number
public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println(fact(num));
    }

    public static int fact(int n) { 
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1); 
                                
        }
        
    }
}
