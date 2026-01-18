//149A..petya needs to water flowers.
//https://codeforces.com/contest/149/problem/A
import java.util.*;
public class flowerwater 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int k=so.nextInt();//deadline length of flower
        int a[]=new int[12];
        for(int i=0;i<12;i++)
        {
            a[i]=so.nextInt();
        }
        Arrays.sort(a);
        int csum=0;
        int c=0;
          if(k==0)
            {
                System.out.println("0");
                return;
            }
        for(int i=11;i>=0;i--)
        {   
          
            csum+=a[i];
            c++;
            if(csum>=k)
            {
                System.out.println(c);
                return;
                
            }
            
            
        }
        System.out.println(-1);

    so.close();
    }
    
}
