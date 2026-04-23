package array;

//product of array except self
public class prodExceptSelf{
    public static int[] pro(int arr[]){
        int n = arr.length;
        int result[] = new int[n];
        
        result[0] = 1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1]* arr[i-1] ;
        }
        int rightproduct = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = rightproduct * result[i];
            rightproduct *= arr[i];
        }
        return result;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int output[] = pro(arr);
        for(int x : output){
            System.out.print(x+" ");
        }
    }
}