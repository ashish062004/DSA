public class LargestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,-3,8,-10,3,4};
        int result = 0, current = 0;

        System.out.println("-----------------------------------");
        System.out.println("Brute Force Approach:");
        
        for(int i=0; i<arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                current +=arr[j];
                if(current > result)
                    result = current;
            }
            current = 0;
        }
        System.out.println("Largest sum of Subarray: "+result);
        System.out.println("Time complexity : O(n^2)");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Optimize approach:");
        int maxSum = arr[0],curr=0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if(curr < 0 ) curr = 0;
            if(curr > maxSum)
                maxSum = curr;
        }
        System.out.println("Largest sum of Subarray: "+maxSum);
        System.out.println("Time complexity : O(n)");
        System.out.println("------------------------------------");

        System.out.println("Suppose There are tells to find indices of subarray:");
        int maxSum2 = 0, curr2 = 0,resL=0,resR=0,l=0;
        for(int i=0;i<arr.length; i++){
            if(curr2 < 0){
                curr2 = 0;
                l=i;
            }
            curr2 += arr[i];
            if(curr2 > maxSum2){
                maxSum2 = curr2;
                resL = l;
                resR = i;
            }
        }
        System.out.println("("+resL+","+resR+")");

    }
}