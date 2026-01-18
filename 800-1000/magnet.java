//344A
//core idea:- if a[i] is not equal to a[i+1] then one group is formed

import java.util.Scanner;

public class magnet
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=so.nextInt();
        }
        int c=1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                c++;
            }
            else
                continue;
        }
        System.out.println(c);
        so.close();    
    }
    
}
