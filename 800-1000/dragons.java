//148A
import java.util.*;
public class dragons 
{
    public static void main(String[] args)
    {
        Scanner so=new Scanner(System.in);
        int k=so.nextInt();
        int l=so.nextInt();
        int m=so.nextInt();
        int n=so.nextInt();
        int d=so.nextInt();
        boolean a[]=new boolean[d+1];
        for(int i=1;i<=d;i++)
        {
            a[i]=true;
        }
        int c=0;
        for(int i=1;i<d+1;i++)
        {
            if(i%k==0||i%l==0||i%m==0||i%n==0)
            {
                a[i]=false;
                c++;
            }
        }
        System.out.println(c);
        so.close();
        
    }
    
}
