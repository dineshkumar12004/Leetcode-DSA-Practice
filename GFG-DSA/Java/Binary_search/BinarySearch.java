class BinarySearch{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 2;
        int index = binarySearch(array, target);
        System.out.println("The index of the target is: " + index);
    }

    static int binarySearch(int[] array, int key){
        int start = 0; //0
        int end = array.length - 1; //9
        
        while(start <= end){//0<=9
            int mid = start + (end - start)/2;//4
            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
}