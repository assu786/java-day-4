import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int flag=0;
        if (a>=18)
        flag=1;
        switch(flag)
        {
            case 1:
                System.out.println("eligibal");
                break;
                case 0:
                    System.out.println("not eligible");
                    break;
        }
    }
}