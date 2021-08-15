import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,24,30},{2,3,4},{5,6,7}};
        int key = 6;
        int[] ans = search(arr, key);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int key) {
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==key){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    
}
