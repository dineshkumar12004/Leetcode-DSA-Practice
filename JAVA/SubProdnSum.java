package JAVA;

class SubProdnSum {
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int temp;
        int sum = 0;
        int pro = 1;
        while (n > 0) {
            temp = n % 10;
            pro *= temp;
            sum += temp;
            n /= 10;
        }
        return pro - sum;
    }
}