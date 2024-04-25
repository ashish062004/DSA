public class ReverseVowel {
    public static void main(String[] args) {
        String s = "hello";
        char[] str = s.toCharArray();
        String vowel = "AEIOUaeiou";
        int l=0,r=str.length-1;

        while(l<r){
            if(vowel.indexOf(str[l]) == -1)
                l++;
            else if(vowel.indexOf(str[r]) == -1)
                r--;
            else{
                char t = str[l];
                str[l] = str[r];
                str[r] = t;

                l++;
                r--;
            }
        }
        System.out.println(new String(str));
        
    }
}