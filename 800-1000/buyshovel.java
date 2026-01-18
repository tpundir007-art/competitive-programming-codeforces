//732A..
// basically find the no of shovels such that last digit of total price is either the spare coin or 0
import java.util.*;
public class buyshovel 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int p=so.nextInt();//price of one shovel
        int c=so.nextInt();
        int f=1;
        int n=1;
        while(true)
        {
            int rem=(p*f)%10;
            if(rem==c|| rem==0){
                n=f;
                break;
            }
            f++;
        }
        System.out.println(n);
        so.close();
        
    }
}
