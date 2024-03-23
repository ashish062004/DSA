### Here rotate a array in left of side and right of side

#### TO solve this kind of problem have 3 steps:   
  
    
    Step-1:
    Store no. of steps elements into temporary array, if given steps is greater than length of array then module given steps by length of array
      
    Step-2:
    Now rotate remaining elements into given steps

    Step-3:
    Atlast store that given temporary array elements into appropriate place,
    Left rotate  --> stores into end of array
    Right rotate --> stores into start of array  
  
  
#### Code :
```java
public static void leftRotate(int[] arr,int steps){
        int d = steps%arr.length;
        int[] temp = new int[d];
        //step-1
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
        //step-2
        for (int i = 0; i < arr.length - d; i++) 
            arr[i] = arr[i+d];
        //step-3
        for (int i = 0; i < d; i++)
            arr[arr.length-d+i] = temp[i];
    }


    public static void rightRotate(int[] arr,int steps){
        int d = steps%arr.length;
        int[] temp = new int[d];
        //step-1
        for (int i = 0; i < d; i++)
            temp[i] = arr[i+arr.length-d];
        //step-2
        for (int i = arr.length-1; i >= d; i--) 
            arr[i] = arr[i-d];
        //step-3
        for (int i = 0; i < d; i++)
            arr[i] = temp[i];
    }
```   