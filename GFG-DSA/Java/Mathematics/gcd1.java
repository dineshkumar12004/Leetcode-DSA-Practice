class gcd1 {
  public static void main(String[] args) {
    System.out.println("GCD of 2 numbers");
    System.out.println(gcd(100,200));
  }

  public static int gcd(int a, int b){
    
    if(b==0){
      return a;
    }
    else{
      return gcd(b,a%b);
    }


  }
}