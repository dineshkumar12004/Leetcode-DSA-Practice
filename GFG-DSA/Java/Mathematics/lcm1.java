class lcm1{

  public static void main(String[] args) {
    System.out.println("lcm of 2 numbers");
    System.out.println(lcm(4,6));

  }

  public static int gcd(int a, int b){
    
    if(b==0){
      return a;
    }
    else{
      return gcd(b,a%b);
    }
  }

  public static int lcm(int a,int b){
    return (a*b)/gcd(a,b);
  }

}



