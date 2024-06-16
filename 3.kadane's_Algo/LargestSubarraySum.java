public class LargestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, -3, 8, -10, 3, 4};
        int result = 0, current = 0;

        System.out.println("-----------------------------------");
        System.out.println("Brute Force Approach:");

        for (int i = 0; i < arr.length; i++) {
            current = 0;
            for (int j = i; j < arr.length; j++) {
                current += arr[j];
                if (current > result)
                    result = current;
            }
        }
        System.out.println("Largest sum of Subarray: " + result);
        System.out.println("Time complexity : O(n^2)");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Optimize approach:");

        int maxSum = arr[0], curr = arr[0], start = 0, end = 0, start1 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (curr + arr[i] < arr[i]) {
                curr = arr[i];
                start = i;
            } else {
                curr += arr[i];
            }
            if (curr > maxSum) {
                maxSum = curr;
                start1 = start;
                end = i;
            }
        }
        System.out.println("Largest sum of Subarray: " + maxSum);
        System.out.println("Time complexity : O(n)");
        System.out.println("------------------------------------");

        System.out.println("Suppose There are tells to find indices of subarray:");
        System.out.println("(" + start1 + "," + end + ")");
    }
}
