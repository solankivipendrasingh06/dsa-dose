public class buynselll{
    public static int buynsell(int arr[]){
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < buyprice){
                buyprice = arr[i];
            }
            profit = arr[i] - buyprice;
            if(maxprofit < profit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int arr[] = {11,3,1,5,6,7,11,9};
        System.out.print(buynsell(arr));
    }
}



/*
Another way of doing this 
using prefix sum 
storing minimum value till index i
then subtract it after finding max profit


public class hao{
    public static int buynsell(int arr[]){
        int n = arr.length;
        int min[] = new int[n];
        min[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            min[i] = Math.min(arr[i],min[i-1]);
        }
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            profit = Math.max(arr[i] - min[i],profit);
        }
        return profit;
    }
    public static void main(String args[]){
        int arr[] = {5,3,1,6,7,8,9};
        System.out.print(buynsell(arr)+" ");
    }
}
 */