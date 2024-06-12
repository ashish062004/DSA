public class Pattern {
    public static void main(String[] args) {
        //simple star pattern 1
        p1(5);
        System.out.println();
        //simple star patter 2
        p2(5);
        System.out.println();
        //simple star patter 3
        p3(5);
        System.out.println();
        //simple number patter 1
        p4(5);
        System.out.println();
        //star pattern 4
        p5(5);
        System.out.println();
        //star pattern 5
        p6(5);
        System.out.println();
        //star pattern 6
        p7(5);
        System.out.println();
        //star pattern 7
        p8(5);
        System.out.println();
        //star pattern 8
        p9(5);
        System.out.println();
        //star pattern 9
        p10(5);
        System.out.println();
        //star pattern 10
        p11(5);
        System.out.println();
        //star pattern 11
        p12(5);
        System.out.println();
        //star pattern 12
        p13(5);
        System.out.println();
        //star pattern 13
        p14(5);
        System.out.println();
        //star pattern 14
        p15(5);
    }

    public static void p1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void p2(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void p3(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void p4(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++)
                System.out.print((j+1) + " ");
            System.out.println();
        }
    }

    public static void p5(int n){
        for(int i=1; i<2*n; i++){
            int k = i <= n ? i : (2*n - i) ;
            for(int j=0; j<k; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void p6(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");

            for(int k=0; k<i; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void p7(int n){
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++)
                System.out.print(" ");

            for(int j=0; j<n-i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void p8(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");
            for(int k=0; k<2*i-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void p9(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++)
                System.out.print(" ");
            for(int k=2*(n-i); k>=0; k--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void p10(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");

            for(int k=0; k<i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void p11(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++)
                System.out.print(" ");

            for(int k=0; k<=n-i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void p12(int n){
        for(int i=1; i<=2*n; i++){
            int a = i <= n ? i : (2*n-i) + 1;
            for(int j=1; j<a; j++)
                System.out.print(" ");

            int b = i <= n ? n+1-i : i-n;
            for(int k=0; k<b; k++)
                System.out.print("* ");

            System.out.println();
        }
    }

    public static void p13(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print(" ");

            for(int k=0; k<(2*i)-1; k++)
                if (k == 0 || k == (2 * i) - 2 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
    
            System.out.println();
        }
    }

    public static void p14(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++)
                System.out.print(" ");

            for(int k=2*(n-i); k>=0; k--)
                if (k == 0 || k == 2*(n-i) || i == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
    
            System.out.println();
        }
    }

    public static void p15(int n){
        for(int i=1; i<2*n; i++){
            int a = i<=n ? n-i : i-n; 
            for(int j=1; j<=a; j++)
                System.out.print(" ");

            int b = i<=n ? 2*i-1 : 2*(2*n-i)-1;
            for(int k=0; k<b; k++)
                if (k == 0 || k == b-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
    
            System.out.println();
        }
    }

}
