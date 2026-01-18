//467A
import java.util.*;
public class room 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int flag=0;// counts number of rooms available for george and alex
        int t=so.nextInt();//testcases i.e number of rooms
        while(t>0)
        {
            int e=so.nextInt();// people who already equipped
            int c=so.nextInt();//capacity of room
            
            if((c-e)>=2)
            {
                flag++;
            }
            t--;
        }
        System.out.println(flag);
        so.close();        
    }
    
}
