//determine how many days will be taken to read the book 
// 139A
import java.util.*;
public class book 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();//no of pages
        int pg[]=new int[7];
        for(int i=0;i<7;i++)
        pg[i]=so.nextInt();
        int d=0; 
        while(n>0)
        {
             n-=pg[d%7];
              d++;
            }
        
        int dayOfWeek = d % 7;
        if (dayOfWeek == 0) dayOfWeek = 7;
        
        System.out.println(dayOfWeek);
        so.close();
    }
    
}