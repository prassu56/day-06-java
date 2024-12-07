import java.util.*;
public class Staticarrayprgm{
    public static void main(String[]args){
        //initialization of an array
        int arr[]={22,44,565,789,200};
        System.out.println(Arrays.toString(arr));
        //Accessing of array elements
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //modifications of an array
        arr[2]=456;
        arr[3]=345;
         System.out.println(Arrays.toString(arr));
    }
}