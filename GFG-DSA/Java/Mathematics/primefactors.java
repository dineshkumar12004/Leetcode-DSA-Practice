class primefactors{
  public static void main(String[] args){
    primefactor(12);
  }
  
  public static void primefactor(int n){
    for(int i=2;i<n;i++){
      if(isprime(i)){
        int x =i;
        while(n%x == 0){
          System.out.println(i);
          x = x*i;
        }
      }
      
    }
    
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