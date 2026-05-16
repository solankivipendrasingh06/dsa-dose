public class sortedRotatedDupli {
    public static int rotated(int arr[],int target){
        int low = 0;
        int end = arr.length-1;
        while(low<=end){
            int mid = low+(end-low)/2;

            if(arr[low] == arr[mid] && arr[mid] == arr[end]){
                low++;
                end--;
            }
            
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && arr[mid]<target){
                    low = mid + 1;
                }else{
                    end = mid-1;
                }
            }
            else{
                if(arr[end] < target && arr[mid]<target){
                    end = mid+1;
                }else{
                    low = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){ 
        int arr[] = {2,2,2,0,1};
        int target = 0;
        System.out.println(rotated(arr,target)+" ");
    }   
}
