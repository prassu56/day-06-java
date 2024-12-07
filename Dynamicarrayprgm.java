import java.util.*;
public class Dynamicarrayprgm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
        //if we keep this system.out.println out of for loop we get output as{10,20,40}
        System.out.println("array with continuation");
         System.out.println(Arrays.toString(arr));
    }
}