//either worst or best relative to prev performances..strictly less or strictly more points for the coder 
//155A
//https://codeforces.com/problemset/problem/155/A
import java.util.*;
public class amazing 
{
    public static void main(String[] args)
    {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();
        int arr[]=new int[n];
        int c=0;//counter variable
        for(int i=0;i<n;i++)
            arr[i]=so.nextInt();
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            
            if(arr[i]>max){
                c++;
                max=arr[i];
            }
            else if(arr[i]<min){
                c++;
                min=arr[i];
            }
        }
        System.out.println(c);

        so.close();
    }
    
}
