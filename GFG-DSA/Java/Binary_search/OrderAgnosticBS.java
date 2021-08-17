public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 7;
        int result = OrderAgnosticbs(arr, target);
        System.out.println(result);

    }

    static int OrderAgnosticbs(int[] array,int target){
        int start = 0;
        int end = array.length - 1;
        // find whether the array is sorted in ascending order
        boolean isAscending = array[start] <= array[end];

        while(start <= end){//0<=9
            int mid = start + (end - start)/2;//4
            if(array[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target < array[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target > array[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
