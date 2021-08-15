public class MaxWealth {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{2,4,5},{9,4,1}};
        System.out.println(maxWealth(matrix));
    }

    public static int maxWealth(int[][] accounts) {
        //person = row
        //account = column
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;

    }
}
