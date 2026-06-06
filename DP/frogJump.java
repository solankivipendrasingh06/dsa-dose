public class frogJump{
    public static int frog(int height[],int n,int k){
        int dp[] = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            int maxSteps = Integer.MAX_VALUE;
            for(int j =1;j<=k;j++){
                if(i-j>=0){
                    int step =dp[i-j]+Math.abs(height[i]-height[i-j]);
                    maxSteps = Math.min(step,maxSteps);
                }
            }
            dp[i] = maxSteps;
        }
        return dp[n-1];
    }
    public static void main(String args[]){
        int height[] = {10, 40, 30, 30,10};
        int n = height.length;
        int k = 2;
        System.out.print(frog(height,n,k));
    }
}