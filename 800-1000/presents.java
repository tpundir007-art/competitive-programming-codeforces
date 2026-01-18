//136A
import java.util.*;
public class presents 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        int arr[]=new int[n+1];
        for(int i=1;i<n+1;i++)
        {
            arr[so.nextInt()]=i;
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        so.close();
        
    }
    
}
