public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Star Patter-1");
        starPattern1(5);   
        System.out.println();
        System.out.println("Star pattern-2");
        starPattern2(5);
        System.out.println();
        System.out.println("Number pattern-1");
        NumberPattern1(5);
        System.out.println();
        System.out.println("Star pattern-3");
        starPattern3(5);

    }
    public static void starPattern1(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void starPattern2(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void starPattern3(int n){
        for (int i = 1; i <= 2*n; i++){
            int t = i>5 ? (2*n - i)  : i ;
           // System.out.println(t);
            for (int j = 0; j < t; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void NumberPattern1(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}