//160 a using greedy technique
import java.util.*;
public class coins 
{
    public static void main(String[] args) 
    {
        Scanner so = new Scanner(System.in);
        int n=so.nextInt();//number of coins
        int a[]=new int[n];
        int tot=0;
        for(int i=0;i<n;i++)
        {
            a[i]=so.nextInt();//input the values of coins 
            tot+=a[i];
        }
        Arrays.sort(a);
        int sum=0;
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=a[i];
            c++;
            if(sum>tot-sum)
                break;
        }
        System.out.println(c);
        so.close();

    }
    
}
