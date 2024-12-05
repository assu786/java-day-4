import java.util.*;
class Zoo
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
        int x=b.nextInt();
        for(int i=0;i<x;i++)
        {
            int a=b.nextInt();
            if((a&7)==0)
            {
                System.out.println("multiple of 8");
            }
            else
            {
                System.out.println("not a multiple of 8");
            }
        }    
    }
}