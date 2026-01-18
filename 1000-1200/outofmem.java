//https://codeforces.com/contest/2185/problem/D
import java.util.*;
public class outofmem {
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int t=so.nextInt();
        while(t-->0)
        {
            int n=so.nextInt();
            int m=so.nextInt();
            int h=so.nextInt();
            long a[]=new long[n];
            long x[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=so.nextLong();
                x[i]=a[i];
            }

            for(int i=0;i<m;i++)
            {
                int b = so.nextInt() - 1;
                long c = so.nextLong();

                x[b] += c;

                if (x[b] > h) {
                    
                    System.arraycopy(a, 0, x, 0, n);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (long i:x ) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
            so.close();
        }
    }
}
            
        
