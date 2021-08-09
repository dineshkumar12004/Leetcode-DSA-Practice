class odd{
    public static void main(String[] args) {
        int  a[]= new int[3];
        a[0] = 8;
        a[1] = 7;
        a[2] = 8;
        System.err.println(findodd(a,3));
    }
    
    public static int findodd(int arr[],int n) {
        int res = 0;
        for(int i=0;i<n;i++){
            res = res ^ arr[i];
        }
        return res;
    }
}