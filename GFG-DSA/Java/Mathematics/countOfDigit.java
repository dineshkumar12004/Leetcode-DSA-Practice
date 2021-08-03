// count of no. of digits in a number
import java.util.Scanner;

class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int count = 0;
        while(number > 0){
            number = number / 10; //123 
            count++; // 3
        }
        System.out.println(count);
    
        sc.close();
    }
}