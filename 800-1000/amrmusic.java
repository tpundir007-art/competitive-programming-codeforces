//507A
//my idea rn--might change- so basically sorting this array..and trying fit maximum of the minimum days-
// (cuz be greedy)
//YAHH SO THIS LOGIC ISNOT CORRECTTT...ASK ABOUT THISS!
import java.util.*;

public class amrmusic 
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int n=so.nextInt();//instruments
        int k=so.nextInt();//free days
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=so.nextInt();
        int csum=0;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            csum+=a[i];
            if(csum>k){
                System.out.println("0");
                break;
            }
            else
            {
                
                System.out.print(a[i]+" ");
            }
        }
        so.close();
        
    }
    
}
