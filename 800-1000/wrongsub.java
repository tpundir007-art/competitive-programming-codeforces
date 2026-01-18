//wrong subtractions
//if last digit=0 then divide by 10
//else -1 only 977A
import java.util.*;
public class wrongsub 
{
    public static void main(String[] args) 
    {
        Scanner so= new Scanner(System.in);
        int n=so.nextInt();
        int k=so.nextInt();
        while(k>0)
        {
            if(n%10==0)
            {
                n/=10;
            }
            else
            {
                n-=1;
            }
            k--;
        }
        System.out.println(n);


        so.close();
        
    }
}
