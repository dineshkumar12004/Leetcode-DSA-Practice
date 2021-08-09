public class power {
    public static void main(String[] args) {
        powerset("abc");

    }

    public static void powerset(String s) {
        int n = s.length();
        int powsize = (int) Math.pow(2,n);
        for(int counter = 0;counter < powsize;counter++){
            for(int j=0;j<n;j++){
                if((counter & (1 << j)) != 0){
                    System.out.println(s.charAt(j));
                }
                
            }
            System.out.println();
        }
        

        
    }
}
