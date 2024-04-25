public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 18;
        
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r] == target)
                break;
            else if(arr[l]+arr[r] > target)
                r--;
            else
                l++;
        }
        System.out.println("("+(l+1)+","+(r+1)+")");
    }
}