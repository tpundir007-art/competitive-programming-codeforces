import java.util.*;
//381A
public class serejaanddima 
{
    public static void main(String[] args) 
    {
        Scanner so= new Scanner(System.in);
        int n=so.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
           arr[i]=so.nextInt();

        int s=0;
        int d=0;
        int l=0;
        int r=n-1;
        boolean t=true;//we initialise this flag var.. and give first chance to seerja
        int c=0;
        for(int i=0;i<n;i++)
        {
            while(l<=r)
            {
                
                if(arr[l]>=arr[r])
                {
                    c=arr[l++];
                }
                else
                    c=arr[r--];

                if(t)
                    s+=c;
                else
                    d+=c;

                t=!t;
            }
        }
        System.out.println(s+" "+d);
        so.close();
        
    }
    
}
