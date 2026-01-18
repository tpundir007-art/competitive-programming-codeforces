//this program determines number of players who greater or equal score to a particular score of a contestant 
// 158A
import java.util.*;
public class greater
{    public static void main(String[] args) 
    { 
    Scanner so=new Scanner(System.in);
    int n=so.nextInt();
    int k=so.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=so.nextInt();
         
    }
    int c=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>=arr[k-1]&& arr[i]>0)
        {
            c++;
        }
    }
    System.out.println(c);
    so.close();
  }
}