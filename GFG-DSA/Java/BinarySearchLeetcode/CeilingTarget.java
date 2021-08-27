class CeilingTarget{
    public static void main(String[] args){
        int[] array = {2,4,6,10,15,20,29};
        int target =28;
        int index = ceiling(array, target);
        System.out.println("The index of the target is: " + index);
    }

    static int ceiling(int[] array, int key){

        if(key > array[array.length - 1]  || key < array[0]){
            return -1;
        }

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
        return start;

    }
}