import java.util.*;
//1473A
public class replacingelements 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int t=so.nextInt();
        while(t-->0){
        int n=so.nextInt();
        int d=so.nextInt();
        int a []=new int[n];

        for(int i=0;i<n;i++)
            a[i]=so.nextInt();
        Arrays.sort(a);
        if(a[n-1]<=d)
            System.out.println("YES");
        else if(a[0]+a[1]<=d)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
        so.close();
    }
    
}
