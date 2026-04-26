public class findPeak {

    public static int peak(int arr[]) {

        int n = arr.length;

        // only one element
        if (n == 1) {
            return 0;
        }

        // first element peak
        if (arr[0] > arr[1]) {
            return 0;
        }

        // last element peak
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // peak found
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // move right
            else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            // move left
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 5, 4, 6, 7};

        int index = peak(arr);

        System.out.println("Peak Index = " + index);
        System.out.println("Peak Value = " + arr[index]);
    }
}
