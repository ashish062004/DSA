/**
 * FindLengthTargeted
 */
public class FindLengthTargeted {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 6;
        int l=0,len=0,sum=0;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[l]+arr[i];
            if(sum >= target ){
                if(len > i-l+1) len = i-l+1;
                l++;
            }
                
        }
        System.out.println(len);
    }
}