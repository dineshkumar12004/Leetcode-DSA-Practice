class gcd {
  public static void main(String[] args) {
    System.out.println("GCD of 2 numbers");
    System.out.println(gcd(25,15));
  }

  public static int gcd(int a, int b){
    int res = Math.min(a,b);
    while(res > 0){
      if(a%res == 0 && b%res == 0){
        break;
      }
      res--;
    }
    return res;
  }
}