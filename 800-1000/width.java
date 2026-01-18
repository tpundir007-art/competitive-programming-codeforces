//677 A
import java.util.*;
public class width 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        int h=so.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=so.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]>h)
                c++;
        }
        //we subtract number of tall people and calculate width for them by *2
        int w=(n-c)*1+c*2;
        System.out.println(w);
        so.close();
    }
    
}
