import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3,3};
        int window = 3;
        boolean result = false;
        for (int i = 0; i < arr.length; i++){
            for(int j=i+1; j < Math.min(i+window,arr.length); j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+" == "+arr[j]+"   indces "+i+" "+(j));
                    result = true;
                    break;
                }
            }
            if(result == true) break;
        }
        System.out.println(result);

        System.out.println("----------------------------------");
        System.out.println("Optimal Approach");

        ArrayList<Integer> li = new ArrayList<>();
        int l=0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(l+i+1 > window){
                li.removeFirst();
                l++;
            }
            if(li.contains(arr[i])){
                flag = true;
                break;
            }
            li.add(arr[i]);
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
