public class basicBS {
    public static int binary(int arr[],int target){
        int start = 0 ;
        int end = arr.length - 1 ;
        while(start <= end){
            int mid = start +(end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {3,4,6,7,9,11,13,15,17};
        int target = 3;
        System.out.print(binary(arr,target)+" ");
    }
}
    