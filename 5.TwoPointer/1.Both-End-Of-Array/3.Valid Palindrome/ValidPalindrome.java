public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int l=0,r=s.length()-1;
        boolean res = true;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else{
                if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                    res = false;
                    break;
                }
                l++;
                r--;
            }
        }
        System.out.println(res);
}
}