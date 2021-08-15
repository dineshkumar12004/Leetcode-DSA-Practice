public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        System.out.println(search(array, target,2,8));
        
    }

    static int search(int[] array, int target, int start, int end) {
        if (array.length == 0) {
            return -1;
        }


        for(int index = start; index <= end; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
