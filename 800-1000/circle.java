//157B..finding the area that is red on the painting
//https://codeforces.com/contest/157/problem/B
import java.util.*;
public class circle 
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
        Arrays.sort(arr);
        double area=0;
        boolean red=true;
        for(int i=n-1;i>=0;i--)
        {
            if(red)
            {
                area+=arr[i]*arr[i];
            }
            else{
                area-=arr[i]*arr[i];
            }
            red=!red;

        }
        so.close();
        System.out.println(area*Math.PI);
        
        
    }
  
}
