import java.util.Arrays;

public class aggressiveCow {

    public static int aggressiveCoww(int arr[], int cows) {

        Arrays.sort(arr);

        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(arr, cows, mid)) {
                ans = mid;
                low = mid + 1;   // try bigger distance
            } else {
                high = mid - 1; // reduce distance
            }
        }

        return ans;
    }

    public static boolean canPlace(int arr[], int cows, int dist) {

        int count = 1;          // first cow at first stall
        int last = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - last >= dist) {
                count++;
                last = arr[i];
            }

            if (count == cows) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int arr[] = {1,2,4,8,9};
        int cows = 3;

        System.out.print(aggressiveCoww(arr, cows));
    }
}
