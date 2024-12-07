/*
* * * * * * * 
      *       
      *       
      *       
      *       
      *       
* * * * * * * 
*/
public class PatternforI{
    public static void main(String[]args){
        int n=7;
        if(n%2==0)
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(i==n-1||i==0||j==n/2)
                System.out.print("*"+" ");
                else{
                    System.out.print(" "+" ");
                }

                }
                System.out.println();
            }
        }
    }
