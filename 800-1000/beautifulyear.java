//271A... we first check if all the digits of year are distinct or else increment it and check further
//this program is based on brute force
import java.util.*;
public class beautifulyear 
{
    public static void main(String[] args) 
    {
        Scanner so= new Scanner(System.in);
        int year=so.nextInt();
        int y=++year;
        while(true)
        {
            int t=y;
            int a=t%10;
            t=t/10;
            int b=t%10;
            t=t/10;
            int c=t%10;
            t=t/10;
            int d=t%10;
            t=t/10;
            if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d)
            {
                System.out.println(y);
                break;
            }

            else
                y++;
        }
        so.close();
        
    }
    
}
