//469A
import java.util.*;
public class gamelevels 
{
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        boolean a[]=new boolean[n+1];
        //little x levels
        int x=so.nextInt();
        int lilx[]=new int[x];
        for(int i=0;i<x;i++)
        {
            lilx[i]=so.nextInt();
        }
        //little y levels
        int y=so.nextInt();
        int lily[]=new int[y];
         for(int i=0;i<y;i++)
        {
            lily[i]=so.nextInt();
        }
        //initialising all levels to false
        for(int i=1;i<n+1;i++)
        {
            a[i]=false;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<x;j++)
            {
                a[lilx[j]]=true;
            }
             for(int j=0;j<y;j++)
            {
                a[lily[j]]=true;
            }
        }
        boolean f=true;
        for(int i=1;i<n+1;i++)
        {
            if(a[i]==false)
                f=false;
        }
        if(f==true)
        {
        System.out.println( "I become the guy.");
        }
        else
        {
            System.out.println("Oh, my keyboard!");
        }
        so.close();
    
}
}
