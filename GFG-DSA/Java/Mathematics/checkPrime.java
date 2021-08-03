public class checkPrime {
    
    public static void main(String[] args) {
        int n = 5;
        
        boolean prime = true;
        int i = 2;
        while(i*i <= n) { //10
            if(n%i==0) {
                prime = false;
                break;
            }
            i++;
        }
        if(prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    
    }
}
