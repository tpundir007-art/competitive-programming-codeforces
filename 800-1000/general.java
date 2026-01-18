//144A
import java.util.*;
public class general 
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
        int min=arr[0];
        int max=arr[0];
        int mxin=0;
        int mnin=0;
        // since we want the max on the first and min on last
        // check for the first maxima on the array to have least swaps..i.e leftmost
        // and for minima.. check for rightmost oneee
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                mxin=i;
                max=arr[i];
            }
            if(arr[i]<=min)
            {
                mnin=i;
                min=arr[i];
            }
        }
        //this prevents overcounting..cz at some point of array..in some cases..
        //max and min would come adjacent to each other
        int swap=mxin+(n-1-mnin);
        if(mxin>mnin)
        {
            swap--;
        }
        System.out.println(swap);
        so.close();
        
    }
    
}
