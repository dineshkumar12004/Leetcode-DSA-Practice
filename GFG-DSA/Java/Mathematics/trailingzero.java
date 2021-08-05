class Main {
  public static void main(String[] args) {
    System.out.println(countZero(10));
    
  }

  public static int countZero(int n){
    int res = 0;
    for(int i=5;i<=n;i = i*5){
      res += n/i;
    }
    return res;
  }
}