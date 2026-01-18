//https://codeforces.com/contest/2185/problem/C
import java.util.*;
public class mex 
{
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int t=so.nextInt();
        while(t-->0)
        {
            int n=so.nextInt();
            int a[]=new int[n];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=so.nextInt();
                min=Math.min(a[i],min);

            }
            for(int i=0;i<n;i++)
            {
                a[i]-=min;
            }
            Arrays.sort(a);
            int m=0;
            //finding the least positive number available that is not present in the array
            for(int i=0;i<n;i++)
            {
                if(a[i]==m)
                    m++;
            }
            System.out.println(m);
            so.close();

        }
    }
    
}
