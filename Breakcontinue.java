public class Breakcontinue{
    public static void main(String[]args){
        System.out.println("break example");
        for(int i=0;i<5;i++)
        {
            if(i==2)
            break;
            System.out.println(i);
        }
         System.out.println("continue example");
         for(int i=0;i<5;i++)
         {
            if(i==2)
            continue;
             System.out.println(i);
         }

        }
    }
