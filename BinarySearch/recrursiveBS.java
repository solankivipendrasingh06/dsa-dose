public class recrursiveBS {
    public static int recursiveOne(int arr[],int target,int start,int end){
        //base case
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] > target){
            return recursiveOne(arr,target,start,mid-1);
        }
        if(arr[mid] < target){
            return recursiveOne(arr,target,mid+1,end);
        }
        return mid;
    }
    public static void main(String args[]){
        int arr[] = {3,4,5,7,9,11,13,19};
        int target = 13;
        System.out.print(recursiveOne(arr,target,0,arr.length -1 )+" ");
    }
}
