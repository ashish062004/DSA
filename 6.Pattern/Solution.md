### stretagy :
- number of line consider as outer loop (no. of rows)
- for inner loop we print symbol or spaces

#### Pattern Questions:

```text
1.  * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
```
```java
for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++)
        System.out.print("* ");
    //for new line
    System.out.println();
  }
```

```text
2.  *
    * *
    * * *
    * * * *
    * * * * *
```
```java
for(int i=1; i<=n; i++){
    for(int j=0; j<i; j++)
        System.out.print("* ");
    System.out.println();
}  
```

```text
3.  *****
    ****
    ***
    **
    *
```
```java
for(int i=1; i<=n; i++){
    for(int j=i; j<=n; j++)
        System.out.print("* ");
    System.out.println();
}  
```

```text
4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
```
```java
for(int i=1; i<=n; i++){
    for(int j=0; j<i; j++)
        System.out.print((j+1) + " ");
    System.out.println();
} 
```

```text
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
```
```java
for(int i=1; i<2*n; i++){
    int k = i <= n ? i : (2*n - i) ;
    for(int j=0; j<k; j++)
        System.out.print("* ");
    System.out.println();
}  
```

```text
6.       *
        **
       ***
      ****
     *****
```
```java
for(int i=1; i<=n; i++){
    //this is for printng blank spaces
    for(int j=0; j<n-i; j++)
        System.out.print(" ");

    for(int k=0; k<i; k++)
        System.out.print("*");

    System.out.println();
} 
```

```text
7.   *****
      ****
       ***
        **
         *
```
```java
for(int i=0; i<n; i++){
    for(int k=0; k<i; k++)
        System.out.print(" ");

    for(int j=0; j<n-i; j++)
        System.out.print("*");
    
    System.out.println();
}  
```

```text
8.      *
       ***
      *****
     *******
    *********
```
```java
for(int i=1; i<=n; i++){
    for(int j=0; j<n-i; j++)
        System.out.print(" ");
            
    for(int k=0; k<2*i-1; k++)
        System.out.print("*");
    
    System.out.println();
}
```

```text
9.  *********
     *******
      *****
       ***
        *
```
```java
for(int i=1; i<=n; i++){
    for(int j=1; j<i; j++)
        System.out.print(" ");
            
    for(int k=2*(n-i); k>=0; k--)
        System.out.print("*");
    
    System.out.println();
}  
```

```text
10.      *
        * *
       * * *
      * * * *
     * * * * *
```
```java
for(int i=1; i<=n; i++){
    for(int j=0; j<n-i; j++)
        System.out.print(" ");

    for(int k=0; k<i; k++)
        System.out.print("* ");
    
    System.out.println();
} 
```

```text
11.  * * * * *
      * * * *
       * * *
        * *
         *
```
```java
for(int i=1; i<=n; i++){
    for(int j=1; j<i; j++)
        System.out.print(" ");

    for(int k=0; k<=n-i; k++)
        System.out.print("* ");
    
    System.out.println();
}
```

```text
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
```
```java
for(int i=1; i<=2*n; i++){
    int a = i <= n ? i : (2*n-i) + 1;
    for(int j=1; j<a; j++)
        System.out.print(" ");

    int b = i <= n ? n+1-i : i-n;
    for(int k=0; k<b; k++)
        System.out.print("* ");

    System.out.println();
}
```

```text
13.      *
        * *
       *   *
      *     *
     *********
```
```java
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
```

```text
14.  *********
      *     *
       *   *
        * *
         *
```
```java
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
```

```text
15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
```
```java
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
```