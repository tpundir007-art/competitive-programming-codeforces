//https://codeforces.com/contest/2185/problem/B
import java.util.*;
public class maximumprefix 
{
public static void main(String[] args) {
    Scanner so=new Scanner(System.in);
    int t=so.nextInt();
    while(t-->0)
    {
        int n=so.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {   

            a[i]=so.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        System.out.println(max*n);
        so.close();
    }
}

}
