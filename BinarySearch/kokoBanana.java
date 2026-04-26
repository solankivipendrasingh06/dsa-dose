public class kokoBanana{
    public static int banana(int arr[],int hour){
        int low = 1;
        int high = max(arr);
        while(low <= high){
            int mid = low+(high-low)/2;
            int thour = totalhours(arr,mid);
            if(thour>hour){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
    public static int totalhours(int arr[],int speed){
        int totalhour = 0;
        for(int i=0;i<arr.length;i++){
            totalhour += (int)Math.ceil((double)arr[i]/speed);
        }
        return totalhour;
    }
    public static int max(int arr[]){
        int max = arr[0];
        for(int x : arr){
            if( x > max){
                max = x;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {3,4,6,11};
        int hour = 8;
        System.out.print(banana(arr,hour));
    }
}