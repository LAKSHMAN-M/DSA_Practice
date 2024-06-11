package slidingWindow;

public class Introduction_to_SW {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 10, 2, 3, 4, 89};
        int k = 5;
    }
//    https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
//    https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/discuss/803353/java-solution-with-detailed-explanation
    static void constantWindow(int arr[], int k) {
        int maxi = 0;
//        int initial_sum = 0;
        for (int i = 0; i < k; i++) {
//            initial_sum += arr[i];
            maxi += arr[i];
        }
//        maxi = Math.max(initial_sum, maxi);

        int l = 0, r = k - 1;
        int sum = maxi;
        while (r < arr.length - 1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxi = Math.max(maxi, sum);
        }
        System.out.println(maxi);

    }

    static void longestSubArrayWithSumLessThanOrEqualToK(int[] arr, int k) {
//        1. Expand - r
//        2. Shrink - l
//        repeat this till under the given condition

        int l = 0, r = 0;
        int maxCount = 0;
        long sum = 0;
        while(r<arr.length){
            sum += arr[r];

            while(sum>k) sum -= arr[l++];

            if(sum == k)maxCount++;
            r++;
        }
        System.out.println(maxCount);
    }
}
