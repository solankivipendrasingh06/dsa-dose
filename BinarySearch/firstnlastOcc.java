//first andlast occurance
public class firstnlastOcc{
    public static int firstOne(int arr[],int x){
        int first = 0;
        int last = arr.length-1;
        int ans = -1;
        while(first <= last){
            int mid = first + (last-first);
            if(arr[mid] == x){
                ans = mid;
                last = mid-1;
            }
            else if(arr[mid] > x){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return ans;
    }
    public static int lastOne(int arr[],int x){
        int first = 0;
        int last = arr.length -1;
        int ans = -1;
        while(first <= last){
            int mid = first+(last-first) / 2;
            if(arr[mid] == x){
                ans = mid;
                first = mid+1;
            }
            else if(arr[mid] < x){
                first = mid +1;
            }else{
                last = mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,2,2,2,3,4,5,5,5,5};
        int x = 2;
        System.out.print(firstOne(arr,x)+" ");
        System.out.print(lastOne(arr,x)+" ");
    }
}