public class FindSameElement {
    public static void main(String[] args) {
        int[] arr = {4,2,2,2,3,3};
        int l=0,len=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[l] != arr[i])
                l=i;
            else
                if(len < i-l+1) len = i-l+1;
        }
        System.out.println(len);
    }
}
