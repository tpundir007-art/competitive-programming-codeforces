//499A
import java.util.*;
public class movie
{
    public static void main(String[] args) 
    {
        Scanner so=new Scanner(System.in);
        int t=so.nextInt();//number of best moments
        int skip=so.nextInt();//minutes we can skip
        int cur=1;//current minute =1
        int min=0;//watched
        for(int i=0;i<t;i++)
        {
            int l=so.nextInt();
            int r=so.nextInt();
            if(cur<l)
            {
                cur+=((l-cur)/skip)*skip;//removing the initial boring moments of the movie
            }
            if(cur<=r)
            {
                min+=(r-cur+1);//not l..cuz else we would miss the boring minutes that might occur due to skip constraint
                cur=r+1;//now we will check for the next interesting interval from here
            }

        }
        System.out.println(min);

        so.close();
        
    }
}