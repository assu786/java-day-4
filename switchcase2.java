import java.util.*;
class Bo
{
    public static void main(String args[])
    {
        Scanner b=new Scanner (System.in);
        int day=b.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }
}