import java.util.*;
class N 
{
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        int x=m.nextInt();
        for(int i=0;i<x;i++)
        {
            int a=m.nextInt();
            for(int j=1;j<a;j++)
            {
                if(a%j==0)
                {
                System.out.print(j+" ");
                }
            }
            System.out.println( );
        }
    }
}