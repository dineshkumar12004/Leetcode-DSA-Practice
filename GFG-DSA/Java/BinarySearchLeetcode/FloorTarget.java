public class FloorTarget {
    public static void main(String[] args){
        int[] array = {2,4,6,10,15,20,29};
        int target =14;
        int index = ceiling(array, target);
        System.out.println("The index of the target is: " + index);
    }

    static int ceiling(int[] array, int key){

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
        return end;

    }
}
