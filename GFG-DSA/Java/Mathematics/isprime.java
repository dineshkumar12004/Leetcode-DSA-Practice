class isprime{
  public static void main(String[] args){
    System.out.println(isprime(17));
  }


  public static boolean isprime(int n){
    if(n==1){
      return false;
    }
    for(int i = 2; i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  

}